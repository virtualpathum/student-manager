package com.lk.student.manager.service.impl;

import com.lk.student.manager.entity.UserEntity;
import com.lk.student.manager.mapper.UserMapper;
import com.lk.student.manager.repo.UserRepository;
import com.lk.student.manager.resource.UserResource;
import com.lk.student.manager.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

@Named("userService")
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository repo;

    @Inject
    UserMapper mapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserResource saveOrUpdate(UserResource resource) {
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

    private UserResource createStudent(UserResource resource) {
        UserEntity entity = mapper.asEntity(resource);

        return mapper.asResource(repo.saveAndFlush(entity));
    }

    private UserResource updateStudent(UserResource resource) {
        UserEntity entity = repo.findOne(resource.getId());
        // TODO: perform optimistic locking check
        entity = mapper.updateEntity(resource, entity);

        entity = repo.saveAndFlush(entity);
        return mapper.updateResource(entity, resource);
    }
}
