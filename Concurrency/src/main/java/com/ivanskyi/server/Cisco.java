package com.ivanskyi.server;

public class Cisco extends Thread {

    private final RequestManager requestManager = new RequestManager();
    private final Object value;
    private final TypeRequest typeRequest;

    public Cisco(Object value, TypeRequest typeRequest) {
        this.value = value;
        this.typeRequest = typeRequest;
    }

    public void run() {
        try {
            final int timeForRequestSleep = 900;
            Thread.sleep(timeForRequestSleep);
            System.out.println(detectTypeRequest());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Object detectTypeRequest() {
        Object result;
        final String getRequest = "get";
        final String postRequest = "post";
        final String putRequest = "put";
        final String deleteRequest = "delete";

        switch (typeRequest.getName()) {
            case getRequest:
                result = requestManager.get(value);
                break;
            case postRequest:
                result = requestManager.post(value);
                break;
            case putRequest:
                result = requestManager.put(value);
                break;
            case deleteRequest:
                result = requestManager.delete(value);
                break;
            default:
                throw new IllegalStateException("We can't use "
                        + "this http type: " + typeRequest);
        }
        return result;
    }
}
