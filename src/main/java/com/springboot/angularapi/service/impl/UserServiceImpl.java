package com.springboot.angularapi.service.impl;

import com.springboot.angularapi.model.User;
import com.springboot.angularapi.repository.UserRepository;
import com.springboot.angularapi.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findByIdUser(long idUser) {
        return userRepository.findByIdUser(idUser);
    }

}
