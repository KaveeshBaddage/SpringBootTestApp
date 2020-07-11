package com.kaveesh.testApp.model.user;

import com.fasterxml.jackson.databind.JsonNode;
import com.kaveesh.testApp.dto.JSONObjectConverter;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/*
* @Data annotation annotation automatically set getters and setters  to the variables defined in the class.
* @Entity annotation specifies that the class is an entity and is mapped to a database table.
* @Table annotation specifies the name of the database table to be used for mapping. No need to add this if the class name and table name is equals.
* @Id annotation specifies the primary key of an entity.
* @GeneratedValue provides for the specification of generation strategies for the values of primary keys.
* @Column specify the mapped column for a persistent property or field
* */

@Data
@Entity
@Table(name = "admin_uesr")
public class AdminUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String adminAccountId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int  age;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "user_data")
    @Convert(converter = JSONObjectConverter.class)
    private  JsonNode userData;

    @Column(name = "role")
    private String role;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy  ;


}
