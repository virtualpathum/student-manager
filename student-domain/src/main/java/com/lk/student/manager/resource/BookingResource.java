/**
 * Created On : 10 Aug 2017
 */
package com.lk.student.manager.resource;

import java.util.Date;
/**
 * The Class BookingResource.
 * @author virtualpathum
 */
public class BookingResource extends AbstractResource<Long> {
	
	/**
	 * Instantiates a new booking resource.
	 *
	 * @param resourceId the resource id
	 */
	public BookingResource(Long resourceId) {
		super(resourceId);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new booking resource.
	 */
	// For testing purpose only
	public BookingResource(){
		super(null);
	}

	/** The user. */
	UserResource user;
	
	/** The room. */
	MeetingRoomResource room;
	
	/** The booking date time. */
	Date bookingDateTime;

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public UserResource getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(UserResource user) {
		this.user = user;
	}

	/**
	 * Gets the room.
	 *
	 * @return the room
	 */
	public MeetingRoomResource getRoom() {
		return room;
	}

	/**
	 * Sets the room.
	 *
	 * @param room the new room
	 */
	public void setRoom(MeetingRoomResource room) {
		this.room = room;
	}

	/**
	 * Gets the booking date time.
	 *
	 * @return the booking date time
	 */
	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	/**
	 * Sets the booking date time.
	 *
	 * @param bookingDateTime the new booking date time
	 */
	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getResourceId())
				.append(" , user = " + this.getUser().getResourceId())
				.append(" , room = " + this.getRoom().getResourceId()).toString();
				
	}
	
}
