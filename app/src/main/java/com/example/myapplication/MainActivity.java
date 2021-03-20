package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail, edPassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btSignin);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nama = edEmail.getText().toString();
                password = edPassword.getText().toString();
                String email = "admin@mail.com";
                String pass = "123";

                if (edEmail.getText().toString().equals("admin@mail.com") && edPassword.getText().toString().equals("123")) {


                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUCCESS || email :" + nama + "dan Password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);
                    i.putExtras(b);
                    startActivity(i);
                } else {
                    Toast.makeText((getApplicationContext()), "Wrong credentials, please try again",
                            Toast.LENGTH_SHORT).show();
                    ;
                }
            }
        });
    }
}



