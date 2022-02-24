package com.example.tdd.domain;

import com.example.tdd.domain.enumtype.PasswordStrength;
import org.springframework.util.StringUtils;

public class PasswordStrengthMeter {

    public PasswordStrength meter(String text) {
        if(!StringUtils.hasText(text)) {
            return PasswordStrength.INVALID;
        }
        int metCounts = 0;
        if(text.length() >= 8) metCounts++;
        if(meetsContainingNumberCriteria(text)) metCounts++;
        if(meetsContainingUppercaseCriteria(text)) metCounts++;

        if(metCounts <= 1) return PasswordStrength.WEAK;
        if(metCounts == 2) return PasswordStrength.NORMAL;
        return PasswordStrength.STRONG;
    }

    private boolean meetsContainingUppercaseCriteria(String text) {
        boolean containsUppercase = false;
        for(char ch : text.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                containsUppercase = true;
                break;
            }
        }
        return containsUppercase;
    }

    private boolean meetsContainingNumberCriteria(String text) {
        boolean containsNum = false;
        for(char ch : text.toCharArray()) {
            if(ch >= '0' && ch <='9') {
                containsNum = true;
                break;
            }
        }
        return containsNum;
    }

}
