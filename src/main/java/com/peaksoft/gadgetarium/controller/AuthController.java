package com.peaksoft.gadgetarium.controller;

import com.peaksoft.gadgetarium.model.dto.UserRequest;
import com.peaksoft.gadgetarium.model.dto.UserResponse;
import com.peaksoft.gadgetarium.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@RequestMapping("/api/users")
public class AuthController {

    @Autowired
    UserService userService;


    @PostMapping("/sign-up")
    public UserResponse createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
}
