/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.mapper;

import com.lk.student.manager.entity.StudentEntity;
import com.lk.student.manager.resource.BookingResource;

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
	BookingResource asResource(StudentEntity entity);
	
	/**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the booking entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	StudentEntity asEntity(BookingResource resource);
	
	/**
	 * Update resource.
	 *
	 * @param entity the entity
	 * @param resource the resource
	 * @return the booking resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	BookingResource updateResource(StudentEntity entity, BookingResource resource);
	
	/**
	 * Update entity.
	 *
	 * @param resource the resource
	 * @param entity the entity
	 * @return the booking entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	StudentEntity updateEntity(BookingResource resource, StudentEntity entity);
}
