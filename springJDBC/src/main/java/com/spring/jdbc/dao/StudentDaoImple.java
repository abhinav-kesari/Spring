package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Struct;
import java.util.List;

public class StudentDaoImple implements StudentDao {

    private JdbcTemplate jdbcTemp;

    public JdbcTemplate getJdbcTemp() {
        return jdbcTemp;
    }

    public void setJdbcTemp(JdbcTemplate jdbcTemp) {
        this.jdbcTemp = jdbcTemp;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student() values(?,?,?)";

        //fire query
        int result = jdbcTemp.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "update student set name=? , city=? where id=?";
        int ures = jdbcTemp.update(query,student.getName(),student.getCity(),student.getId());
        return ures;
    }

    @Override
    public int delete(int studendId) {
        String q = "delete from student where id=?";
        int dres = this.jdbcTemp.update(q,studendId);
        return dres;
    }

    @Override
    public Student select(int studentId) {
        String q = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowmapperImpl();
        Student stud =  this.jdbcTemp.queryForObject(q,rowMapper,studentId);
        return stud;
    }

    @Override
    public List<Student> selectAll() {
        String q = "select * from student";
        List<Student> studALL =  this.jdbcTemp.query(q,new RowmapperImpl());
        return studALL;
    }
}
