package com.hellokoding.account.service;

public interface SecurityService {
    String findLoggedInUsername();

// adding comment line

    void autologin(String username, String password);
}


/// Adding more comments