/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.BookingEntity;
import com.lk.meeting.room.entity.MeetingRoomEntity;
import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

/**
 * The Interface RoomMapper.
 * @author virtualpathum
 */
@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface MeetingRoomMapper {
	
	/**
	 * As resource.
	 *
	 * @param entity the entity
	 * @return the room resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
		MeetingRoomResource asResource(MeetingRoomEntity entity);
	
	/**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the meeting room entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
		MeetingRoomEntity asEntity(MeetingRoomResource resource);
	
	/**
	 * Update resource.
	 *
	 * @param entity the entity
	 * @param resource the resource
	 * @return the meeting room resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	MeetingRoomResource updateResource(MeetingRoomEntity entity, MeetingRoomResource resource);
	
	/**
	 * Update entity.
	 *
	 * @param resource the resource
	 * @param entity the entity
	 * @return the meeting room entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	MeetingRoomEntity updateEntity(MeetingRoomResource resource, MeetingRoomEntity entity);

}
