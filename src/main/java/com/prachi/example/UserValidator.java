package com.prachi.example;

import org.springframework.stereotype.Service;

@Service
public class UserValidator {

    public boolean isUserValid(String name, String password){
        return name.equals("Prachi") && password.equals("Prachi");

    }
}
