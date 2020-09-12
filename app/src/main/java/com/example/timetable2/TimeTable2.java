package com.example.timetable2;

import android.app.Application;

import com.firebase.client.Firebase;


public class TimeTable2 extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
