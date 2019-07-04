package com.springboot.angularapi.controller;

import com.springboot.angularapi.model.User;
import com.springboot.angularapi.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list-user")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping("/user/{idUser}")
    public User findByIdUser(@PathVariable(name = "idUser") long idUser) {
        return userService.findByIdUser(idUser);
    }

    @RequestMapping(value = "/add-user", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
