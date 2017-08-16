package com.lk.meeting.room.web.resource.finder.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.resource.RoomResource;
import com.lk.meeting.room.service.RoomService;
import com.lk.meeting.room.web.resource.finder.RoomResourceFinder;


@Named
public class RoomResourceFinderImpl implements RoomResourceFinder {

	@Inject
	RoomService roomService;
	
	public RoomResource findOne(Long id) {
		return roomService.findById(id);
	}

}
