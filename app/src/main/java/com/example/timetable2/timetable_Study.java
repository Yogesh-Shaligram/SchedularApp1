package com.example.timetable2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class timetable_Study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable__study);


        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        Date d=new Date();
        String currentDate= sdf.format(d);
        TextView textView=findViewById(R.id.day);
        textView.setText(currentDate);


        switch (currentDate){
            case "Monday":

                break;
            case "Tuesday":

                break;
            case "Wednesday":

                break;
            case "Thursday":

                break;
            case "Friday":

                break;
            case "Saturday":

                break;

            case "Sunday":

                break;

        }
    }
}
