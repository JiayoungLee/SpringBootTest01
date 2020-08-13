package com.hqyj.javaSpringBoot.modules.test.controller;

import com.hqyj.javaSpringBoot.modules.common.vo.Result;
import com.hqyj.javaSpringBoot.modules.test.entity.Card;
import com.hqyj.javaSpringBoot.modules.test.entity.Student;
import com.hqyj.javaSpringBoot.modules.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  Jayoung
 * createDate  2020/8/12 0012 20:04
 * version 1.0
 */
@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * http://localhost:667/api/student   -----post
     * {"studentName":"JayoungLee","studentCard":{"cardId":"1"}}
     */
    @PostMapping(value = "/student",consumes = "application/json")
    public Result<Student> insertCard(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
}
