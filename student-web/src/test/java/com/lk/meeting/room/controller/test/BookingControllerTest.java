/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.controller.test;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.web.controller.BookingController;
import com.lk.meeting.room.web.controller.MeetingRoomController;
import com.lk.meeting.room.web.controller.UserController;

/**
 * The Class BookingControllerTest.
 *
 * @author virtualpathum
 */
//TODO:These test cases have develop to test the system configuration and flow of the system
// Need to use Jmokit to mock the services
public class BookingControllerTest extends AbstractControllerTest {
	
	Logger LOG = Logger.getLogger(BookingControllerTest.class);
	
	/** The controller. */
	@Inject
	BookingController controller;
	
	/** The user controller. */
	@Inject
	UserController userController;
	
	/** The meeting room controller. */
	@Inject
	MeetingRoomController meetingRoomController;

	/**
	 * Test.
	 */
	@Test
	public void testCreateBookingMethod() {
		
		//Creating the user
		UserResource userResource = new UserResource();
		userResource.setUserName("Test");
		userResource.setRole(1);
		userResource.setDepartment("Test Department");
		
		UserResource createdUser = userController.create(userResource);
		assertNotNull(createdUser);
		LOG.info("createdUser : " + createdUser);
		
		
		//Creating the meeting room
		MeetingRoomResource meetingRoomResource = new MeetingRoomResource();
		meetingRoomResource.setNumberOfSeats(10);
		meetingRoomResource.setIsProjectorAvailable(true);
		meetingRoomResource.setRoomLocation("1st Floor");
		
		MeetingRoomResource createdMeetingRoom = meetingRoomController.create(meetingRoomResource);
		
		assertNotNull(createdMeetingRoom);
		LOG.info("createdMeetingRoom : " + createdMeetingRoom);
		
		
		//Creating the booking
		BookingResource resource = new BookingResource();
		
		resource.setUser(createdUser);
		resource.setRoom(createdMeetingRoom);
		resource.setBookingDateTime(new Date());
		
		BookingResource createdBooking = controller.saveOrUpdate(resource);
		
		assertNotNull(createdBooking);
		LOG.info("createdBooking : " + createdBooking);
	}


}
