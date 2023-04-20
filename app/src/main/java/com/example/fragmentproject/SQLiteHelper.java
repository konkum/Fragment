package com.example.fragmentproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "data.db";
    private static int DATABASE_VERSION = 1;

    public SQLiteHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCreateDB = "CREATE TABLE workjob(" +
                "id INTERGER PRIMARY KEY AUTOINCREMENT,"
                + "jobname TEXT,"
                + "jobinformation TEXT,"
                + "finishdate TEXT,"
                + "status TEXT,"
                + "isalone boolean)";
        sqLiteDatabase.execSQL(sqlCreateDB);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        
    }
}
