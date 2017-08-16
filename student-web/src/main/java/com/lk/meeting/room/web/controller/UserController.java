package com.lk.meeting.room.web.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.UserService;
import com.lk.meeting.room.web.resource.finder.UserResourceFinder;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 */
@RestController
@RequestMapping("/users")
public class UserController extends AbstractController {

	/** The resource finder. */
	private UserResourceFinder resourceFinder;
	
	/** The service. */
	private UserService service;
	
	/**
	 * Instantiates a new user controller.
	 *
	 * @param resourceFinder the resource finder
	 * @param service the service
	 */
	@Inject
	public UserController(UserResourceFinder resourceFinder, UserService service ){
		this.resourceFinder = resourceFinder;
		this.service = service;
	}
	
	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the user resource
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public UserResource findOne(@PathVariable("id") Long id) {
		return resourceFinder.findOne(id);
	}
	
	/**
	 * Creates the.
	 *
	 * @param resource the resource
	 * @return the user resource
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public UserResource create(@RequestBody UserResource resource) {
		return service.saveOrUpdate(resource);
	}


}
