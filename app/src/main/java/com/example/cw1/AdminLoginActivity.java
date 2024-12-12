package com.example.cw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Button loginBtn = findViewById(R.id.loginButton);
        EditText loginIDView = findViewById(R.id.loginIDEditText);
        EditText passwordView = findViewById(R.id.editTextPassword);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loginIDView.getText().length() == 0 || passwordView.getText().length() == 0) {
                    Toast.makeText(AdminLoginActivity.this, "Please enter the Login ID and password.",
                            Toast.LENGTH_LONG).show();
                } else {
                    startActivity(new Intent(AdminLoginActivity.this, AdminMenuActivity.class));
                }
            }
        });

    }
}