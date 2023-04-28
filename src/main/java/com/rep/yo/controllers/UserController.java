package com.rep.yo.controllers;
import com.rep.yo.models.User;
import com.rep.yo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/get/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/add")
    public User addUser(@RequestParam String name, @RequestParam Integer age) {
        User user = new User(name, age);
        return userService.addUser(user);
    }

}
