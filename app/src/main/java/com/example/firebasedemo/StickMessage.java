package com.example.firebasedemo;

import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;

import java.sql.Time;
import java.time.LocalDateTime;

public class StickMessage {
    private String time;
    private String text;
   // private String image;
    private boolean isImage;

    public StickMessage() {
    }

    public StickMessage(String time, String text,boolean isImage) {
        this.time = time;
        this.text = text;
        this.isImage=isImage;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getisImage() {
        return isImage;
    }

    public void setisImage(boolean text) {
        isImage = text;
    }

    @Override
    public String toString() {
        return "time= " + time + "\n"+
                "text= " + text;
    }
}

