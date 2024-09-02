package com.example.myvacationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class SecondActivity extends AppCompatActivity {
 public static final String Spot = "spots";
    private DestinationExpert expert = new DestinationExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String s_type = intent.getStringExtra(Spot);
        TextView spots= (TextView)findViewById(R.id.SecondActivityTextView);
        List<String> spotList = expert.getSpot(s_type);
        StringBuilder spotFormatted = new StringBuilder();
        for (String Spot : spotList) {
            spotFormatted.append(Spot).append('\n');
        }

        spots.setText(spotFormatted);
    }
}

