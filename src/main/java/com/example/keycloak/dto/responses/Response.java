package com.example.keycloak.dto.responses;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Response<T> implements Serializable {

    protected T data;
    private boolean success;
    private int code;
    private String message;
    private long timestamp;

    @JsonIgnore
    private RuntimeException exception;

    public Response() {
        timestamp = Instant.now().toEpochMilli();
        success = true;
        code = 200;
    }

    public static <T> Response<T> of(T res) {
        Response<T> response = new Response<>();
        response.data = res;
        response.success();
        return response;
    }

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.success();
        return response;
    }

    public static <T> Response<T> fail(RuntimeException exception) {
        Response<T> response = new Response<>();
        response.setSuccess(false);
        response.setException(exception);
        return response;
    }

    public Response<T> data(T res) {
        data = res;
        return this;
    }

    public Response<T> success() {
        success = true;
        code = 200;
        return this;
    }

    public Response<T> success(String message) {
        success = true;
        this.message = message;
        code = 200;
        return this;
    }

    public T getData() {
        if (exception != null) {
            throw exception;
        }
        return data;
    }

    public boolean isSuccess() {
        if (exception != null) {
            throw exception;
        }
        return success;
    }

    @Override
    public String toString() {
        return "Response {" +
                "data=" + data +
                ", success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", timestamp=" + timestamp +
                ", exception=" + exception +
                '}';
    }
}
