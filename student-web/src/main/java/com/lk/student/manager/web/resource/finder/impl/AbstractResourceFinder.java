package com.lk.student.manager.web.resource.finder.impl;
/**
 * Created On : 11 Aug 2017
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.student.manager.resource.AbstractResource;
import com.lk.student.manager.web.resource.finder.ResourceFinder;

/**
 * @author virtualpathum
 *
 */
// Not compulsory for resource finder to extends this class
public abstract class AbstractResourceFinder<R extends AbstractResource<ID>, E,
											 S extends JpaRepository<E, ID>,
											 ID extends Serializable>
											 implements ResourceFinder<R, ID> {

	/** The repo. */
	protected S repo;
  

	/**
	 * Instantiates a new abstract resource finder.
	 *
	 * @param repo the repo
	 */
	public AbstractResourceFinder(S repo) {
		this.repo = repo;
	
	}

	/** {@inheritDoc} */

	public R findOne(ID id) {
		E entity = repo.findOne(id);
		return toResource(entity);
	}

	

	/** {@inheritDoc} */
	public Page<R> findAll(Pageable pageable) {
		Page<E> page = repo.findAll(pageable);
		return toResources(page, pageable);
	}

	/**
	 * To resources.
	 *
	 * @param entities the entities
	 * @param pageable the pageable
	 * @return the page
	 */
	protected Page<R> toResources(
			Page<E> entities, Pageable pageable) {

		List<R> resources = toResources(entities.getContent());
		return new PageImpl<R>(resources, pageable, entities.getTotalElements());
	}


	/**
	 * To resources.
	 *
	 * @param entities the entities
	 * @return the list
	 */
	protected List<R> toResources(List<E> entities) {
		if (entities.isEmpty()) { return Collections.emptyList(); }

		List<R> resources = new ArrayList<R>(entities.size());
		for (E entity : entities) {
			resources.add(_toResource(entity));
		}

		return resources;
	}

	/**
	 * To resource.
	 *
	 * @param entity the entity
	 * @return the r
	 */
	protected R _toResource(E entity) {
		return null == entity?null:toResource(entity);
	}

	/**
	 * To resource.
	 *
	 * @param entity the entity
	 * @return the r
	 */
	protected abstract R toResource(E entity);

}
