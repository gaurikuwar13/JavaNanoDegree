package com.example.springbootvalidation.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class User {
    @NotBlank(message = "username cannot be blank")
    private String name;
    @NotBlank(message = "password cannot be blank")
    @Length(min = 6,max = 9,message = "The password should be between 6 to 9 characters in length")
    private String password;
    @Min(0)
    @Max(100)
    private Double grade;
    @Email
    private String email;
    public User(String name,String password,Double grade,String email){
        this.name = name;
        this.password = password;
        this.grade = grade;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
