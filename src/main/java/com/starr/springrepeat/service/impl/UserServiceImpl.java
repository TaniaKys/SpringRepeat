package com.starr.springrepeat.service.impl;

import com.starr.springrepeat.entity.User;
import com.starr.springrepeat.repository.UserRepository;
import com.starr.springrepeat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repository;

    public User addUser(User user) {
        return repository.saveAndFlush(user);
    }

    public void delete(long id) {
        repository.delete(id);
    }

    public User getByUsername(String name) {
        return repository.findByUsername(name);
    }

    public User editBank(User user) {
        return repository.saveAndFlush(user);
    }

    public List<User> getAll() {
        return repository.findAll();
    }
}
