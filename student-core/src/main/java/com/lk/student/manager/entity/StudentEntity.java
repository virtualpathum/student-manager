package com.lk.student.manager.entity;

//import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tbl_student")
public class StudentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9157969392013803110L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(name="student_name", nullable=false)
	private String name;

	@Column(name="student_age", nullable=false)
	private Integer age;

	@Column(name="student_grade", nullable=false)
	private String grade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

		if (obj instanceof StudentEntity) {
			StudentEntity other = (StudentEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getId())
				.append(" , name = " + this.getName())
				.append(" , age = " + this.getAge())
				.append(" , grade = " + this.getGrade()).toString();
				
	}


}
