package com.example.assignment1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import java.awt.font.TextAttribute;
import java.security.PrivateKey;

import androidx.appcompat.app.AppCompatActivity;


public class ass1Activity2 extends AppCompatActivity {
private TextView name,password;
private Spinner spinner1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ass12);

        name=findViewById(R.id.text_name);
        password=findViewById(R.id.text_password);
        spinner1=findViewById(R.id.text_spinner1);



        String username = getIntent().getStringExtra("keyname");
        String userpassword = getIntent().getStringExtra("keypassword");
        String userspinner1 = getIntent().getStringExtra("keyspinner1");



        name.setText(username);
        password.setText(userpassword);




    }
}