package com.andersen.interview.controller;

import com.andersen.interview.entity.User;
import com.andersen.interview.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(value = "/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}/find")
    public User findUserById(@PathVariable Long userId) {
        User user = userService.findById(userId);
        return user;
    }

    @PostMapping("/{userId}/find")
    public User updateUser(@PathVariable User user) {
        return userService.updateUser(user);
    }
}
