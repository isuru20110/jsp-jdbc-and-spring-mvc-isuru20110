package com.university.controller.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Timestamp;
import java.util.Date;
public class RegistrationDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void register(int studentId, int courseId) {
        jdbcTemplate.update("INSERT INTO registrations (student_id, course_id, date) VALUES (?, ?, ?)",
                studentId, courseId, new Timestamp(new Date().getTime()));
    }
}
