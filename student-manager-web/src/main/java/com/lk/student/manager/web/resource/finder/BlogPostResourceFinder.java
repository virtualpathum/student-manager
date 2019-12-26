package com.lk.student.manager.web.resource.finder;

import com.lk.student.manager.resource.BlogPostResource;


import java.util.List;

public interface BlogPostResourceFinder extends ResourceFinder<BlogPostResource, Long> {

    List<BlogPostResource> findAllUsers();

    BlogPostResource findById(Long id);
}