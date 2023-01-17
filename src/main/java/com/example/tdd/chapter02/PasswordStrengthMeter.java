package com.example.tdd.chapter02;

import org.springframework.util.StringUtils;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String s) {
        // 비밀번호를 입력 받지 않은 경우
        if(!StringUtils.hasText(s)) {
            return PasswordStrength.INVALID;
        }

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
