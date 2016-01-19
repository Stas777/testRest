package by.bsu.staspetrovich.service;

import by.bsu.staspetrovich.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> getList();

}
