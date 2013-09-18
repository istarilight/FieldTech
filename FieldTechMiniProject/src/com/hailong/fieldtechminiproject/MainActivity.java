package com.hailong.fieldtechminiproject;

import com.hailong.database.FieldTechDatabaseHandler;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FieldTechDatabaseHandler handler = new FieldTechDatabaseHandler(this);
        handler.getWritableDatabase();
        
    }

    
}
