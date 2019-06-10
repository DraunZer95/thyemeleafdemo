package com.deere.thymeleafdemo.Service;

import com.deere.thymeleafdemo.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User person);
    User getUser(Long id);
    User editUser(User person);
    void deleteUser(User person);
    void deleteUser(Long id);
    List<User> getAllUser();
}
