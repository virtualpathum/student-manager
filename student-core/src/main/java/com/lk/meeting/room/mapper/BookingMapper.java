/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.BookingEntity;
import com.lk.meeting.room.resource.BookingResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

/**
 * The Interface BookingMapper.
 * @author virtualpathum
 */
@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface BookingMapper {
	
	/**
	 * As resource.
	 *
	 * @param entity the entity
	 * @return the booking resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	BookingResource asResource(BookingEntity entity);
	
	/**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the booking entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	BookingEntity asEntity(BookingResource resource);
	
	/**
	 * Update resource.
	 *
	 * @param entity the entity
	 * @param resource the resource
	 * @return the booking resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	BookingResource updateResource(BookingEntity entity, BookingResource resource);
	
	/**
	 * Update entity.
	 *
	 * @param resource the resource
	 * @param entity the entity
	 * @return the booking entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	BookingEntity updateEntity(BookingResource resource, BookingEntity entity);
}
