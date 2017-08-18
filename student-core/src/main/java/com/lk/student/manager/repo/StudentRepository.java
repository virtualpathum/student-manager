package com.lk.student.manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.student.manager.entity.StudentEntity;

// TODO: Auto-generated Javadoc
/**
 * The Interface StudentRepository.
 */
//TODO : Remove below repository methods - extends QueryDslPredicateExecutor and implement predicates
public interface StudentRepository extends AbstractRepository<StudentEntity, Long> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the student entity
     */
    StudentEntity findByName(String name);

}
