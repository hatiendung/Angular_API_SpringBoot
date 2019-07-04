package com.springboot.angularapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angularapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByIdUser(long idUser);

}
