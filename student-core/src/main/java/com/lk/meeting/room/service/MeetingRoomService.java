/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.service;

import java.util.Date;
import java.util.List;

import com.lk.meeting.room.resource.MeetingRoomResource;

/**
 * The Interface RoomService.
 * @author virtualpathum
 */
public interface MeetingRoomService {
		
	/**
	 * Save or update.
	 *
	 * @param resource the resource
	 * @return the room resource
	 */
	MeetingRoomResource saveOrUpdate (MeetingRoomResource resource);

	List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime);
 
}
