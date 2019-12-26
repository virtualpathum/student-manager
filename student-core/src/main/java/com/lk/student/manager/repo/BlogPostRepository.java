package com.lk.student.manager.repo;

import com.lk.student.manager.entity.BlogPostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPostEntity, Long> {
}
