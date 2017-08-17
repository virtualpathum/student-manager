/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import java.util.List;

import com.lk.student.manager.resource.BookingResource;


// TODO: Auto-generated Javadoc
/**
 * The Interface BookingResourceFinder.
 *
 * @author virtualpathum
 */
public interface BookingResourceFinder extends ResourceFinder<BookingResource, Long> {

	/**
	 * View booking by room id.
	 *
	 * @param roomId the room id
	 * @return the list
	 */
	List<BookingResource> viewBookingByRoomId(Long roomId);

	/**
	 * View booking by user id.
	 *
	 * @param userId the user id
	 * @return the list
	 */
	List<BookingResource> viewBookingByUserId(Long userId);

}
