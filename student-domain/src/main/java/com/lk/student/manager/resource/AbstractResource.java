/**
 * Created On : 16 Aug 2017
 */
package com.lk.student.manager.resource;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractResource.
 * @author virtualpathum
 * @param <T> the generic type
 */
public abstract class AbstractResource<T extends Serializable> implements Resource<T> {
	
	/** The resource id. */
	protected T id;
	
	/**
	 * Instantiates a new abstract resource.
	 *
	 * @param resourceId the resource id
	 */
	public AbstractResource(T id){
		this.id = id;
	}

	
	/* (non-Javadoc)
	 * @see com.lk.student.manager.resource.Resource#getId()
	 */
	public T getId() {
		return id;
	}

	
	/* (non-Javadoc)
	 * @see com.lk.student.manager.resource.Resource#setId(java.lang.Object)
	 */
	public void setId(T id) {
		this.id = id;
	}
}
