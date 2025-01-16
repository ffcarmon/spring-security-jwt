package com.cloudforge.mytoken.auth.controller;

public record RegisterRequest(
        String email,
        String password,
        String name
) {
}
