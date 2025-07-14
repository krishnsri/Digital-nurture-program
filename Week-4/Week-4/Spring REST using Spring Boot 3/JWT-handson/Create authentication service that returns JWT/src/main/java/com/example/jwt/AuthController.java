package com.example.jwt;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> user) {
        String username = user.get("username");
        String password = user.get("password");

        if ("admin".equals(username) && "admin".equals(password)) {
            String token = JwtUtil.createToken(username);
            Map<String, String> response = new HashMap<>();
            response.put("jwtToken", token);
            return response;
        } else {
            throw new RuntimeException("Invalid login");
        }
    }
}
