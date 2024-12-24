package com.example.awstest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final UserEntityRepository userRepository;

    @GetMapping(value="/api/userlist")
    public ResponseEntity<List<UserEntity>> userlist() {
        List<UserEntity> users = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }


}
