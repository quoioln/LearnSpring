/**
 * 
 */
package com.quoioln.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quoioln.model.Student;
import com.quoioln.model.StudentData;

/**
 * @author vpquoi
 *
 */
@Controller("/")
public class StudentController {
    @RequestMapping(value="/students/view", method = RequestMethod.GET)
//    @RequestMapping("/view)
    public String viewStudent(ModelMap model) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("vo phu quoi", 22, 1));
        studentList.add(new Student("nguyen thi cam  nhung", 22, 1));
        model.put("studentList", studentList);
        Student student = new Student();
        model.put("student", student);
//        return new ModelAndView("student", "a", "abc");
        return "student";
    }
    
    @RequestMapping(value="/students/addStudent", method = RequestMethod.GET)
    public String viewStudent(@ModelAttribute("student") Student student, ModelMap model) {
        System.out.println("age 1:" + student.getAge());
        model.put("student", student);
        return "student";
    }
}
