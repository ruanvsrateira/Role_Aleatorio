package com.senac.rolealeatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button finalizarCadastroUsuario = findViewById(R.id.buttonFinalizarCadastroUsuario);
        Button limparCadastroUsuario = findViewById(R.id.buttonLimpar);
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextSobrenome = findViewById(R.id.editTextSobrenome);
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextCPF = findViewById(R.id.editTextCPF);
        EditText editTextSenha = findViewById(R.id.editTextSenha);
        EditText editTextDataNascimento = findViewById(R.id.editTextDataNascimento);

        finalizarCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = new Usuario();
                usuario.nome = editTextNome.getText().toString();
                usuario.sobrenome = editTextSobrenome.getText().toString();
                usuario.email = editTextEmail.getText().toString();
                usuario.senha = editTextSenha.getText().toString();
                usuario.CPF = editTextCPF.getText().toString();
                //usuario.dataNascimento = new Date(editTextDataNascimento.getText().toString());

                Toast.makeText(MainActivity.this, usuario.toString(), Toast.LENGTH_LONG).show();
            }
        });

        limparCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNome.setText("");
                editTextSobrenome.setText("");
                editTextEmail.setText("");
                editTextSenha.setText("");
                editTextCPF.setText("");
                editTextDataNascimento.setText("");
            }
        });
    }
}