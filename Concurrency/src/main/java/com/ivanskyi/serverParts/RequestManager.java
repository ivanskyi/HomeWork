package com.ivanskyi.serverParts;

public class RequestManager{

    public Object GET(Object value){
        return "GET : " + value + " Name thread: " + Thread.currentThread().getName();
    }

    public Object POST(Object value){
        return "POST : " + value + " Name thread: " + Thread.currentThread().getName();
    }

    public Object PUT(Object value){
        return "PUT : " + value + " Name thread: " + Thread.currentThread().getName();
    }

    public Object DELETE(Object value){
        return "DELETE : " + value + " Name thread: " + Thread.currentThread().getName();
    }
}
