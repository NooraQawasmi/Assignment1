package com.example.assignment1;

import android.content.*;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static final String Name = "name";
    public static final String Password = "password";
    public static final String Flag = "Flag";
    private boolean flag = false;
    private EditText editname;
    private EditText editpassword;
    private CheckBox chk;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editor;
    TextView textView;
    Switch aSwitch;
    private EditText name,password;
    private Spinner spinner1;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        aSwitch=findViewById(R.id.switch1);
go();
go2();
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

        name =findViewById(R.id.editname);
        password = findViewById(R.id.editpassword);
        spinner1 =findViewById(R.id.spinner1);
        next =findViewById(R.id.next);
        aSwitch=findViewById(R.id.switch1);

        next.setOnClickListener(new View.OnClickListener() {
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

        setupViews();
        setupSharedPrefs();
        checkPrefs();
    }
    private void checkPrefs(){
        flag=prefs.getBoolean(Flag,false);
        if(flag){
            String name = prefs.getString(Name,"");
            String password = prefs.getString(Password,"");
            editname.setText(name);
            editpassword.setText(password);
            chk.setChecked(true);
        }
    }
    private void setupSharedPrefs(){
        prefs= PreferenceManager.getDefaultSharedPreferences(this);
        editor = prefs.edit();
    }
    private void setupViews(){
        editname = findViewById(R.id.editname);
        editpassword = findViewById(R.id.editpassword);
        chk = findViewById(R.id.chk);
    }
    public void btnLoginOnClick(View view){
        String name = editname.getText().toString();
        String password = editpassword.getText().toString();

        if(chk.isChecked()){
            if(!flag){
                editor.putString(Name,name);
                editor.putString(Password,password);
                editor.putBoolean(Flag,true);
                editor.commit();

            }

        }


    }
    private void go(){
        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ass1Activity2.class));
            }
        });
    }
    private void go2(){
        Button go = (Button) findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
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