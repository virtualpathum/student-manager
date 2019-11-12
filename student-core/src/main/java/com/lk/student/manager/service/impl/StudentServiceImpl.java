/**
 * Created On : 17 Aug 2017
 */
package com.lk.student.manager.service.impl;


import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.lk.student.manager.mapper.StudentMapper;
import com.lk.student.manager.entity.StudentEntity;
import com.lk.student.manager.repo.StudentRepository;
import com.lk.student.manager.resource.StudentResource;
import com.lk.student.manager.service.StudentService;

// TODO: Auto-generated Javadoc
/**
 * @author virtualpathum
 * The Class StudentServiceImpl.
 */
@Named("studentService")
public class StudentServiceImpl implements StudentService {

	/** The repo. */
	@Inject
	private StudentRepository repo;

	/** The mapper. */
	@Inject
	private StudentMapper mapper;

	/* (non-Javadoc)
	 * @see com.lk.student.manager.service.StudentService#saveOrUpdate(com.lk.student.manager.resource.StudentResource)
	 */
	@Override
	@Transactional(rollbackFor = Exception.class)
	public StudentResource saveOrUpdate(StudentResource resource) {
		if (null == resource.getId()) {
			return createStudent(resource);
		} else {
			return updateStudent(resource);
		}
	}

	/* (non-Javadoc)
	 * @see com.lk.student.manager.service.StudentService#delete(java.lang.Long)
	 */
	@Override
	public void delete(Long id) {
		repo.delete(id);
	}

	/**
	 * Creates the student.
	 *
	 * @param resource the resource
	 * @return the student resource
	 */
	private StudentResource createStudent(StudentResource resource) {
		StudentEntity entity = mapper.asEntity(resource);

		return mapper.asResource(repo.saveAndFlush(entity));
	}

	/**
	 * Update student.
	 *
	 * @param resource the resource
	 * @return the student resource
	 */
	private StudentResource updateStudent(StudentResource resource) {
		StudentEntity entity = repo.findOne(resource.getId());
		// TODO: perform optimistic locking check
		entity = mapper.updateEntity(resource, entity);

		entity = repo.saveAndFlush(entity);
		return mapper.updateResource(entity, resource);
	}

}
