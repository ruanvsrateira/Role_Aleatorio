package com.senac.rolealeatorio.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.senac.rolealeatorio.model.Preferencia;
import com.senac.rolealeatorio.model.Usuario;

public class PreferenciaDAO extends SQLiteOpenHelper {

    public PreferenciaDAO(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlTabelaUsuario = "CREATE TABLE PREFERENCIA (" +
                "ID INTEGER PRIMARY KEY, " +
                "TIPO TEXT, " +
                "NOME TEXT);";

        sqLiteDatabase.execSQL(sqlTabelaUsuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void salva(Preferencia preferencia){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put("TIPO", preferencia.getTipo());
        valores.put("NOME", preferencia.getNome());
        db.insert("PREFERENCIA", null, valores);
    }
}
