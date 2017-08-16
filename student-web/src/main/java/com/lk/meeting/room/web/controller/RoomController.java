package com.lk.meeting.room.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.resource.RoomResource;
import com.lk.meeting.room.service.RoomService;
import com.lk.meeting.room.web.resource.finder.RoomResourceFinder;

@RestController
@RequestMapping("/rooms")
public class RoomController extends AbstractController {
	
	private RoomResourceFinder roomResourceFinder;
	
	@Autowired
	private RoomService roomService;
	
/*	@Inject
	public RoomController(StudentResourceFinder strudentResourceFinder, RoomService roomService){
		this.strudentResourceFinder = strudentResourceFinder;
		this.roomService = roomService;
	}*/
	
	
	public RoomController(){
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public RoomResource findOne(@PathVariable("id") Long id) {
		return roomResourceFinder.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public RoomResource create(@RequestBody RoomResource resource) {
		System.out.println("roomService///"+roomService);
		return roomService.saveOrUpdate(resource);
	}

}
