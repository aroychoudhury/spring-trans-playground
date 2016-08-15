package org.abhishek.tutorials.spring.transactions.dao;

import org.abhishek.tutorials.spring.transactions.model.User;

import java.util.List;

public interface UserDAO extends DAO {
    @SuppressWarnings("rawtypes")
    public List getUsers();
    public User getUser(Integer userId);
    public void saveUser(User user);
    public void removeUser(Integer userId);
}