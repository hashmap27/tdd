package com.example.tdd.chapter02;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {
        // 패스워드 길이가 8보다 작을 경우
        if(s.length() < 8) {
            return PasswordStrength.NORMAL;
        }

        // 숫자 미포함, 나머지 경우 충족
        boolean containsNum = false;
        for(char ch : s.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                containsNum = true;
                break;
            }
        }
        if(!containsNum) {
            return PasswordStrength.NORMAL;
        }

        return PasswordStrength.STRONG;
    }
}
