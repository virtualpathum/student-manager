/**
 * Created On : 10 Aug 2017
 */
package com.lk.meeting.room.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class UserEntity.
 * @author virtualpathum
 */
@Entity
@Table(name = "tbl_user")
public class UserEntity extends AbstractEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8293376976363606000L;
	
	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	/** The user name. */
	@Column(name="user_name")
	private String userName;
	
	/** The role. */
	@Column(name="role")
	private Integer role;
	
	/** The department. */
	@Column(name="department")
	private String department; 
			
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
			return Objects.hash(this.id);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (obj instanceof UserEntity) {
			UserEntity other = (UserEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getId())
				.append(", userName = " + this.getUserName()).toString();
				
	}

}
