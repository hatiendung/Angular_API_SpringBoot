package com.springboot.angularapi.service;

import com.springboot.angularapi.model.User;
import java.util.List;

public interface UserService {
    List<User> findAllUser();
    
    User saveUser(User user);

    public User findByIdUser(long idUser);
}
