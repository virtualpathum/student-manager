/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 * @author virtualpathum
 * The Class BookingEntity.
 */
@Entity
@Table(name = "tbl_booking")
public class StudentEntity extends AbstractEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5059693989959757523L;
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** The user. */
	//One user can have multiple bookings
	@NotNull
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	UserEntity user;
	
	/** The room. */
	//One room can have many bookings
	@NotNull
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "room_id", nullable = false)
	MeetingRoomEntity room;
	
	/** The booking date time. */
	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "booking_date_time", nullable = false)
	Date bookingDateTime;

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
	 * Gets the room.
	 *
	 * @return the room
	 */
	public MeetingRoomEntity getRoom() {
		return room;
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
	
	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public UserEntity getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(UserEntity user) {
		this.user = user;
	}

	/**
	 * Sets the room.
	 *
	 * @param room the new room
	 */
	public void setRoom(MeetingRoomEntity room) {
		this.room = room;
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

		if (obj instanceof StudentEntity) {
			StudentEntity other = (StudentEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getId())
				.append(" , user = " + this.getUser().getId())
				.append(" , room = " + this.getRoom().getId()).toString();
				
	}

}
