package com.eldar.users.services;

import com.eldar.users.entities.dto.requests.UserRequest;
import com.eldar.users.entities.dto.responses.UserResponse;

import org.springframework.stereotype.Service;

@Service
public class UsersService {
    
    public UserResponse getUserByUsername(String username) {
        /* En este hago el parseo con el Builder, en el siguiente con getters/setters,
         * cuál va?
         * Tampoco está siendo usada la clase User, que supongo que pinchará más con la
         * capa de persistencia. */

        return UserResponse.builder()
                .firstName("Mario")
                .lastName("López Di Benedetto")
                .userName(username)
            .build();
    }

    public UserResponse createUser(UserRequest request) {
        UserResponse user = new UserResponse();
        user.setBirthday(request.getBirthday());
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setUserName(request.getUsername());
        return user;
    }
}