package com.lk.student.manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.student.manager.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    StudentEntity findByName(String name);

}
