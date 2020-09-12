package com.example.timetable2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.exercise);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExercise();
            }
        });

        button1=(Button) findViewById(R.id.diet);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiet();
            }
        });

        button2=(Button) findViewById(R.id.study);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openstudy();
            }
        });
    }

    public void openExercise() {
        Intent intent =new Intent(this, Exercise.class);
        startActivity(intent);
    }
    public void openDiet(){
        Intent intent=new Intent(this, Diet.class);
        startActivity(intent);
    }

    public void openstudy(){
        Intent intent=new Intent(this,Study.class);
        startActivity(intent);
    }
}
