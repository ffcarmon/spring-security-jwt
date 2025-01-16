package com.cloudforge.mytoken.auth.controller;

public record LoginRequest(
        String email,
        String password
) {
    }