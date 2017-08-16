package com.lk.student.manager.web.resource.finder.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.service.RoomService;
import com.lk.student.manager.resource.RoomResource;
import com.lk.student.manager.web.resource.finder.RoomResourceFinder;


@Named
public class RoomResourceFinderImpl implements RoomResourceFinder {

	@Inject
	RoomService roomService;
	
	public RoomResource findOne(Long id) {
		return roomService.findById(id);
	}

}
