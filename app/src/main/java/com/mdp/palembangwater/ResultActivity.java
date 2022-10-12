package com.mdp.palembangwater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private Button btnlogout;
    private TextView tvnama,tvemail,tvnegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnlogout = findViewById(R.id.btn_logout);
        tvnama = findViewById(R.id.tv_nama);
        tvemail = findViewById(R.id.tv_email);
        tvnegara = findViewById(R.id.tv_negara);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("varNama"));
        tvemail.setText(intent.getStringExtra("varEmail"));
        tvnegara.setText(intent.getStringExtra("varNegara"));

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}