package com.project.uber.uberApp.controllers;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.OnboardDriverDTO;
import com.project.uber.uberApp.dto.SignupDTO;
import com.project.uber.uberApp.dto.UserDTO;
import com.project.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    ResponseEntity<UserDTO> signup(@RequestBody SignupDTO signupDTO){
        return new ResponseEntity<>(authService.signup(signupDTO), HttpStatus.CREATED);
    }

    @PostMapping("/onboardNewDriver/{userId}")
    ResponseEntity<DriverDTO> onboardNewDriver(@PathVariable Long userId, @RequestBody OnboardDriverDTO onboardDriverDTO){
        return new ResponseEntity<>(authService.onboardNewDrivers(userId, onboardDriverDTO.getVehicleId()), HttpStatus.CREATED);
    }
}
