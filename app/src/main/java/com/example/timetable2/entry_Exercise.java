package com.example.timetable2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class entry_Exercise extends AppCompatActivity {
    private Button button;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry__exercise);

        mRootRef= new Firebase("https://time-table-fd578.firebaseio.com/");
        button=(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase childRef=mRootRef.child("Name");
                childRef.setValue("yogesh");
            }
        });


    }
}
