package com.ivanskyi;

import com.ivanskyi.fireService.FireDepartment;
import com.ivanskyi.serverParts.TypeRequest;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        FireDepartment fireDepartment = new FireDepartment();
        fireDepartment.call(10);

        for (int i = 0; i < 100; i++) {
            Server serverForGetRequest = new Server("Request when we see url", TypeRequest.GET);
            Server serverForPostRequest = new Server("Request when we don't see all url", TypeRequest.POST);
            Server serverForPutRequest = new Server("Request to put something", TypeRequest.PUT);
            Server serverForDeleteRequest = new Server("Request to delete something", TypeRequest.DELETE);
            serverForGetRequest.run();
            serverForPostRequest.run();
            serverForPutRequest.run();
            serverForDeleteRequest.run();
        }
    }
}
