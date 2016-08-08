/**
 * 
 */
package com.quoioln.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.quoioln.model.Student;

/**
 * @author vpquoi
 *
 */
@Controller("/")
public class StudentController {
    @RequestMapping(value="/students/view", method = RequestMethod.GET)
//    @RequestMapping("/view)
    public ModelAndView viewStudent(ModelMap model) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("vo phu quoi", 22, 1));
        studentList.add(new Student("nguyen thi cam  nhung", 22, 1));
        model.put("studentList", studentList);
        return new ModelAndView("student", "a", "a");
//        return "student";
    }
    
    @RequestMapping(value="/students/addStudent", method = RequestMethod.GET)
    public String viewStudent(@ModelAttribute("student") Student student, ModelMap model) {
        System.out.println(student.toString());
//        model.put("studentList" ,student);
        return "student";
    }
}
