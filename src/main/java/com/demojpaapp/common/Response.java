package com.demojpaapp.common;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = 752762152986969674L;
    private Object payload;
    private String error;

    public Response() {
    }

    public Response(Object payload) {
        this.payload = payload;
    }

    public Response(Object resp, String error) {
        payload = resp;
        this.error = error;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
