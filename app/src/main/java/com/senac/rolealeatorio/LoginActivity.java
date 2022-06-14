package com.senac.rolealeatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnEntrar = findViewById(R.id.buttonLogin);

        TextView cadastrar = findViewById(R.id.textViewCadastrar);

        EditText email = findViewById(R.id.editTextEmailLogin);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Clicou", Toast.LENGTH_LONG).show();
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencao = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intencao);
            }
        });

        cadastrar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(LoginActivity.this, "Clicou por muito tempo", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean focado) {
                if (!focado) {
                    if (email.getText().toString().equalsIgnoreCase("")) {
                        email.setText("Preencha aqui");
                        email.setTextColor(Color.RED);
                    }
                } else {
                    if (email.getText().toString().equalsIgnoreCase("Preencha aqui")) {
                        email.setText("");
                        email.setTextColor(Color.BLACK);
                    }
                }
            }
        });
    }
}