package com.senac.rolealeatorio.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.senac.rolealeatorio.model.Usuario;

public class UsuarioDAO extends SQLiteOpenHelper {

    public UsuarioDAO(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlTabelaUsuario = "CREATE TABLE USUARIO (" +
                "CPF TEXT PRIMARY KEY, " +
                "NOME TEXT, " +
                "SOBRENOME TEXT," +
                "EMAIL TEXT," +
                "SENHA TEXT);";

        sqLiteDatabase.execSQL(sqlTabelaUsuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void salva(Usuario usuario){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("NOME", usuario.getNome());
        valores.put("SOBRENOME", usuario.getSobrenome());
        valores.put("EMAIL", usuario.getEmail());
        valores.put("CPF", usuario.getCPF());
        valores.put("SENHA", usuario.getSenha());
        db.insert("USUARIO", null, valores);
    }
}
