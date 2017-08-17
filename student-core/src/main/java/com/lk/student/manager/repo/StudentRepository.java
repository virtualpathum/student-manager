/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.student.manager.entity.StudentEntity;

/**
 * @author virtualpathum
 *
 */
// TODO : Remove below repository methods - extends QueryDslPredicateExecutor and implement predicates
public interface BookingRepository extends JpaRepository<StudentEntity, Long> {

	List<StudentEntity> findByUserId(Long userId);

	List<StudentEntity> findByRoomId(Long roomId);

}
