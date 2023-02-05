package com.git.action.controller;

import com.git.action.domain.User;
import com.git.action.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/test")
    public ResponseEntity<Object> create(String name, String email){
        var user = userService.create(name, email);
        return ResponseEntity.ok().body(user.getName());
    }
}
