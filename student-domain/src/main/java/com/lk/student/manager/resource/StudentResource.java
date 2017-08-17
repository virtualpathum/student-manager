/**
 * Created On : 10 Aug 2017
 */
package com.lk.student.manager.resource;

/**
 * The Class StudentResource.
 * @author virtualpathum
 */
public class StudentResource extends AbstractResource<Long> {
	
	/**
	 * Instantiates a new student resource.
	 *
	 * @param resourceId the resource id
	 */
	public StudentResource(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new student resource.
	 */
	// For testing purpose only
	public StudentResource(){
		super(null);
	}

	private String name;


	private Integer age;


	private String grade;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getId())
				.append("name = " + this.getName())
				.append("age = " + this.getAge())
				.append("grade = " + this.getGrade())
				.toString();
				
	}
	
}
