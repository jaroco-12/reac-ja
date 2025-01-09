package com.web.restful_app;

import com.web.restful_app.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    public Users addUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return usersRepository.save(user);
    }
}
