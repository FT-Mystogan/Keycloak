package com.example.keycloak.support.constant;

public interface Constants {
    //Number of days to delete old action logs
    long HALF_YEAR_TO_DAY = 180;
    long DAY_TO_MILLI = 86400000;
    long DURATION_TO_DELETE_OLD_ACTION_LOG = (HALF_YEAR_TO_DAY*DAY_TO_MILLI);

    long MILLI_TO_HOUR = 3600000;
    long MIN_HOUR_IN_DAY = 6;
    long MAX_HOUR_IN_DAY = 22;

    long MIN_MILLI_IN_DAY = MIN_HOUR_IN_DAY * MILLI_TO_HOUR;
    long MAX_MILLI_IN_DAY = MAX_HOUR_IN_DAY * MILLI_TO_HOUR;

    String ZONE_ID_UTC = "UTC";
    String FORMAT_TIME = "HH:mm";

    public interface Regex {
        public static final String NUMBER = "[+-]?\\d*(\\.\\d+)?";
    }
}
