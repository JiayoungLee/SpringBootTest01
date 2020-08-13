package com.hqyj.javaSpringBoot.modules.test.service;

import com.hqyj.javaSpringBoot.modules.common.vo.Result;
import com.hqyj.javaSpringBoot.modules.test.entity.Student;

/**
 * author  Jayoung
 * createDate  2020/8/12 0012 20:01
 * version 1.0
 */
public interface StudentService {
    Result<Student> insertStudent(Student student);
}
