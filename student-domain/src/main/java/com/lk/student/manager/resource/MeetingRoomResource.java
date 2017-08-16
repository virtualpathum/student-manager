/**
 * Created On : 10 Aug 2017
 *//*
package com.lk.student.manager.resource;
*//**
 * The Class MeetingRoomResource.
 * @author virtualpathum
 *//*
public class MeetingRoomResource extends AbstractResource<Long> {

	public MeetingRoomResource(Long resourceId) {
		super(resourceId);
	}
	*//**
	 * Instantiates a new meeting room resource.
	 *//*
	// For testing purpose only
	public MeetingRoomResource(){
		super(null);
	}

	*//** The is projector available. *//*
	private Boolean isProjectorAvailable;
	
	*//** The number of seats. *//*
	private Integer numberOfSeats;
	
	*//** The room location. *//*
	private String roomLocation;

	*//**
	 * Gets the checks if is projector available.
	 *
	 * @return the checks if is projector available
	 *//*
	public Boolean getIsProjectorAvailable() {
		return isProjectorAvailable;
	}

	*//**
	 * Sets the checks if is projector available.
	 *
	 * @param isProjectorAvailable the new checks if is projector available
	 *//*
	public void setIsProjectorAvailable(Boolean isProjectorAvailable) {
		this.isProjectorAvailable = isProjectorAvailable;
	}

	*//**
	 * Gets the number of seats.
	 *
	 * @return the number of seats
	 *//*
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	*//**
	 * Sets the number of seats.
	 *
	 * @param numberOfSeats the new number of seats
	 *//*
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	*//**
	 * Gets the room location.
	 *
	 * @return the room location
	 *//*
	public String getRoomLocation() {
		return roomLocation;
	}

	*//**
	 * Sets the room location.
	 *
	 * @param roomLocation the new room location
	 *//*
	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}
	 (non-Javadoc)
	 * @see java.lang.Object#toString()
	 
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getResourceId())
				.append(" , isProjectorAvailable = " + this.getIsProjectorAvailable())
				.append(" , numberOfSeats = " + this.getNumberOfSeats()).toString();
				
	}
	
	
}
*/