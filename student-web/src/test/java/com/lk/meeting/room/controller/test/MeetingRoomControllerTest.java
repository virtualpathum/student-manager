package com.lk.meeting.room.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.web.controller.MeetingRoomController;

// TODO: Auto-generated Javadoc
/**
 * The Class MeetingRoomControllerTest.
 */
//TODO:These test cases have develop to test the system configuration and flow of the system
//Need to use Jmokit to mock the services
public class MeetingRoomControllerTest extends AbstractControllerTest {
	
	@Inject
	MeetingRoomController meetingRoomController;
	
	/**
	 * Test.
	 */
	@Test
	public void testCreateRoomMethod() {
	
		MeetingRoomResource resource = new MeetingRoomResource();
		resource.setIsProjectorAvailable(true);
		resource.setNumberOfSeats(10);
		resource.setRoomLocation("1st Floor");
		
		MeetingRoomResource created = meetingRoomController.create(resource);
		assertNotNull(created);
		
		
	}

	@Test
	public void testGetAvailableRoomsMethod() {
				
		List<MeetingRoomResource> list = meetingRoomController.getAvailableRooms(new Date());
		assertEquals(1,list.size());
	}
}
