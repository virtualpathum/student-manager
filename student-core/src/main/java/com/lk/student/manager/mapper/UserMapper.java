/**
 * Created On : 10 Aug 2017
 *//*
package com.lk.student.manager.mapper;

import com.lk.student.manager.entity.MeetingRoomEntity;
import com.lk.student.manager.entity.UserEntity;
import com.lk.student.manager.resource.MeetingRoomResource;
import com.lk.student.manager.resource.UserResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

*//**
 * The Interface UserMapper.
 * @author virtualpathum
 *//*
@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface UserMapper {

	*//**
	 * As resource.
	 *
	 * @param entity the entity
	 * @return the user resource
	 *//*
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	UserResource asResource(UserEntity entity);

	*//**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the user entity
	 *//*
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	UserEntity asEntity(UserResource resource);

	*//**
	 * Update resource.
	 *
	 * @param entity the entity
	 * @param resource the resource
	 * @return the user resource
	 *//*
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	UserResource updateResource(UserEntity entity, UserResource resource);
	
	*//**
	 * Update entity.
	 *
	 * @param resource the resource
	 * @param entity the entity
	 * @return the user entity
	 *//*
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	UserEntity updateEntity(UserResource resource, UserEntity entity);
}
*/