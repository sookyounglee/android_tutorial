package com.example.a.t11_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by a on 2015-04-16.
 */
public class T11SQLOpenHelper extends SQLiteOpenHelper {
    public T11SQLOpenHelper(Context context, String name,
                            SQLiteDatabase.CursorFactory factory,
                            int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
