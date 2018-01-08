package com.wiking.swiatmroku;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //SQLiteDatabase mDatabase = openOrCreateDatabase("db_card", SQLiteDatabase.OPEN_READWRITE, null);
        SQLiteDatabase mDatabase = openOrCreateDatabase("db_card", SQLiteDatabase.OPEN_READWRITE, null);
       mDatabase.setLocale(Locale.getDefault());
       //mDatabase.setLocale(Locale.getDefault());
        String columns[] = {"id", "imie", "wiek","gracz","koncept","cnota","skaza","kronika","frakcja","nazwaGrupy",
                "inteligencja","czujnosc","determinacja","sila","zrecznosc","wytrzymalosc","prezentacja","manipulacja",
                "dedukcja","informatyka","medycyna","nauka","okultyzm","polityka","rzemioslo","wyksztalcenie",
                "bijatyka","bronBiala","bronPalna","prowadzenie","przetrwanie","skradanie","wysportowanie","zlodziejstwo",
                "ekspresja","empatia","obycie","oszustwo","preswazja","polswiate","zatraszanie","zwierzeta",
                "at1Nazwa","at2Nazwa","at3Nazwa","at4Nazwa","at5Nazwa","at6Nazwa","at7Nazwa","at8Nazwa","at9Nazwa",
                "at1Wartosc","at2Wartosc","at3Wartosc","at4Wartosc","at5Wartosc","at6Wartosc","at7Wartosc","at8Wartosc","at9Wartosc",
                "wada1Nazwa","wada2Nazwa","wada3Nazwa","wada4Nazwa","wada1Wartosc","wada2Wartosc","wada3Wartosc","wada4Wartosc",
                "rozmiar","szybkosc","inicjatywa","obrona","pancerz","zdrowieMax","silaWoliMax","zdrowie","silaWoli","doswiadczenie","moralnosc",
                "bron1Nazwa","bron2Nazwa","bron3Nazwa","bron1Mod","bron2Mod","bron3Mod",
                "wyp1Nazwa","wyp2Nazwa","wyp3Nazwa","wyp1Mod","wyp2Mod","wyp3Mod"};
        //Cursor c = mDatabase.query("tablica_KP", columns, null, null, null, null, "result DESC");
        MySQLiteHelper db = new MySQLiteHelper(this);
       // MySQLiteHelper db = new MySQLiteHelper(this);

        /**
         * CRUD Operations

        // add Books
        db.addKP(new KartaPostaci());

        // get all books
        List<KartaPostaci> list = db.getAllKP();

        // delete one book
        db.deleteKP(list.get(0));

        // get all books
        db.getAllKP();
        **/
    }
    public void onDodajKarteClick(View view){
        Intent dodajKarteClick;
        dodajKarteClick=new Intent(this,DodajKarte2.class);
        startActivity(dodajKarteClick);


    }

    public void onClickPrzegladajKarty(View view) {
        Intent przegladajKarty;
        przegladajKarty=new Intent(this,PrzegladajKarty.class);
        startActivity(przegladajKarty);
    }

    public void onClickExportuj(View view) {
        Intent intent;
        intent=new Intent(this,DoZrobienia.class);
        startActivity(intent);
    }

    public void onClickImportuj(View view) {
        Intent intent;
        intent=new Intent(this,DoZrobienia.class);
        startActivity(intent);
    }

    public void onClickOGrze(View view) {
        Intent intent;
        intent=new Intent(this,DoZrobienia.class);
        startActivity(intent);
    }

    public void onClickAbout(View view) {
        Intent intent;
        intent=new Intent(this,DoZrobienia.class);
        startActivity(intent);
    }
}
