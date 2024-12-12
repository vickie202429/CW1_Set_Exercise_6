package com.example.cw1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.cw1.databinding.ActivityEmployeeMenuBinding;

public class EmployeeMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_menu);

        TextView companyNoticeTextView = findViewById(R.id.companyNoticeTextView);
        TextView leaveTextView = findViewById(R.id.leaveTextView);
        TextView taskListTextView = findViewById(R.id.taskListTextView);
        TextView personalInfoTextView = findViewById(R.id.personalInfoTextView);
        Button logoutButton = findViewById(R.id.logoutButton);

        leaveTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeMenuActivity.this, LeaveActivity.class));
            }
        });

        personalInfoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeMenuActivity.this, EmployeePersonalInfoActivity.class));
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeMenuActivity.this, WelcomeActivity.class));
            }
        });


    }

}