package com.chrisferdev.universalpetcare.service;

import com.chrisferdev.universalpetcare.model.User;
import com.chrisferdev.universalpetcare.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(User user){
        userRepository.save(user);
    }
}
