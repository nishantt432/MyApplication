package com.example.lenovo.myapplication;

/**
 * Created by Lenovo on 08-Dec-17.
 */

public class TaskClass {
    public String title;
    public String time;

    public TaskClass(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

