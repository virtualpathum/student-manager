/**
 * Created On : 17 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import com.lk.student.manager.resource.StudentResource;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentResourceFinder.
 * @author virtualpathum
 */
public interface StudentResourceFinder extends ResourceFinder<StudentResource, Long> {

    List<StudentResource> findAllStudents();

    StudentResource findById(Long id);

}
