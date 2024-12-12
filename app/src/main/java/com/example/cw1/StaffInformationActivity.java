package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StaffInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_information);

        TextView createAccountTextView = findViewById(R.id.createAccountTextView);
        TextView editAccountTextView = findViewById(R.id.editAccountTextView);
        TextView viewAccountTextView = findViewById(R.id.viewAccountTextView);
        TextView deleteAccountTextView = findViewById(R.id.deleteAccountTextView);
        Button backButton = findViewById(R.id.backButton);

        createAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaffInformationActivity.this, CreateAccountActivity.class));
            }
        });

        editAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaffInformationActivity.this, EditAccountActivity.class));
            }
        });

        viewAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaffInformationActivity.this, ViewAccountActivity.class));
            }
        });

        deleteAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaffInformationActivity.this, DeleteAccountActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StaffInformationActivity.this, AdminMenuActivity.class));
            }
        });
    }
}