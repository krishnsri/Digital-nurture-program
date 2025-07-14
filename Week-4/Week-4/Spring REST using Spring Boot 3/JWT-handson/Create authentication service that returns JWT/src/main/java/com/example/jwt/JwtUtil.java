package com.example.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    // Your plain secret key
    private static final String SECRET_KEY = "mysupersecretkeyformyjwtprojectwhichisverysecure123";

    // This method returns the token
    public static String createToken(String username) {
        Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(encodeKey(SECRET_KEY)));

        return Jwts.builder()
                .setSubject(username)
                .setIssuer("spring-jwt")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // Encodes the key to base64
    private static String encodeKey(String key) {
        return java.util.Base64.getEncoder().encodeToString(key.getBytes());
    }
}
