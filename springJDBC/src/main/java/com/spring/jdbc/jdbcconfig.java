package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class jdbcconfig {

    @Bean("ds")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("Abhinav221505");
        return ds;
    }
    @Bean("jdbcTemplate")
    public JdbcTemplate getJDBCTemplate(){
        JdbcTemplate jdbc = new JdbcTemplate();
        jdbc.setDataSource(getDataSource());
        return  jdbc;
    }

    @Bean("studentDao")
    public StudentDao getStudentDao(){
        StudentDaoImple studentDao = new StudentDaoImple();
        studentDao.setJdbcTemp(getJDBCTemplate());
        return  studentDao;
    }

}
