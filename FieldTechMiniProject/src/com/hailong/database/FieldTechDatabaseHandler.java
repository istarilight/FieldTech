package com.hailong.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FieldTechDatabaseHandler extends SQLiteOpenHelper{
	private static int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "Test";

	//DB constants
	private static final String TABLE_FIELDTECH = "fieldtech";
	private static final String TABLE_FIELDTECH2 = "fieldtech2";
	private static final String KEY_ID = "id";

	public FieldTechDatabaseHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}


	@Override
	public void onCreate(SQLiteDatabase arg0) {
		if(DATABASE_VERSION == 1){
			String CREATE_TABLE = "CREATE TABLE " + TABLE_FIELDTECH + "("
					+ KEY_ID + " INTEGER PRIMARY KEY.";
			arg0.execSQL(CREATE_TABLE);

		}
		else{
			String CREATE_TABLE = "CREATE TABLE " + TABLE_FIELDTECH + "("
					+ KEY_ID + " INTEGER PRIMARY KEY.";
			String CREATE_TABLE_2 = "CREATE TABLE " + TABLE_FIELDTECH2 + "("
					+ KEY_ID + " INTEGER PRIMARY KEY.";
			arg0.execSQL(CREATE_TABLE);
			arg0.execSQL(CREATE_TABLE_2);
		}


	}
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		FieldTechDatabaseHandler.DATABASE_VERSION = arg2;
		if(arg1 == 1){
			arg0.execSQL("DROP TABLE IF EXISTS " + TABLE_FIELDTECH);
		}
		else{
			arg0.execSQL("DROP TABLE IF EXISTS " + TABLE_FIELDTECH);
			arg0.execSQL("DROP TABLE IF EXISTS " + TABLE_FIELDTECH2);
		}

		// Create tables again
		onCreate(arg0);

	}
}
