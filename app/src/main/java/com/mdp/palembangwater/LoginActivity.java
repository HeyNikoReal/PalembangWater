package com.mdp.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnlogin,btnsignup;
    private EditText etnama,etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etpass = findViewById(R.id.et_password);
        etnama = findViewById(R.id.et_username);
        btnlogin = findViewById(R.id.btn_login);
        btnsignup = findViewById(R.id.btn_signup);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama,pass;

                nama = etnama.getText().toString();
                pass = etpass.getText().toString();

                if(nama.trim().equals(""))
                {
                    etnama.setError("Username tidak boleh kosong");
                    return;
                }

                if(pass.trim().equals(""))
                {
                    etpass.setError("Password tidak boleh kosong");
                    return;
                }

                Toast.makeText(LoginActivity.this,
                        "Anda Berhasil Login",Toast.LENGTH_LONG).show();
            }
        });



    }
}