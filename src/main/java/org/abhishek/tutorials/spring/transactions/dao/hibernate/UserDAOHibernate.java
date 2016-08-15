package org.abhishek.tutorials.spring.transactions.dao.hibernate;

import java.lang.reflect.Field;
import java.util.List;

import org.abhishek.tutorials.spring.transactions.dao.UserDAO;
import org.abhishek.tutorials.spring.transactions.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ObjectRetrievalFailureException;

/**
 * This class interacts with Spring and Hibernate to save and retrieve User
 * objects.
 */
public class UserDAOHibernate implements UserDAO {
    private static final Logger log = LoggerFactory.getLogger(UserDAOHibernate.class);
    private SessionFactory factory;

    @SuppressWarnings("rawtypes")
    public List getUsers() {
        Session session = getFactory().getCurrentSession();
        Query query = session.createQuery("from User");
        return query.list();
    }

    public User getUser(Integer id) {
        Session session = getFactory().getCurrentSession();
        log.debug("session: {}", session);
        log.debug("id: {}", id);
        User user = (User) session.get(User.class, id);
        if (user == null) {
            throw new ObjectRetrievalFailureException(User.class, id);
        }
        return user;
    }

    public void saveUser(User user) {
        utility(Thread.currentThread());
        Session session = getFactory().getCurrentSession();
        Integer id = (Integer) session.save(user);
        log.debug("id: {}", id);
        log.debug("userId set to: {}", user.getId());
    }

    public void removeUser(Integer id) {
        Session session = getFactory().getCurrentSession();
        session.delete(this.getUser(id));
    }

    public SessionFactory getFactory() {
        return factory;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    private void utility(Object b) {
        Field fs;
        try {
            fs = b.getClass().getDeclaredField("threadLocals");
            fs.setAccessible(true);
            Object o = fs.get(b);
            System.out.println(o);
            System.out.println(o.getClass().getName());
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
