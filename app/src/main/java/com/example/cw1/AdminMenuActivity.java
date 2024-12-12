package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        TextView companyNoticeTextView = findViewById(R.id.companyNoticeTextView);
        TextView leaveRecordTextView = findViewById(R.id.leaveRecordTextView);
        TextView staffInformationTextView = findViewById(R.id.staffInformationTextView);
        Button logoutButton = findViewById(R.id.logoutButton);

        leaveRecordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMenuActivity.this, AdminLeaveRecordActivity.class));
            }
        });

        staffInformationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMenuActivity.this, StaffInformationActivity.class));
            }
        });


        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminMenuActivity.this, WelcomeActivity.class));
            }
        });

    }
}