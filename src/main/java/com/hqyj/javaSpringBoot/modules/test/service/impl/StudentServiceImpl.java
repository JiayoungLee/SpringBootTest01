package com.hqyj.javaSpringBoot.modules.test.service.impl;

import com.hqyj.javaSpringBoot.modules.common.vo.Result;
import com.hqyj.javaSpringBoot.modules.test.entity.Student;
import com.hqyj.javaSpringBoot.modules.test.repository.StudentRepository;
import com.hqyj.javaSpringBoot.modules.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * author  Jayoung
 * createDate  2020/8/12 0012 20:01
 * version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Result<Student> insertStudent(Student student) {
        student.setCreateDate(LocalDateTime.now());
        studentRepository.saveAndFlush(student);
        return new Result<>(Result.ResultStatus.SUCCESS.status,"Insert success.",student);
    }
}
