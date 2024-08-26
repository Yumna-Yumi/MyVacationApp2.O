package com.example.myvacationapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

        private DestinationExpert expert = new DestinationExpert();
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClickSeekMenu(View view) {
            Spinner DestinationSpinner = (Spinner) findViewById(R.id.DestinationSpinner);
            String SelectedSpot = String.valueOf(DestinationSpinner.getSelectedItem());

            List<String> spotList = expert.getSpot(SelectedSpot);
            StringBuilder spotFormatted = new StringBuilder();
            for (String Spot : spotList) {
                spotFormatted.append(Spot).append('\n');
            }

            TextView DestinationTextView = (TextView) findViewById(R.id.DestinationTextView);
            DestinationTextView.setText(spotFormatted);

        }

}
