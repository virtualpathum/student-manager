/**
 * Created On : 11 Aug 2017
 */
package com.lk.student.manager.web.resource.finder;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lk.student.manager.resource.AbstractResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface ResourceFinder.
 * @author virtualpathum
 * @param <R> the generic type
 * @param <ID> the generic type
 */
public interface ResourceFinder <R extends AbstractResource<? extends Serializable>, ID extends Serializable> {
	
	/**
	 * Find one.
	 *
	 * @param id the id
	 * @return the r
	 */
	R findOne(ID id);
	
	/**
	 * Find all.
	 *
	 * @param pageable the pageable
	 * @return the page
	 */
	Page<R> findAll(Pageable pageable);

	
	
}
