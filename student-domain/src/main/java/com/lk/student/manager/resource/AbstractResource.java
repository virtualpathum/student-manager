/**
 * Created On : 10 Aug 2017
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
	protected T resourceId;
	
	/**
	 * Instantiates a new abstract resource.
	 *
	 * @param resourceId the resource id
	 */
	public AbstractResource(T resourceId){
		this.resourceId = resourceId;
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.resource.Resource#getResourceId()
	 */
	public T getResourceId() {
		return resourceId;
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.resource.Resource#setResourceId(java.lang.Object)
	 */
	public void setResourceId(T resourceId) {
		this.resourceId = resourceId;
	}
}
