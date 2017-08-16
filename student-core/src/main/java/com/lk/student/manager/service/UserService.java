/**
 * Created On : 10 Aug 2017
 */
package com.lk.student.manager.service;

import com.lk.student.manager.resource.UserResource;
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
