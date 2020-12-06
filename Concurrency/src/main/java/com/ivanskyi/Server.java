package com.ivanskyi;

import com.ivanskyi.serverParts.RequestManager;
import com.ivanskyi.serverParts.TypeRequest;

public class Server extends Thread{
    RequestManager requestManager = new RequestManager();
    Object value;
    TypeRequest typeRequest;
    Object result;

    public Server(Object value, TypeRequest typeRequest) {
        this.value = value;
        this.typeRequest = typeRequest;
    }

    public void run(){
        try {
            Thread.sleep(1100);
            System.out.println(detectTypeRequest());
        }
        catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

    public Object detectTypeRequest(){
        switch (typeRequest) {
            case GET:
                result = requestManager.GET(value);
                break;
            case POST:
                result = requestManager.POST(value);
                break;
            case PUT:
                result = requestManager.PUT(value);
                break;
            case DELETE:
               result = requestManager.DELETE(value);
                break;
            default:
                throw new IllegalStateException("We can't use this http type: " + typeRequest);
        }
        return result;
    }
}
