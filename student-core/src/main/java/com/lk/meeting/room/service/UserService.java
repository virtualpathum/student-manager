/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.UserResource;
/**
 * The Interface UserService.
 * @author virtualpathum
 */
public interface UserService {
	/**
	 * Save or update.
	 *
	 * @param resource the resource
	 * @return the user resource
	 */
	UserResource saveOrUpdate (UserResource resource);

}
