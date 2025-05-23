package ru.mustafaev.spring.springboot.spring_course_springboot.dao;

import ru.mustafaev.spring.springboot.spring_course_springboot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> showUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUser(Long id);
}
