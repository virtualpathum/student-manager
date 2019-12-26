package com.lk.student.manager.mapper;

import com.lk.student.manager.entity.BlogPostEntity;
import com.lk.student.manager.entity.UserEntity;
import com.lk.student.manager.resource.BlogPostResource;
import com.lk.student.manager.resource.UserResource;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

@Mapper(withIoC = IoC.SPRING)
public interface BlogPostMapper {

    @Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
    BlogPostResource asResource(BlogPostEntity entity);

    @Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
    BlogPostEntity asEntity(BlogPostResource resource);

    @Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
    BlogPostResource updateResource(BlogPostEntity entity, BlogPostResource resource);

    @Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
    BlogPostEntity updateEntity(BlogPostResource resource, BlogPostEntity entity);
}
