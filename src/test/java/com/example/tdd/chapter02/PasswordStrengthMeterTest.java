package com.example.tdd.chapter02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {

    @Test
    void name() {

    }

    @Test
    void meetsAllCriteria_Then_String() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        Assertions.assertThat(result).isEqualTo(PasswordStrength.STRONG);
    }

}