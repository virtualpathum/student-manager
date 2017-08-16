/*
 * 
 */
package com.lk.meeting.room.service;

import java.util.Date;
import java.util.List;

import com.lk.meeting.room.resource.MeetingRoomResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface RoomService.
 */
public interface RoomService {
	
	/**
	 * Find by id.
	 *
	 * @param Id the id
	 * @return the room resource
	 */
	MeetingRoomResource findById(Long Id);
	
	/**
	 * Save or update.
	 *
	 * @param resource the resource
	 * @return the room resource
	 */
	MeetingRoomResource saveOrUpdate (MeetingRoomResource resource);
	
	List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime);
 
}
