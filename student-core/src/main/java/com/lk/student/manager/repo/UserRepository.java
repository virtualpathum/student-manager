/**
 * Created On : 10 Aug 2017
 */
package com.lk.student.manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.student.manager.entity.UserEntity;

/**
 * The Interface UserRepository.
 * @author virtualpathum
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
