package com.lk.student.manager.resource;

// TODO: Auto-generated Javadoc
/**
 * The Interface Resource.
 * @author virtualpathum
 * @param <T> the generic type
 */
public interface Resource<T> {
	
	/**
	 * Gets the resource id.
	 *
	 * @return the resource id
	 */
	T getResourceId();
	
	/**
	 * Sets the resource id.
	 *
	 * @param id the new resource id
	 */
	void setResourceId(T id);
	
}
