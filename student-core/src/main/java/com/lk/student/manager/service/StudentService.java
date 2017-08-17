package com.lk.student.manager.service;

import com.lk.student.manager.resource.StudentResource;


public interface StudentService {
	
	void delete(Long id);

	StudentResource saveOrUpdate (StudentResource resource);
}