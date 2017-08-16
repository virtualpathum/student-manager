package com.lk.meeting.room.web.resource.finder;



import java.util.Date;
import java.util.List;

import com.lk.meeting.room.resource.MeetingRoomResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface MeetingRoomResourceFinder.
 */
public interface MeetingRoomResourceFinder extends ResourceFinder<MeetingRoomResource, Long> {
	
	
	/**
	 * Gets the available rooms.
	 *
	 * @param bookingDateTime the booking date time
	 * @return the available rooms
	 */
	List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime);
	
}
