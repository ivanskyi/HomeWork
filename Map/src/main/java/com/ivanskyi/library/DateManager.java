package com.ivanskyi.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManager {

    private final SimpleDateFormat simpleDateFormatWithSecond = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public Date getDateHowText(String date) {
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return new Date();
        }
    }

    public String getDateInTextViewWithSecond(Date date) {
        return simpleDateFormat.format(date);
    }

    public String getDateInTextViewWithoutSecond(Date date) {
        return simpleDateFormatWithSecond.format(date);
    }
}
