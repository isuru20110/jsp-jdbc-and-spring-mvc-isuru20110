package com.university.controller.dao;
import com.university.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
public class courseDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Course> getAllCourses() {
        return jdbcTemplate.query("SELECT * FROM courses",
                (rs, rowNum) -> new Course(
                        rs.getInt("course_id"),
                        rs.getString("name"),
                        rs.getString("instructor"),
                        rs.getInt("credits")));
    }
}
