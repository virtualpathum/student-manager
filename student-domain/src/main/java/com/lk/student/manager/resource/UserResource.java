package com.lk.student.manager.resource;

// TODO: Auto-generated Javadoc
/**
 * The Class UserResource.
 * @author virtualpathum
 */
public class UserResource extends AbstractResource<Long> {

	/**
	 * Instantiates a new user resource.
	 *
	 * @param resourceId the resource id
	 */
	public UserResource(Long resourceId) {
		super(resourceId);
	}
	
	/**
	 * Instantiates a new user resource.
	 */
	public UserResource(){
		super(null);
	}
	
	/** The user name. */
	private String userName;

	/** The role. */
	private Integer role;
	
	/** The department. */
	private String department;

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	} 
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getResourceId())
				.append(", userName = " + this.getUserName()).toString();
				
	}
	

}
