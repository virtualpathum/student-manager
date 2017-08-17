/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.student.manager.entity.StudentEntity;
import com.lk.student.manager.mapper.StudentMapper;
import com.lk.student.manager.repo.StudentRepository;
import com.lk.student.manager.resource.StudentResource;



/**
 * The Class BookingResourceFinderImpl.
 * @author virtualpathum
 */
@Named("studentResourceFinder")
public class StudentResourceFinderImpl extends AbstractResourceFinder<StudentResource, StudentEntity, StudentRepository, Long> implements StudentResourceFinder {
	/** The mapper. */
	private StudentMapper mapper;
	
	@Inject
	public StudentResourceFinderImpl(StudentRepository repo, StudentMapper mapper) {
		super(repo);
		this.mapper = mapper;
	}

	@Override
	protected StudentResource toResource(StudentEntity entity) {
		
		return mapper.asResource(entity);
	}

	@Override
	public StudentResource findById(Long id) {

		StudentEntity entity = repo.findOne(id);
		return mapper.asResource(entity);
		
	}

	@Override
	public List<StudentResource> findAllStudents() {
		List<StudentEntity> list = repo.findAll();
		return toResources(list);

	}
	
}
