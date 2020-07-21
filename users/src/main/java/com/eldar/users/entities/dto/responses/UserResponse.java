package com.eldar.users.entities.dto.responses;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel
public class UserResponse {
    @ApiModelProperty(value = "User's firstname")
    public String firstName;
    @ApiModelProperty(value = "User's lastname")
    public String lastName;
    @ApiModelProperty(value = "Username")
    public String userName;
    @ApiModelProperty(value = "User's email")
    public String email;
    @ApiModelProperty(value = "User birthday")
    public LocalDate birthday;
}