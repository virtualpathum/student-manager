/*
 * 
 */
package com.lk.meeting.room.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lk.meeting.room.entity.MeetingRoomEntity;

/**
 * The Interface RoomRepository.
 */
public interface RoomRepository extends JpaRepository<MeetingRoomEntity, Long> {
	
	@Query("SELECT MeetingRoomEntity m from BookingEntity b where m.id = b.room.id and b.bookingDateTime = ? ")
	List<MeetingRoomEntity> getAvailableRooms(Date bookingDateTime);

}
