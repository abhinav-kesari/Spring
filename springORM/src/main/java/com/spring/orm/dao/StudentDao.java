package com.spring.orm.dao;

import com.spring.orm.entity.Student;
import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public StudentDao() {
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    @Transactional
    public int insert(Student student){

        int i =(int) hibernateTemplate.save(student);
        return i;

    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
