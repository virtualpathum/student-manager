/**
 * Created On : 17 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import java.util.List;


import com.lk.student.manager.resource.StudentResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentResourceFinder.
 * @author virtualpathum
 */
public interface StudentResourceFinder extends ResourceFinder<StudentResource, Long> {

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the student resource
	 */
	StudentResource findById(Long id);

	/**
	 * Find all students.
	 *
	 * @return the list
	 */
	List<StudentResource> findAllStudents();

}
