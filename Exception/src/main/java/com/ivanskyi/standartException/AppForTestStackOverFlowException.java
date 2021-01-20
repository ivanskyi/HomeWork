package com.ivanskyi.standartException;

public class AppForTestStackOverFlowException {
    AppForTestStackOverFlowException() {
        AppForTestStackOverFlowException t =
                new AppForTestStackOverFlowException();
    }
    public static void main(String[] args) {
     AppForTestStackOverFlowException myStack =
             new AppForTestStackOverFlowException();
    }
}
