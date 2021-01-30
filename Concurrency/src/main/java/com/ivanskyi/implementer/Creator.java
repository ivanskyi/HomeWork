package com.ivanskyi.implementer;

import com.ivanskyi.fireservice.FireDepartment;
import com.ivanskyi.server.Cisco;
import com.ivanskyi.server.TypeRequest;

public class Creator {

    public static void start() {
        FireDepartment fireDepartment = new FireDepartment();
        final int neededQTYFiremen = 10;

        try {
            fireDepartment.call(neededQTYFiremen);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        final int requestQTY = 50;
        String getRequestBody = "In get request, we see URL line.";
        String postRequestBody = "In post request, part of URL is hided ";
        String putRequestBody = "In put request, we put some data.";
        String deleteRequestBody = "In delete request, we delete some data.";

        for (int i = 0; i < requestQTY; i++) {
            Cisco serverForGetRequest =
                    new Cisco(getRequestBody, TypeRequest.GET);
            Cisco serverForPostRequest =
                    new Cisco(postRequestBody, TypeRequest.POST);
            Cisco serverForPutRequest =
                    new Cisco(putRequestBody, TypeRequest.PUT);
            Cisco serverForDeleteRequest =
                    new Cisco(deleteRequestBody, TypeRequest.DELETE);

            serverForGetRequest.start();
            serverForPostRequest.start();
            serverForPutRequest.start();
            serverForDeleteRequest.start();
        }
    }
}
