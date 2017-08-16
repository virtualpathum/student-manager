/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.entity.UserEntity;

/**
 * The Interface UserRepository.
 * @author virtualpathum
 */
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
