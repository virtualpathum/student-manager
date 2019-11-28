package com.lk.student.manager.service;

import com.lk.student.manager.resource.StudentResource;
import com.lk.student.manager.resource.UserResource;

public interface UserService {

    UserResource saveOrUpdate (UserResource resource);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);
}
