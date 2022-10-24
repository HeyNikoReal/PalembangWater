package com.mdp.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    private Button btnsignup;
    private EditText etnama, etemail, etpass, etconpass;
    private Spinner spnegara;
    int nonegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnsignup = findViewById(R.id.btn_signup);
        etnama = findViewById(R.id.et_username);
        spnegara = findViewById(R.id.sp_negara);
        etemail = findViewById(R.id.et_email);
        etpass = findViewById(R.id.et_password);
        etconpass = findViewById(R.id.et_conpassword);


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama, negara, email, pass, confirm;

                nama = etnama.getText().toString();
                negara = spnegara.getSelectedItem().toString();
                email = etemail.getText().toString();
                pass = etpass.getText().toString();
                confirm = etconpass.getText().toString();

                if (nama.trim().equals("")) {
                    etnama.setError("Nama tidak boleh kosong");
                    return;
                }
                if (email.trim().equals("")) {
                    etemail.setError("Email Tidak boleh kosong");
                    return;
                }
                if (pass.trim().equals("")) {
                    etpass.setError("Password Tidak boleh kosong");
                    return;
                }

                if (confirm.trim().equals(pass.trim())) {
                    Intent intent = new Intent(SignUpActivity.this, ResultActivity.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNegara", negara);
                    intent.putExtra("varEmail", email);
                    startActivity(intent);
                } else {
                    etconpass.setError("Confirm Password harus sama dengan Password");
                    return;
                }
            }
        });


    }
}