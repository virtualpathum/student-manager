package com.lk.student.manager.web.controller;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.service.MeetingRoomService;
import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.web.resource.finder.MeetingRoomResourceFinder;

// TODO: Auto-generated Javadoc
/**
 * The Class MeetingRoomController.
 */
@RestController
@RequestMapping("/rooms")
public class MeetingRoomController extends AbstractController {
	
	/** The resource finder. */
	private MeetingRoomResourceFinder resourceFinder;
	
	/** The service. */
	private MeetingRoomService service;
	
	/**
	 * Instantiates a new meeting room controller.
	 *
	 * @param roomResourceFinder the room resource finder
	 * @param roomService the room service
	 */
	@Inject
	public MeetingRoomController(MeetingRoomResourceFinder roomResourceFinder, MeetingRoomService roomService){
		this.resourceFinder = roomResourceFinder;
		this.service = roomService;
	}
	
	
	/**
	 * Instantiates a new meeting room controller.
	 */
	public MeetingRoomController(){}
	
	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the meeting room resource
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public MeetingRoomResource findOne(@PathVariable("id") Long id) {
		return resourceFinder.findOne(id);
	}
	
	/**
	 * Gets the available rooms.
	 *
	 * @param bookingDateTime the booking date time
	 * @return the available rooms
	 */

	@RequestMapping(value = "/available", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime) {
		return resourceFinder.getAvailableRooms(bookingDateTime);
	}
	
	/**
	 * Creates the.
	 *
	 * @param resource the resource
	 * @return the meeting room resource
	 */

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public MeetingRoomResource create(@RequestBody MeetingRoomResource resource) {
		return service.saveOrUpdate(resource);
	}

}
