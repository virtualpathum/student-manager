package com.lk.student.manager.repo;

import com.lk.student.manager.entity.StudentEntity;
import com.lk.student.manager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByFirstName(String firstName);
}
