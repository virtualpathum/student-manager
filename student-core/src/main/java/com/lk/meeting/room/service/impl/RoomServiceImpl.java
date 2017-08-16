/*
 * 
 */
package com.lk.meeting.room.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.student.manager.entity.MeetingRoomEntity;
import com.lk.student.manager.mapper.MeetingRoomMapper;
import com.lk.student.manager.repo.RoomRepository;
import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.service.RoomService;


// TODO: Auto-generated Javadoc
/**
 * The Class RoomServiceImpl.
 */
@Named("roomService")
public class RoomServiceImpl implements RoomService {
	
	/** The repo. */
	@Inject
	RoomRepository repo;
	
	/** The mapper. */
	@Inject
	MeetingRoomMapper mapper;

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#saveOrUpdate(com.lk.meeting.room.resource.RoomResource)
	 */
	@Override
	public MeetingRoomResource saveOrUpdate(MeetingRoomResource resource) {
		MeetingRoomEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#findById(java.lang.Long)
	 */
	@Override
	public MeetingRoomResource findById(Long Id) {
		MeetingRoomEntity entity = repo.findOne(Id);
		return mapper.asResource(entity);
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#getAvailableRooms(java.util.Date)
	 */
	@Override
	public List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
