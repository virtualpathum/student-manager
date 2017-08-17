/**
 * Created On : 10 Aug 2017
 *//*
package com.lk.meeting.room.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.student.manager.entity.MeetingRoomEntity;
import com.lk.student.manager.mapper.MeetingRoomMapper;
import com.lk.student.manager.repo.MeetingRoomRepository;
import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.service.MeetingRoomService;

*//**
 * The Class RoomServiceImpl.
 * @author virtualpathum
 *//*
@Named("roomService")
public class MeetingRoomServiceImpl implements MeetingRoomService {
	
	*//** The repo. *//*
	@Inject
	MeetingRoomRepository repo;
	
	*//** The mapper. *//*
	@Inject
	MeetingRoomMapper mapper;

	 (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#saveOrUpdate(com.lk.meeting.room.resource.RoomResource)
	 
	@Override
	public MeetingRoomResource saveOrUpdate(MeetingRoomResource resource) {
		MeetingRoomEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

	 (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#findById(java.lang.Long)
	 
	
	public MeetingRoomResource findById(Long Id) {
		MeetingRoomEntity entity = repo.findOne(Id);
		return mapper.asResource(entity);
	}

	 (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#getAvailableRooms(java.util.Date)
	 
	@Override
	public List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime) {
		// TODO Auto-generated method stub
		return null;
	}
}
*/