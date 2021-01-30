package com.ivanskyi.server;

public enum TypeRequest {
    GET("get"),
    POST("post"),
    PUT("put"),
    DELETE("delete");

    private String name;

    TypeRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
