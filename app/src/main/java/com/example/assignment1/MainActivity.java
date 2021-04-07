package com.example.assignment1;

import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView textView;
    Switch aSwitch;
    private EditText name,password;
    private Spinner spinner1;
    private Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        aSwitch=findViewById(R.id.switch1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){


            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(aSwitch.isChecked()){
                    textView.setText("Switch is on,yaaay thank u");
                }else{
                    textView.setText("Switch is off,sad");
                }
            }

            });



        Spinner spinner =findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence>adapter = ArrayAdapter.createFromResource(this, R.array.Your_specialty_is, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        name =findViewById(R.id.name);
        password = findViewById(R.id.password);
        spinner1 =findViewById(R.id.spinner1);
        show =findViewById(R.id.show);
        aSwitch=findViewById(R.id.switch1);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= name.getText().toString();
                String userpassword= password.getText().toString();
                String userspinner1= password.getText().toString();


                Intent intent = new Intent(MainActivity.this,ass1Activity2.class);
                intent.putExtra("keyname",username);
                intent.putExtra( "keypassword",userpassword);
                intent.putExtra( "keypinner1",userspinner1);

                startActivity(intent);

            }

        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text =parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}