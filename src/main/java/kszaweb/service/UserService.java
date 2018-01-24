package kszaweb.service;

import kszaweb.model.User;

public interface UserService {
    void save(User user);

    User findByUserName(String userName);
}
