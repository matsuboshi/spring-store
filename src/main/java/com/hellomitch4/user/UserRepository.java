package com.hellomitch4.user;

public interface UserRepository {
    void save(User user);

    User findByEmail(String email);
}
