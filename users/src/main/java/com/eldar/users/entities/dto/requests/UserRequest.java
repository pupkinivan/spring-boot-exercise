package com.eldar.users.entities.dto.requests;

import java.time.LocalDate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "UserRequest", description = "User details")
public class UserRequest {
    @ApiModelProperty(value = "User's first name", example = "Ricardo", required = true, allowableValues = "range[1,20]")
    public String firstName;

    @ApiModelProperty(value = "User's last name", example = "Ordóñez", required = true, allowableValues = "range[1,20]")
    public String lastName;

    @ApiModelProperty(value = "Username", example = "ricardito2000", required = true, allowableValues = "range[1,20]")
    public String username;

    @ApiModelProperty(value = "User's email", example = "ricar2000@aol.com", required = true, allowableValues = "range[1,30]")
    public String email;
    
    @ApiModelProperty(value = "User's birthday", example = "2020-07-20", required = true)
    public LocalDate birthday;
}