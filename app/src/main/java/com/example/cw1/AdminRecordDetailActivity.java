package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminRecordDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_leave_record_detail);

        ImageView approveImageView = findViewById(R.id.approveImageView);
        approveImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminRecordDetailActivity.this, AdminCompletedActivity.class));
            }
        });
        ImageView disapproveImageView = findViewById(R.id.disapproveImageView);
        disapproveImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminRecordDetailActivity.this, AdminLeaveRecordActivity.class));
            }
        });


        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminRecordDetailActivity.this, AdminLeaveRecordActivity.class));
            }
        });
    }
}