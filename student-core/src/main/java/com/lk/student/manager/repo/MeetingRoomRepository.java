/**
 * Created On : 11 Aug 2017
/*
 * 
 *//*
package com.lk.student.manager.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lk.student.manager.entity.MeetingRoomEntity;

*//**
 * The Interface MeetingRoomRepository.
 * @author virtualpathum
 *//*
public interface MeetingRoomRepository extends JpaRepository<MeetingRoomEntity, Long> {
	
	@Query("SELECT m from MeetingRoomEntity m where m.id NOT IN"
			+" (SELECT a.id from MeetingRoomEntity a INNER JOIN a.bookings c"
			+" where a.id = c.room.id and c.bookingDateTime = :bookingDateTime)")
	List<MeetingRoomEntity> getAvailableRooms(@Param("bookingDateTime") Date bookingDateTime);
}
*/