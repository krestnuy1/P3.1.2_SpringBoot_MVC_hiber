package com.example.p312springboot_mysql.service;



import com.example.p312springboot_mysql.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

}
