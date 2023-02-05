package com.git.action.service;

import com.git.action.domain.User;
import com.git.action.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

//    @Value("${action.check}")
//    private String check;

    private String check = "name";

    public User create(String name, String email){
        if(userRepository.existsByName(name)){
            throw new RuntimeException("이미 존재함");
        }

        User user = User.builder()
                .id(UUID.randomUUID())
                .name(check)
                .email(email)
                .build();

        return userRepository.save(user);
    }
}
