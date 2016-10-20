package com.starr.springrepeat.service;

import com.starr.springrepeat.entity.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    void delete(long id);

    User getByUsername(String name);

    User editBank(User user);

    List<User> getAll();
}
