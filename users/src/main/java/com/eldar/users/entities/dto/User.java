package com.eldar.users.entities.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public String firstName;
    public String lastName;
    public String userName;
    public String email;
    public LocalDate birthday;
}