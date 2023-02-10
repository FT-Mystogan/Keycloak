package com.example.keycloak.support.enums;

public enum OvertimeRequestNotice {

    SENT("You have a new overtime request"),
    APPROVE("Your overtime request has been approved"),
    FORWARD("A overtime request have been forwarded to you"),
    REJECT("Your overtime request has been rejected");

    String message;
    OvertimeRequestNotice(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
