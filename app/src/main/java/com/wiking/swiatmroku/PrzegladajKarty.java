package com.wiking.swiatmroku;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class PrzegladajKarty extends AppCompatActivity {
    private TextView IloscKartWBazie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przegladaj_karty);
        final View rootView = getWindow().getDecorView().getRootView();

         SQLiteDatabase mDatabase = openOrCreateDatabase("db_card", SQLiteDatabase.OPEN_READWRITE, null);
        mDatabase.setLocale(Locale.getDefault());

        final MySQLiteHelper db = new MySQLiteHelper(this);
        IloscKartWBazie=(rootView.findViewById(R.id.IloscKartWBazie));
        int q=db.iloscKPwBazie();
        Log.i("testy","IloscKart w bazie "+q);
       // IloscKartWBazie.setText(db.iloscKPwBazie());
    }
}
