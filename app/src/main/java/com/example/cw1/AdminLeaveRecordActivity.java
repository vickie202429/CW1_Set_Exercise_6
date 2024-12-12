package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class AdminLeaveRecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_leave_record);

        Button backButton = findViewById(R.id.backButton);
        TableLayout pendingTable = findViewById(R.id.pendingTable);
        pendingTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminLeaveRecordActivity.this, AdminRecordDetailActivity.class));
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminLeaveRecordActivity.this, AdminMenuActivity.class));
            }
        });
    }
}