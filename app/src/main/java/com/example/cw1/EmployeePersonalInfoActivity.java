package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EmployeePersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_personal_info);

        TextView editAccountTextView = findViewById(R.id.editAccountTextView);
        TextView viewAccountTextView = findViewById(R.id.viewAccountTextView);
        Button backButton = findViewById(R.id.backButton);

        editAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeePersonalInfoActivity.this, EmployeeEditAccountActivity.class));
            }
        });

        viewAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeePersonalInfoActivity.this, EmployeeViewAccountActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeePersonalInfoActivity.this, EmployeeMenuActivity.class));
            }
        });
    }
}