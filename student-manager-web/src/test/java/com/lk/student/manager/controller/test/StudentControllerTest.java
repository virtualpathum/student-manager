/**
 * Created On : 18 Aug 2017
 */
package com.lk.student.manager.controller.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.lk.student.manager.controller.StudentController;
import com.lk.student.manager.resource.StudentResource;

/**
 * The Class StudentControllerTest.
 *
 * @author virtualpathum
 */
//TODO:These test cases have develop to test the system configuration and flow of the system
// Need to use Jmokit to mock the services
public class StudentControllerTest extends AbstractControllerTest {
	
	Logger LOG = Logger.getLogger(StudentControllerTest.class);
	
	/** The controller. */
	@Inject
	StudentController controller;
	


	/**
	 * Test.
	 */
	@Test
	public void testCreateStudentMethod() {
		
		//Creating the student
		StudentResource resource = new StudentResource();
		resource.setName("Test Student");
		resource.setAge(17);
		resource.setGrade("Grade 7");
		
		StudentResource createdStudent = controller.createStudent(resource);
		assertNotNull(createdStudent);
		LOG.info("createdStudent : " + createdStudent);

	}
	
	@Test
	public void testlistAllStudentsMethod() {
		
		List<StudentResource> list = controller.listAllStudents();
		assertNotNull(list);
		assertEquals(1, list.size());
		LOG.info("student list : " + list.size());

	}
	
	@Test
	public void testGetStudentMethod() {
		
		StudentResource student = controller.getStudent(1);
		assertNotNull(student);

	}
	
	@Test
	public void testUpdateStudentMethod() {
		
		StudentResource student = controller.getStudent(1);
		student.setName("Name Updated");
		
		StudentResource updatedStudent = controller.updateStudent(1, student);
		assertNotNull(updatedStudent);
		assertEquals("Name Updated", updatedStudent.getName());

	}
	
	//@Test
	public void testDeleteStudentMethod() {
		
		StudentResource beforeDelete = controller.getStudent(1);
		assertNotNull(beforeDelete);
		
		controller.deleteStudent(1);
		
		StudentResource aftterDelete = controller.getStudent(1);
		assertNull(aftterDelete);


	}


}
