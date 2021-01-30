package com.ivanskyi.server;

public class RequestManager {

    public Object get(Object value) {
        return "GET request. Request body [" + value + "] Name thread: "
                + Thread.currentThread().getName();
    }

    public Object post(Object value) {
        return "POST request. Request body [" + value + "] Name thread: "
                + Thread.currentThread().getName();
    }

    public Object put(Object value) {
        return "PUT request. Request body [" + value + "] Name thread: "
                + Thread.currentThread().getName();
    }

    public Object delete(Object value) {
        return "DELETE request. Request body [" + value + "] Name thread: "
                + Thread.currentThread().getName();
    }
}
