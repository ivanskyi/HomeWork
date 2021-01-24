package com.ivanskyi.webChat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInstance {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private Date date = new Date();

    public DateInstance(String dateLine) {
        try {
            this.date = simpleDateFormat.parse(dateLine);
        } catch (ParseException e) {
            System.out.println("Sorry. We have problem with parsing date");
        }
    }

    public Date getDate() {
        return date;
    }
}
