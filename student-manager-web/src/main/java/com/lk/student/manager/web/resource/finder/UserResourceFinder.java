package com.lk.student.manager.web.resource.finder;

import com.lk.student.manager.resource.UserResource;

import java.util.List;

public interface UserResourceFinder extends ResourceFinder<UserResource, Long> {

    List<UserResource> findAllUsers();

    UserResource findById(Long id);
}
