package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.SignupDTO;
import com.project.uber.uberApp.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);

    UserDTO signup(SignupDTO signupDTO);

    DriverDTO onboardNewDrivers(Long userId);
}
