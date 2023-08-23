package com.cydeo.entity;

import com.cydeo.enums.Gender;

import java.time.LocalDateTime;
import java.util.List;

public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String phone;
    private String passWord;
    private Role role;
    private boolean enabled;
    private Gender gender;

    public User(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateDateTime, Long lastUpdateUserId, String firstName, String lastName, String userName, String phone, String passWord, Role role, boolean enabled, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phone = phone;
        this.passWord = passWord;
        this.role = role;
        this.enabled = enabled;
        this.gender = gender;
    }
}
