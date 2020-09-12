package com.example.timetable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Exercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        TextView textView=findViewById(R.id.tv10);
        textView.setText("Today's Exercise");

        TextView t1=findViewById(R.id.tv1);
        TextView t2=findViewById(R.id.tv2);
        TextView t3=findViewById(R.id.tv3);
        TextView t4=findViewById(R.id.tv4);
        TextView t5=findViewById(R.id.tv5);
        TextView t6=findViewById(R.id.tv6);
        TextView t7=findViewById(R.id.tv7);
        TextView t8=findViewById(R.id.tv8);


        SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
        Date d=new Date();
        String currentDate= sdf.format(d);
        switch (currentDate){
            case "Monday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;
            case "Tuesday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;
            case "Wednesday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;
            case "Thursday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;
            case "Friday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;
            case "Saturday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;

            case "Sunday":

                t1.setText("1)");
                t2.setText("2)");
                t3.setText("3)");
                t4.setText("4)");
                t5.setText("5)");
                t6.setText("6)");
                t7.setText("7)");
                t8.setText("8)");

                break;

        }

    }
}

