package com.narendhar.JdbcDemoProject.repository;

import com.narendhar.JdbcDemoProject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//@Component
@Repository
public class StudentRepo {
    private  JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s){
        String sql="insert into student(name,age) values(?,?)";
        int rows=jdbc.update(sql,s.getName(),s.getAge());
        System.out.println("details saved and "+rows+" effected");
    }
    public List<Student> findAll(){
        String sql="select * from student";
        return jdbc.query(sql, (rs, rowNum) -> {
            Student sobj = new Student();
           sobj.setName(rs.getString("name"));
           sobj.setAge(rs.getInt("age"));
            return sobj;
        });
        }
}
