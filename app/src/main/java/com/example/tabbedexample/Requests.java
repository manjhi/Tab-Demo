package com.example.tabbedexample;

public class Requests {
    String Name;
    String UserTime;

    public Requests(String name,String time) {
        Name = name;
        UserTime = time;
    }

    public String getName() {
        return Name;
    }

    public String getUserTime() {
        return UserTime;
    }
}
