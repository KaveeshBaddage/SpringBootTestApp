package com.kaveesh.testApp.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
@NotNull
public class AdminCreateRequestDTO {

    @NotEmpty(message = "Missing mandatory parameter: First Name")
    @JsonProperty(value  = "firstName")
    private String firstName;

    @NotEmpty(message = "Missing mandatory parameter: Last Name")
    @JsonProperty(value  = "lastName")
    private String lastName;

    @NotNull(message = "Missing mandatory parameter: Age")
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 100, message = "Age should not be greater than 100")
    @JsonProperty(value  = "age")
    private int  age;

    @NotEmpty(message = "Missing mandatory parameter: Occupation")
    @JsonProperty(value  = "occupation")
    private String occupation;

    @NotEmpty(message = "Missing mandatory parameter: Email Address")
    @Email(message = "Email should be valid")
    @JsonProperty(value  = "email")
    private String email;

    @NotEmpty(message = "Missing mandatory parameter: Contact Number")
    @Size(min = 10, max = 12, message
            = "Contact Number should be 10 - 12 characters")
    @JsonProperty(value  = "contactNumber")
    private String contactNumber;

    @JsonProperty(value  = "userData")
    private JsonNode userData;

}
