package com.example.changefouk.diabetesbasiccare;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Changefouk on 30-Aug-16.
 */
public class DatabaseOpenHelper extends SQLiteAssetHelper {

    //database version
    public static final String DB_NAME = "Diabetes.db";
    public static final int DB_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }





}
