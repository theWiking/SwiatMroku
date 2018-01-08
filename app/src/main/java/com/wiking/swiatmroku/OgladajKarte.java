package com.wiking.swiatmroku;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class OgladajKarte extends AppCompatActivity {
    private TextView imie;
    private TextView OInteligencja;
    private TextView OSila;
    private TextView OPrezencja;

    private TextView OCzujnosc;
    private TextView OZrecznosc;
    private TextView OManipulacja;

    private TextView ODeterminacja;
    private TextView OWytrzymalosc;
    private TextView OOpanowanie;
    private String getBigDot(){
        return Html.fromHtml("&#9679;").toString();
    }
    private String getSmallDot(){
        return  Html.fromHtml("&#8226;").toString();
    }
    private String HowManyDots(int BigDots,int MaxDots){
        String out = "";
        Log.i("testy",""+BigDots);
        for(int i=0;i<MaxDots;i++){
            if(i<BigDots) {
                out += getBigDot();
            }else {
                out+=getSmallDot();
            }
        }
        return out;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ogladaj_karte);
        Intent extras = getIntent();
        String value = "0";
        if (extras != null) {
            value = extras.getStringExtra("key");
            //The key argument here must match that used in the other activity
        }
        int id=Integer.valueOf(value);
        Log.i("testy","Ogladaj Karte: "+value+" id:"+id);

        final View rootView = getWindow().getDecorView().getRootView();

        SQLiteDatabase mDatabase = openOrCreateDatabase("db_card", SQLiteDatabase.OPEN_READWRITE, null);
        mDatabase.setLocale(Locale.getDefault());

        final MySQLiteHelper db = new MySQLiteHelper(this);



        KartaPostaci KP = db.getKP(id);

        imie = (TextView) rootView.findViewById(R.id.Oimie);

        imie.setText("Imię: "+KP.getImie()+"\nWiek: "+KP.getWiek()+"\nKoncept: "+KP.getKoncept()+"\nCnota: "+KP.getCnota()+"\nSkaza: "+KP.getSkaza()+"\nKronika: "+KP.getKronika()+"\nFrakcja: "+KP.getFrakcja());

        OInteligencja =rootView.findViewById(R.id.OInteligencja);
        OInteligencja.setText("Inteligencja:"+ HowManyDots(KP.getInteligencja(),5));

        OSila=rootView.findViewById(R.id.OSila);
        OSila.setText("Siła"+HowManyDots(KP.getSila(),5));

        OPrezencja=rootView.findViewById(R.id.OPrezencja);
        OPrezencja.setText("Prezencja"+"*****");

    }
}
