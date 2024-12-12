package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LeaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        TextView applyLeaveTextView = findViewById(R.id.applyLeaveTextView);
        TextView leaveRecordTextView = findViewById(R.id.leaveRecordTextView);
        TextView leaveStatusTextView = findViewById(R.id.leaveStatusTextView);
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LeaveActivity.this, EmployeeMenuActivity.class));
            }
        });
        applyLeaveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LeaveActivity.this, ApplyLeaveActivity.class));
            }
        });

        leaveRecordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LeaveActivity.this, LeaveRecordActivity.class));
            }
        });

    }
}