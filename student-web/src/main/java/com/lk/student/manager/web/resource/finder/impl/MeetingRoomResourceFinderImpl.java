package com.lk.student.manager.web.resource.finder.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.lk.meeting.room.entity.MeetingRoomEntity;
import com.lk.meeting.room.mapper.MeetingRoomMapper;
import com.lk.meeting.room.repo.MeetingRoomRepository;
import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.web.resource.finder.MeetingRoomResourceFinder;


// TODO: Auto-generated Javadoc
/**
 * The Class MeetingRoomResourceFinderImpl.
 */
@Named("roomResourceFinder")
public class MeetingRoomResourceFinderImpl extends AbstractResourceFinder<MeetingRoomResource, MeetingRoomEntity, MeetingRoomRepository, Long> implements MeetingRoomResourceFinder {

	/** The mapper. */
	private MeetingRoomMapper mapper;
	
	/**
	 * Instantiates a new meeting room resource finder impl.
	 *
	 * @param repo the repo
	 * @param mapper the mapper
	 */
	@Inject
	public MeetingRoomResourceFinderImpl(MeetingRoomRepository repo, MeetingRoomMapper mapper) {
		super(repo);
		this.mapper = mapper;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.web.resource.finder.impl.AbstractResourceFinder#toResource(java.lang.Object)
	 */
	@Override
	protected MeetingRoomResource toResource(MeetingRoomEntity entity) {
		// TODO Auto-generated method stub
		return mapper.asResource(entity);
	}

	
	
	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#getAvailableRooms(java.util.Date)
	 */
	
	@Transactional(readOnly = true)
	public List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime) {
		List<MeetingRoomEntity> list = repo.getAvailableRooms(bookingDateTime);
		return toResources(list);
	}

}
