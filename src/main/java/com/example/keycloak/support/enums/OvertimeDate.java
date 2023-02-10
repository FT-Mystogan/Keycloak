package com.example.keycloak.support.enums;

public enum OvertimeDate {
    WEEKDAYS("WEEKDAYS"),
    SUNDAY("SUNDAY"),
    SATURDAY("SATURDAY"),
    HOLIDAY("HOLIDAY"),
    ;
    public final String value;

    OvertimeDate(String value) {
        this.value = value;
    }
}
