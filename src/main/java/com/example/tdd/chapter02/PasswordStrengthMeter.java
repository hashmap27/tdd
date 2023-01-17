package com.example.tdd.chapter02;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {
        if(s.length() < 8) {
            return PasswordStrength.NORMAL;
        }
        return PasswordStrength.STRONG;
    }
}
