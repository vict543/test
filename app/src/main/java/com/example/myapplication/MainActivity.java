package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txv);
        textView.setText("321");

        addMaster();
    }

    public void addMaster() {
        TextView textView = findViewById(R.id.txv);
        textView.setText("MASTER");
    }
}
