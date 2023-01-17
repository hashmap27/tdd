package com.example.tdd.chapter02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordStrengthMeterTest {

    @Test
    void name() {

    }

    @Test
    void meetsAllCriteria_Then_String() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        assertThat(result).isEqualTo(PasswordStrength.STRONG);
    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Normal() {
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@A");
        assertThat(result).isEqualTo(PasswordStrength.NORMAL);
    }

}