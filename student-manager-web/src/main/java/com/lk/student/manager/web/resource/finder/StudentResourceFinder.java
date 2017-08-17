/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import java.util.List;


import com.lk.student.manager.resource.StudentResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentResourceFinder.
 *
 * @author virtualpathum
 */
public interface StudentResourceFinder extends ResourceFinder<StudentResource, Long> {

	StudentResource findById(Long id);

	List<StudentResource> findAllStudents();

}
