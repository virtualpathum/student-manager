/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class MeetingRoomEntity.
 * @author virtualpathum
 */
@Entity
@Table(name = "tbl_meeting_room")
public class MeetingRoomEntity extends AbstractEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -302737431134590617L;
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** The is projector available. */
	@Column(name="is_projector_available")
	private Boolean isProjectorAvailable;
	
	/** The number of seats. */
	@Column(name="number_of_seats")
	private Integer numberOfSeats;
	
	/** The room location. */
	@Column(name="room_location")
	private String roomLocation;
	
	/** The booking. */
	//One meeting room can have many bookings
	@NotNull
	@OneToMany(mappedBy="room", fetch = FetchType.LAZY)
	List<BookingEntity> bookings = new ArrayList<BookingEntity>();
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the checks if is projector available.
	 *
	 * @return the checks if is projector available
	 */
	public Boolean getIsProjectorAvailable() {
		return isProjectorAvailable;
	}

	/**
	 * Sets the checks if is projector available.
	 *
	 * @param isProjectorAvailable the new checks if is projector available
	 */
	public void setIsProjectorAvailable(Boolean isProjectorAvailable) {
		this.isProjectorAvailable = isProjectorAvailable;
	}

	/**
	 * Gets the number of seats.
	 *
	 * @return the number of seats
	 */
	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * Sets the number of seats.
	 *
	 * @param numberOfSeats the new number of seats
	 */
	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * Gets the room location.
	 *
	 * @return the room location
	 */
	public String getRoomLocation() {
		return roomLocation;
	}

	/**
	 * Sets the room location.
	 *
	 * @param roomLocation the new room location
	 */
	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}
	
	/**
	 * @return the bookings
	 */
	public List<BookingEntity> getBookings() {
		return bookings;
	}

	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(List<BookingEntity> bookings) {
		this.bookings = bookings;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
			return Objects.hash(this.id);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (obj instanceof MeetingRoomEntity) {
			MeetingRoomEntity other = (MeetingRoomEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getId())
				.append(" , isProjectorAvailable = " + this.getIsProjectorAvailable())
				.append(" , numberOfSeats = " + this.getNumberOfSeats()).toString();
				
	}
	

} 
