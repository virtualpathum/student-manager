/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.web.controller;
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

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.service.BookingService;
import com.lk.meeting.room.web.resource.finder.BookingResourceFinder;

// TODO: Auto-generated Javadoc
/**
 * The Class BookingController.
 *
 * @author virtualpathum
/**
 * @author virtualpathum
 *
 */
@RestController
@RequestMapping("/bookings")
public class BookingController extends AbstractController {
	
	/** The resource finder. */
	private BookingResourceFinder resourceFinder;
	
	/** The service. */
	private BookingService service;
	
	/**
	 * Instantiates a new booking controller.
	 *
	 * @param resourceFinder the resource finder
	 * @param bookingService the booking service
	 */
	@Inject
	public BookingController(BookingResourceFinder resourceFinder, BookingService bookingService){
		this.resourceFinder = resourceFinder;
		this.service = bookingService;
	}
	
	/**
	 * Instantiates a new booking controller.
	 */
	public BookingController(){}
	
	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the booking resource
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public BookingResource findOne(@PathVariable("id") Long id) {
		return resourceFinder.findOne(id);
	}
	
	/**
	 * Save or update.
	 *
	 * @param resource the resource
	 * @return the booking resource
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public BookingResource saveOrUpdate(@RequestBody BookingResource resource) {
		return service.saveOrUpdate(resource);
	}
	
	/**
	 * Cancel.
	 *
	 * @param id the id
	 */
	@RequestMapping(value = "/cancel/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public void cancel(@PathVariable("id") Long id) {
		service.cancelBooking(id);
	}
	
	/**
	 * Find bookings by user.
	 *
	 * @param userId the user id
	 * @return the list
	 */
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<BookingResource> findBookingsByUser(@PathVariable("id") Long userId) {
		return resourceFinder.viewBookingByUserId(userId);
	}
	
	/**
	 * Find bookings by room.
	 *
	 * @param roomId the room id
	 * @return the list
	 */
	@RequestMapping(value = "/room/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<BookingResource> findBookingsByRoom(@PathVariable("id") Long roomId) {
		return resourceFinder.viewBookingByRoomId(roomId);
	}

}
