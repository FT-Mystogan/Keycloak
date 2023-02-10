package com.example.keycloak.support.enums;

public enum CoefficientsSalary {
    COEFFICIENTS_SALARY_OF_WEEKDAY(0.5f),
    COEFFICIENTS_SALARY_OF_SUNDAY(1.0f),
    COEFFICIENTS_SALARY_OF_HOLIDAY(2.0f),
    COEFFICIENTS_SALARY_OF_NIGHT(1.5f);

    public final float value ;

    CoefficientsSalary(float value) {
        this.value = value;
    }
}
