package com.business.cacoguaa.business.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ace on 4/11/2017.
 */

public class BusinessDBHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Business.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_BUSINESS = "Business";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_URL = "url";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_TYPE = "type";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_BUSINESS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NAME + " TEXT, " +
                    COLUMN_URL + " TEXT, " +
                    COLUMN_PHONE + " TEXT, " +
                    COLUMN_EMAIL + " TEXT, " +
                    COLUMN_DESCRIPTION + " TEXT, " +
                    COLUMN_TYPE + " TEXT " +
                    ")";

    public BusinessDBHandler(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int n) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_BUSINESS);
        sqLiteDatabase.execSQL(TABLE_CREATE);
    }

}
