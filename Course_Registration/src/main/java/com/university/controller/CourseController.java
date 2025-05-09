package com.university.controller;
import com.university.dao.CourseDAO;
import com.university.dao.RegistrationDAO;
import com.university.model.Course;
import com.university.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

public class CourseController {
    @Autowired
    private CourseDAO courseDAO;

    @Autowired
    private RegistrationDAO registrationDAO;

    @GetMapping("/courses")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseDAO.getAllCourses());
        return "courses";
    }

    @PostMapping("/register/{courseId}")
    public String registerCourse(@PathVariable int courseId, HttpSession session) {
        Student student = (Student) session.getAttribute("student");
        if (student != null) {
            registrationDAO.register(student.getStudentId(), courseId);
            return "success";
        }
        return "redirect:/logn";
    }
}
