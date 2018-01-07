package com.wiking.swiatmroku;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        KartaPostaci kartaPostaci=db.getKP(db.iloscKPwBazie()-1);
        Log.i("testy","IloscKart w bazie "+q);
        IloscKartWBazie.setText(q+" "+kartaPostaci.getImie());

        RadioGroup rgp= (RadioGroup) findViewById(R.id.radioGrupsCardsView);
        RadioGroup.LayoutParams rprms;

        for(int i=q;i>=1;i--){
            RadioButton radioButton = new RadioButton(this);
            KartaPostaci kp = db.getKP(i);

            radioButton.setId(i);
            radioButton.setText(radioButton.getId()+". "+kp.getImie());
            rprms= new RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT);
            rgp.addView(radioButton, rprms);
        }
        /*
        for (int row = 0; row < 1; row++) {
            RadioGroup ll = new RadioGroup(this);
            ll.setOrientation(LinearLayout.HORIZONTAL);

            for (int i = 1; i <= q; i++) {
                RadioButton rdbtn = new RadioButton(this);
                rdbtn.setId((row * 2) + i);
                rdbtn.setText("Radio " + rdbtn.getId());
                ll.addView(rdbtn);
            }
            ((ViewGroup) findViewById(R.id.radioGrupsCardsView)).addView(ll);
        }
*/
        //TODO dynamiczne ładowanie w scrollview i reliative layout i linear leyout ID NAZWA (Jjako BUTTON) i (usuń jako button) albo ID Radiobutton nazwa a na górze dwa klawisze otwórz lub usuń
    }


}
