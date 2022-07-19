package com.senac.rolealeatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.senac.rolealeatorio.dao.PreferenciaDAO;
import com.senac.rolealeatorio.model.Preferencia;

public class PreferenciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencia);

        EditText tipo = findViewById(R.id.editTextTipoPreferencia);

        EditText nome = findViewById(R.id.editTextNomePreferencia);

        Button finalizar = findViewById(R.id.buttonCadastrarPreferencia);

        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Preferencia preferencia = new Preferencia();

                preferencia.setTipo(tipo.getText().toString());
                preferencia.setNome(nome.getText().toString());

                PreferenciaDAO dao = new PreferenciaDAO(PreferenciaActivity.this, "roleAleatorio", null, 1);

                dao.salva(preferencia);
            }
        });
    }
}