package com.ivanskyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManager {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    public Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    public Date getDateByText(String date) throws ParseException {
        return simpleDateFormat.parse(date);
    }
}