package com.example.keycloak.support.enums;

public enum OvertimeHour {
    MAX_HOUR_IN_DAY(4),
    START_TIME_OF_DAY(6),
    END_TIME_OF_DAY(22);

    public final int value;

    OvertimeHour(int value) {
        this.value = value;
    }
}
