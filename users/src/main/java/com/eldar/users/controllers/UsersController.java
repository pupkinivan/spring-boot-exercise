package com.eldar.users.controllers;

import com.eldar.users.entities.dto.requests.UserRequest;
import com.eldar.users.entities.dto.responses.UserResponse;
import com.eldar.users.services.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = {"Test"}, description = " ")
@RestController
@ApiResponses({
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 400, message = "Bad Request"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found"),
    @ApiResponse(code = 405, message = "Method Not Allowed"),
    @ApiResponse(code = 500, message = "Backend Error")
})
@RequestMapping("/test")
public class UsersController {

    @Autowired
    UsersService usersService;

    @ApiOperation( value = "Obtain an user's details by its username.")
    @GetMapping("/users/{username}")
    @ResponseStatus(HttpStatus.OK) // lo manejábamos así?
    public UserResponse getUserByUsername(@ApiParam(value = "Username") @PathVariable String username) {
        return usersService.getUserByUsername(username);
    }

    @ApiOperation( value = "Create a new user.")
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@ApiParam(value = "User request") @RequestBody UserRequest requestUser) {
        return usersService.createUser(requestUser);
    }
    
}