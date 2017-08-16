package com.lk.student.manager.web.resource.finder.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.mapper.UserMapper;
import com.lk.meeting.room.repo.UserRepository;
import com.lk.student.manager.resource.UserResource;
import com.lk.student.manager.web.resource.finder.UserResourceFinder;

// TODO: Auto-generated Javadoc
/**
 * The Class UserResourceFinderImpl.
 */
@Named("userResourceFinder")
public class UserResourceFinderImpl extends AbstractResourceFinder<UserResource, UserEntity, UserRepository, Long> implements UserResourceFinder {

	/** The mapper. */
	private UserMapper mapper;
	
	/**
	 * Instantiates a new user resource finder impl.
	 *
	 * @param repo the repo
	 * @param mapper the mapper
	 */
	@Inject
	public UserResourceFinderImpl(UserRepository repo, UserMapper mapper) {
		super(repo);
		this.mapper = mapper;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.web.resource.finder.impl.AbstractResourceFinder#toResource(java.lang.Object)
	 */
	@Override
	protected UserResource toResource(UserEntity entity) {
		// TODO Auto-generated method stub
		return mapper.asResource(entity);
	}



}
