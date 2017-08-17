package com.lk.student.manager.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.lk.student.manager.mapper.StudentMapper;
import com.lk.student.manager.entity.StudentEntity;
import com.lk.student.manager.repo.StudentRepository;
import com.lk.student.manager.resource.StudentResource;
import com.lk.student.manager.service.StudentService;

@Named("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Inject
	private StudentRepository repo;

	@Inject
	private StudentMapper mapper;

	@Override
	public StudentResource saveOrUpdate(StudentResource resource) {
		if (null == resource.getId()) {
			return createStudent(resource);
		} else {
			return updateStudent(resource);
		}
	}

	@Override
	public void delete(Long id) {
		repo.delete(id);
	}

	private StudentResource createStudent(StudentResource resource) {
		StudentEntity entity = mapper.asEntity(resource);

		return mapper.asResource(repo.saveAndFlush(entity));
	}

	private StudentResource updateStudent(StudentResource resource) {
		StudentEntity entity = repo.findOne(resource.getId());
		// TODO: perform optimistic locking check
		entity = mapper.updateEntity(resource, entity);

		entity = repo.saveAndFlush(entity);
		return mapper.updateResource(entity, resource);
	}

}
