package com.example.timetable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Diet extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        TextView textView=findViewById(R.id.tv13);
        TextView textView1=findViewById(R.id.tv14);
        TextView textView2=findViewById(R.id.tv17);
        TextView textView3=findViewById(R.id.tv20);


        TextView bf1=findViewById(R.id.tv15);
        TextView bf2=findViewById(R.id.tv16);
        TextView l1=findViewById(R.id.tv18);
        TextView l2=findViewById(R.id.tv19);
        TextView d1=findViewById(R.id.tv21);
        TextView d2=findViewById(R.id.tv22);


        textView.setText("Today's Meals");
        textView1.setText("Breakfast");
        textView2.setText("Lunch");
        textView3.setText("Dinner");

        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        Date d=new Date();
        String currentDate= sdf.format(d);
        switch (currentDate){
            case "Monday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;
            case "Tuesday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;
            case "Wednesday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;
            case "Thursday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;
            case "Friday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;
            case "Saturday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;

            case "Sunday":
                bf1.setText("1)");
                bf2.setText("2)");
                l1.setText("1)");
                l2.setText("2)");
                d1.setText("1)");
                d2.setText("2)");

                break;

        }

    }

}
