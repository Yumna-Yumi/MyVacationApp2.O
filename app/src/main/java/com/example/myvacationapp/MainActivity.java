package com.example.myvacationapp;

import android.content.Intent;
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

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void onClickSeekMenu(View view) {
            Spinner DestinationSpinner = (Spinner) findViewById(R.id.DestinationSpinner);
            String SelectedSpot = String.valueOf(DestinationSpinner.getSelectedItem());
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra(SecondActivity.Spot, SelectedSpot);
            startActivity(intent);


        }

}
