package com.example.a.t11_sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by a on 2015-04-16.
 */
public class T11SQLiteHandler {
    T11SQLOpenHelper helper;
    SQLiteDatabase db;

    public T11SQLiteHandler(Context context){
        helper = new T11SQLOpenHelper(context, "person.sqlite", null, 1);
    }

    public void insert(String name, int age, String address){
        db = helper.getWritableDatabase();

        //String sql = "insert into student values(null,"+name+","+age+","+address+")";
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("age", age);
        values.put("address", address);

        db.insert("student", null, values);
    }


}









