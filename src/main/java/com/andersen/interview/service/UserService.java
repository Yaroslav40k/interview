package com.andersen.interview.service;

import java.util.List;

import com.andersen.interview.entity.User;
import org.springframework.stereotype.Component;


@Component
public class UserService {

    public User findById(Long userId) {
        User userFromDb = this.getUserFromDb(userId);
        return userFromDb;
    }

    private User getUserFromDb(Long id) {
        //Not important logic: Getting a user from the DB....
        return  new User();
    }


    public User updateUser(User user) {
        return update(user);
    }

    private User update(User user) {
        //Not important logic: updating a user....
        User updatedUser = user;
        return  updatedUser;
    }


}
