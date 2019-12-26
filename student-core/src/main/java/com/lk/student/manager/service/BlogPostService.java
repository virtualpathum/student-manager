package com.lk.student.manager.service;

import com.lk.student.manager.resource.BlogPostResource;


public interface BlogPostService {

    BlogPostResource saveOrUpdate (BlogPostResource resource);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);
}
