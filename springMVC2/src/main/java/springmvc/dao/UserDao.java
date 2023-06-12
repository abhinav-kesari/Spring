package springmvc.dao;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springmvc.model.User;
@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(User user){
        System.out.println("UserDao save ");
        int id  =(Integer) hibernateTemplate.save(user);
        System.out.println("UserDao save the id = "+id + "into database");
        return id;
    }
}
