package com.example.mireciclerview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    public AdminSQLiteOpenHelper(
            Context context,
            String nombre,
            SQLiteDatabase.CursorFactory factory,
            int version)
    {
        super(context, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table animal(nombre text primary key, nombreC text, datos text, longitud text, latitud text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int version1, int version2) {
        db.execSQL("drop table if exists animal");
        db.execSQL("create table animal(nombre text primary key, nombreC text, datos text, longitud text, latitud text)");

    }

}