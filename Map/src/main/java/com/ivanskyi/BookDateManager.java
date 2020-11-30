package com.ivanskyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDateManager {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Date add(String date) throws ParseException {
        return simpleDateFormat.parse(date);
    }
}