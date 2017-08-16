/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.BookingResource;

/**
 * @author virtualpathum
 *
 */
public interface BookingService {
	
	/**
	 * Save or update.
	 *
	 * @param booking the booking
	 * @return the booking resource
	 */
	BookingResource saveOrUpdate(BookingResource booking);
	
	/**
	 * Cancel booking.
	 *
	 * @param bookingId the booking id
	 */
	void cancelBooking(Long bookingId);
	
}
