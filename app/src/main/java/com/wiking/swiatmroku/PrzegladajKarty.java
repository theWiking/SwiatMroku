package com.wiking.swiatmroku;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class PrzegladajKarty extends AppCompatActivity {
    private TextView IloscKartWBazie;
    private int ktoraWybrana=0;
    private Button usun;
    private Button otworz;
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
       // KartaPostaci kartaPostaci=db.getKP(db.iloscKPwBazie()-1);
        Log.i("testy","IloscKart w bazie "+q);
        //IloscKartWBazie.setText();


    //TODO ominąć jakoś gdy karta jest usuniątea
        RadioGroup rgp= (RadioGroup) findViewById(R.id.radioGrupsCardsView);
        RadioGroup.LayoutParams rprms;
        List<KartaPostaci> AllKP=db.getAllKP();
        Collections.reverse(AllKP); // odwrotna kolejność
        for (KartaPostaci kp: AllKP
             ) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setId(kp.getId());
            radioButton.setText(radioButton.getId()+". "+kp.getImie());
            rprms= new RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            rgp.addView(radioButton, rprms);
        }

        rgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                KartaPostaci kp = db.getKP(checkedId);
                ktoraWybrana=checkedId;

                IloscKartWBazie.setText(kp.getId()+" Imie:"+kp.getImie()+" \nNG:"+kp.getNazwaGrupy());

            }
        });
        usun= rootView.findViewById(R.id.buttonUsun);
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ktoraWybrana!=0){
                    KartaPostaci kp = db.getKP(ktoraWybrana);
                    db.deleteKP(kp);
                    ktoraWybrana=0;
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
            }
        });
        otworz=rootView.findViewById(R.id.buttonOtworz);
        otworz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ktoraWybrana!=0) {
                    //ToDo otwarcie nowego widoku i przekazanie tam karty postaci lub samego jej id !! (lepiej id samo)
                    Intent i = new Intent(getApplicationContext(), OgladajKarte.class);

                    i.putExtra("key", ktoraWybrana+"");
                    Log.i("testy", "" + ktoraWybrana);
                    Toast.makeText(rootView.getContext(), "" + ktoraWybrana, Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    finish();
                }
            }
        });

        //TODO zrobić po przejściu aby się ładowała ta karta
    }



}
