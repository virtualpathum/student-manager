// GENERATED BY S3LM4
package com.lk.student.manager.mapper;


@org.springframework.stereotype.Service("")
public final class StudentMapperSelmaGeneratedClass
    implements StudentMapper {

  @Override
  public final com.lk.student.manager.resource.StudentResource asResource(com.lk.student.manager.entity.StudentEntity inStudentEntity) {
    com.lk.student.manager.resource.StudentResource out = null;
    if (inStudentEntity != null) {
      out = new com.lk.student.manager.resource.StudentResource();
      out.setAge(inStudentEntity.getAge());
      out.setGrade(inStudentEntity.getGrade());
      out.setId(inStudentEntity.getId());
      out.setName(inStudentEntity.getName());
    }
    return out;
  }


  @Override
  public final com.lk.student.manager.entity.StudentEntity asEntity(com.lk.student.manager.resource.StudentResource inStudentResource) {
    com.lk.student.manager.entity.StudentEntity out = null;
    if (inStudentResource != null) {
      out = new com.lk.student.manager.entity.StudentEntity();
      out.setAge(inStudentResource.getAge());
      out.setGrade(inStudentResource.getGrade());
      out.setId(inStudentResource.getId());
      out.setName(inStudentResource.getName());
    }
    return out;
  }


  @Override
  public final com.lk.student.manager.resource.StudentResource updateResource(com.lk.student.manager.entity.StudentEntity inStudentEntity, com.lk.student.manager.resource.StudentResource out) {
    if (inStudentEntity != null) {
      if (out == null) {
        out = new com.lk.student.manager.resource.StudentResource();
      }
      out.setAge(inStudentEntity.getAge());
      out.setGrade(inStudentEntity.getGrade());
      out.setId(inStudentEntity.getId());
      out.setName(inStudentEntity.getName());
    }
    if (fr.xebia.extras.selma.SelmaUtils.areNull(inStudentEntity)) {
      out = null;
    }
    return out;
  }


  @Override
  public final com.lk.student.manager.entity.StudentEntity updateEntity(com.lk.student.manager.resource.StudentResource inStudentResource, com.lk.student.manager.entity.StudentEntity out) {
    if (inStudentResource != null) {
      if (out == null) {
        out = new com.lk.student.manager.entity.StudentEntity();
      }
      out.setAge(inStudentResource.getAge());
      out.setGrade(inStudentResource.getGrade());
      out.setId(inStudentResource.getId());
      out.setName(inStudentResource.getName());
    }
    if (fr.xebia.extras.selma.SelmaUtils.areNull(inStudentResource)) {
      out = null;
    }
    return out;
  }



  /**
   * Single constructor
   */
  public StudentMapperSelmaGeneratedClass() {
  }

}