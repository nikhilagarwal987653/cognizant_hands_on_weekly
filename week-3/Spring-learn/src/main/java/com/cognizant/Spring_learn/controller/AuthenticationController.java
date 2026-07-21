package com.cognizant.Spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    /*
     * HS256 ke liye key sufficiently long honi chahiye.
     * Learning project mein hardcoded hai.
     */
    private static final String SECRET =
            "cognizant-jwt-secret-key-for-learning-project-2026";

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String authHeader) {

        String user = getUser(authHeader);

        String token = generateJwt(user);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }

    private String getUser(String authHeader) {

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new IllegalArgumentException(
                    "Authorization header must start with Basic"
            );
        }

        String encodedCredentials =
                authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        /*
         * credentials:
         * user:pwd
         */
        int colonPosition = credentials.indexOf(":");

        if (colonPosition == -1) {
            throw new IllegalArgumentException(
                    "Invalid Basic Authentication header"
            );
        }

        return credentials.substring(0, colonPosition);
    }

    private String generateJwt(String user) {

        SecretKey key = Keys.hmacShaKeyFor(
                SECRET.getBytes(StandardCharsets.UTF_8)
        );

        long currentTime = System.currentTimeMillis();

        return Jwts.builder()
                .subject(user)
                .issuedAt(new Date(currentTime))
                .expiration(new Date(currentTime + 20 * 60 * 1000))
                .signWith(key)
                .compact();
    }
}