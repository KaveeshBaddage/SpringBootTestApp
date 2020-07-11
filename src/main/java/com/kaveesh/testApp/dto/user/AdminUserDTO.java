package com.kaveesh.testApp.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.kaveesh.testApp.model.user.AdminUserEntity;
import lombok.Data;
import java.util.Date;


@Data
public class AdminUserDTO {

    @JsonProperty(value  = "id")
    private String adminAccountId;

    @JsonProperty(value  = "firstName")
    private String firstName;

    @JsonProperty(value  = "lastName")
    private String lastName;

    @JsonProperty(value  = "age")
    private int  age;

    @JsonProperty(value  = "occupation")
    private String occupation;

    @JsonProperty(value  = "email")
    private String email;

    @JsonProperty(value  = "contactNumber")
    private String contactNumber;

    @JsonProperty(value  = "userData")
    private JsonNode userData;

    @JsonProperty(value  = "role")
    private String role;

    @JsonProperty(value  = "createdAt")
    private Date createdAt;

    @JsonProperty(value  = "createdBy")
    private String createdBy  ;

    public AdminUserEntity toEntity(){
        AdminUserEntity adminUserEntity = new AdminUserEntity();
        adminUserEntity.setAdminAccountId(this.adminAccountId);
        adminUserEntity.setFirstName(this.firstName);
        adminUserEntity.setLastName(this.lastName);
        adminUserEntity.setAge(this.age);
        adminUserEntity.setOccupation(this.occupation);
        adminUserEntity.setEmail(this.email);
        adminUserEntity.setContactNumber(this.contactNumber);
        adminUserEntity.setUserData(this.userData);
        adminUserEntity.setRole(this.role);
        adminUserEntity.setCreatedAt(this.createdAt);
        adminUserEntity.setCreatedBy(this.createdBy);
        return adminUserEntity;
    }

}
