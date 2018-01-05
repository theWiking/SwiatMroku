package com.wiking.swiatmroku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DodajKarte2 extends AppCompatActivity {
//Dane
    String imie;
    String wiek;
    String gracz;
    String koncept;
    String cnota;
    String skaza;
    String kronika;
    String frakcja;
    String nazwaGrupy;
    //Atrybuty
    private SeekBar seekBarInteligencja ;
    private SeekBar seekBarCzujnosc;
    private SeekBar seekBarDeterminacja;
    private SeekBar seekBarSila;
    private SeekBar seekBarZrecznosc;
    private SeekBar seekBarWytrzymalos;
    private SeekBar seekBarPrezencja;
    private SeekBar seekBarManipulacja;
    private SeekBar seekBarOpanowanie;
    private TextView textViewGrup1;
    private TextView textViewGrup2;
    private TextView textViewGrup3;
    private int textViewGrup1Value=1;
    private int textViewGrup2Value=1;
    private int textViewGrup3Value=1;
    private RadioButton radioButton1_5;
    private RadioButton radioButton2_5;
    private RadioButton radioButton3_5;
    private RadioButton radioButton1_4;
    private RadioButton radioButton2_4;
    private RadioButton radioButton3_4;
    private RadioButton radioButton1_3;
    private RadioButton radioButton2_3;
    private RadioButton radioButton3_3;
    private List<RadioButton> listOfRadioButtons=new ArrayList<RadioButton>();
    private List<SeekBar> listOfSeekBars = new ArrayList<SeekBar>();
    private Button waliduj;
    //Umiejetnosci
    private SeekBar seekBarDedukcja ;
    private SeekBar seekBarInformatyka;
    private SeekBar seekBarMedycyna;
    private SeekBar seekBarNauka;
    private SeekBar seekBarOkultyzm;
    private SeekBar seekBarPolityka;
    private SeekBar seekBarRzemioslo;
    private SeekBar seekBarWyksztalcenie;

    private SeekBar seekBarBijatyka    ;
    private SeekBar seekBarBronBiala    ;
    private SeekBar seekBarBronPalna    ;
    private SeekBar seekBarProwadzenie    ;
    private SeekBar seekBarPrzetrwanie    ;
    private SeekBar seekBarSkradanie    ;
    private SeekBar seekBarWysportowanie    ;
    private SeekBar seekBarZlodziejstwwo    ;

    private SeekBar seekBarEspresja    ;
    private SeekBar seekBarEmpatia    ;
    private SeekBar seekBarObycie    ;
    private SeekBar seekBarOszustwo    ;
    private SeekBar seekBarPerswazja    ;
    private SeekBar seekBarPolswiatek    ;
    private SeekBar seekBarZastraszenie    ;
    private SeekBar seekBarZwierzeta    ;
    private TextView textViewGrupUM1;
    private TextView textViewGrupUM2;
    private TextView textViewGrupUM3;
    private int textViewGrup1ValueUM=1;
    private int textViewGrup2ValueUM=1;
    private int textViewGrup3ValueUM=1;
    private RadioButton radioButtonUM1_11;
    private RadioButton radioButtonUM1_7;
    private RadioButton radioButtonUM1_4;
    private RadioButton radioButtonUM2_11;
    private RadioButton radioButtonUM2_7;
    private RadioButton radioButtonUM2_4;
    private RadioButton radioButtonUM3_11;
    private RadioButton radioButtonUM3_7;
    private RadioButton radioButtonUM3_4;
    private List<RadioButton> listOfRadioButtonsUM=new ArrayList<RadioButton>();
    private List<SeekBar> listOfSeekBarsUM = new ArrayList<SeekBar>();
    private Button walidujUmiejetnosci;
//inne

    private String Atut1;
    private String Atut2;
    private String Atut3;
    private String Atut4;
    private String Atut5;
    private String Atut6;
    private String Atut7;
    private String Atut8;
    private String Atut9;
    private int Atut1Val;
    private int Atut2Val;
    private int Atut3Val;
    private int Atut4Val;
    private int Atut5Val;
    private int Atut6Val;
    private int Atut7Val;
    private int Atut8Val;
    private int Atut9Val;

    private String Wady1;
    private String Wady2;
    private String Wady3;

    private String rozmiar;
    private String szybkosc;
    private String inicjatywa;
    private String obrona;
    private String pancerz;
    private int doswiadczenie;

    private int zdrowie;
    private int silaWoli;
    private int moralnosc;

    private String Bron1;
    private int BronMod1;
    private String Bron2;
    private int BronMod2;
    private String Bron3;
    private int BronMod3;
    private String Wyp1;
    private int WypMod1;
    private String Wyp2;
    private int WypMod2;
    private String Wyp3;
    private int WypMod3;

    private Button dodajKarteDoBazy;
    private KartaPostaci KARTA_POSTACI;
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View v = getCurrentFocus();
            if ( v instanceof EditText) {
                Rect outRect = new Rect();
                v.getGlobalVisibleRect(outRect);
                if (!outRect.contains((int)event.getRawX(), (int)event.getRawY())) {
                    v.clearFocus();
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                }
            }
        }
        return super.dispatchTouchEvent( event );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodaj_karte2);
        final View rootView = getWindow().getDecorView().getRootView();





        textViewGrup1 = (TextView) rootView.findViewById(R.id.textViewGrup1);
        textViewGrup2 = (TextView) rootView.findViewById(R.id.textViewGrup2);
        textViewGrup3 = (TextView) rootView.findViewById(R.id.textViewGrup3);
        final RadioGroup radioGroup1 = (RadioGroup) rootView .findViewById(R.id.RadioGrup1);
        final RadioGroup radioGroup2 = (RadioGroup) rootView .findViewById(R.id.RadioGrup2);
        final RadioGroup radioGroup3 = (RadioGroup) rootView .findViewById(R.id.RadioGrup3);


        listOfRadioButtons.add(radioButton1_5 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup1_5));
        listOfRadioButtons.add(radioButton1_4 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup1_4));
        listOfRadioButtons.add(radioButton1_3 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup1_3));
        listOfRadioButtons.add(radioButton2_5 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup2_5));
        listOfRadioButtons.add(radioButton2_4 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup2_4));
        listOfRadioButtons.add(radioButton2_3 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup2_3));
        listOfRadioButtons.add(radioButton3_5 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup3_5));
        listOfRadioButtons.add(radioButton3_4 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup3_4));
        listOfRadioButtons.add(radioButton3_3 = (RadioButton) rootView.findViewById(R.id.radioButtonGrup3_3));




        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrup1_5:

                        textViewGrup1Value = 5;

                        textViewGrup1.setText(String.valueOf(textViewGrup1Value));

                        break;
                    case R.id.radioButtonGrup1_4:
                        textViewGrup1Value=4;
                        textViewGrup1.setText(String.valueOf(textViewGrup1Value));

                        break;
                    case R.id.radioButtonGrup1_3:
                        textViewGrup1Value=3;
                        textViewGrup1.setText(String.valueOf(textViewGrup1Value));
                        break;
                }
            }
        });
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrup2_5:
                        textViewGrup2Value=5;
                        textViewGrup2.setText(String.valueOf(textViewGrup2Value));
                        break;
                    case R.id.radioButtonGrup2_4:
                        textViewGrup2Value=4;
                        textViewGrup2.setText(String.valueOf(textViewGrup2Value));
                        break;
                    case R.id.radioButtonGrup2_3:
                        textViewGrup2Value=3;
                        textViewGrup2.setText(String.valueOf(textViewGrup2Value));
                        break;
                }
            }
        });
        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrup3_5:
                        textViewGrup3Value=5;
                        textViewGrup3.setText(String.valueOf(textViewGrup3Value));
                        break;
                    case R.id.radioButtonGrup3_4:
                        textViewGrup3Value=4;
                        textViewGrup3.setText(String.valueOf(textViewGrup3Value));
                        break;
                    case R.id.radioButtonGrup3_3:
                        textViewGrup3Value=3;
                        textViewGrup3.setText(String.valueOf(textViewGrup3Value));
                        break;
                }
            }
        });

        waliduj=(Button) rootView.findViewById(R.id.buttonWalidujAtrybuty);
        waliduj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w=textViewGrup1Value+textViewGrup2Value+textViewGrup3Value;
                if(w==12&&radioButton1_5.isEnabled()){

                    for (RadioButton radio:listOfRadioButtons) {
                        radio.setEnabled(false);
                    }
                    waliduj.setText("Odblokuj");
                    Toast.makeText(rootView.getContext(),"Zablokowane"+w,Toast.LENGTH_LONG).show();
                }
                else {
                    for (RadioButton radio:listOfRadioButtons) {
                        radio.setEnabled(true);
                    }
                    waliduj.setText("Waliduj radiobuttons");
                    Toast.makeText(rootView.getContext(),"NIeZablokowane:"+w,Toast.LENGTH_LONG).show();
                }
            }
        });



        ///seekbars

        listOfSeekBars.add(seekBarInteligencja  = rootView.findViewById(R.id.seekBarInteligencja));
        listOfSeekBars.add(seekBarCzujnosc = rootView.findViewById(R.id.seekBarCzujnosc));
        listOfSeekBars.add(seekBarDeterminacja= rootView.findViewById(R.id.seekBarDeterminacja));
        listOfSeekBars.add(seekBarSila=rootView.findViewById(R.id.seekBarSila));
        listOfSeekBars.add(seekBarZrecznosc=rootView.findViewById(R.id.seekBarZrecznosc));
        listOfSeekBars.add(seekBarWytrzymalos= rootView.findViewById(R.id.seekBarWytrzymalosc));
        listOfSeekBars.add(seekBarPrezencja= rootView.findViewById(R.id.seekBarPrezencja));
        listOfSeekBars.add(seekBarManipulacja=rootView.findViewById(R.id.seekBarManipulacja));
        listOfSeekBars.add(seekBarOpanowanie= rootView.findViewById(R.id.seekBarOpanowanie));
        for (SeekBar bar:listOfSeekBars) {
            bar.setEnabled(false);

        }


        //seekBarInteligencja.setProgress(2);
        final boolean[] correctAtributsSet= new boolean[]{false,false,false};
        //seekBarInteligencja.setMax(4);
        seekBarInteligencja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1Value!=0){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1Value==0){
                            textViewGrup1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrup1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarCzujnosc.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1Value!=0){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1Value==0){
                            textViewGrup1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrup1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
                        }
                        //Toast.makeText(rootView.getContext(),"old:"+progresBefore+" new:"+progress,Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarDeterminacja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1Value!=0){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup1.setText(String.valueOf(textViewGrup1Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1Value==0){
                            textViewGrup1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrup1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
                        }
                        //Toast.makeText(rootView.getContext(),"old:"+progresBefore+" new:"+progress,Toast.LENGTH_LONG).show();
                    }
                }
        );

        seekBarSila.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup2Value!=0){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2Value==0){
                            textViewGrup2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrup2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
                        }

                    }
                }
        );
        seekBarZrecznosc.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup2Value!=0){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2Value==0){
                            textViewGrup2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrup2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
                        }

                    }
                }
        );
        seekBarWytrzymalos.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup2Value!=0){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup2.setText(String.valueOf(textViewGrup2Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2Value==0){
                            textViewGrup2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrup2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
                        }

                    }
                }
        );

        seekBarPrezencja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup3Value!=0){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3Value==0){
                            textViewGrup3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[2]=true;
                        }
                        else{
                            textViewGrup3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[2]=false;
                        }

                    }
                }
        );
        seekBarManipulacja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup3Value!=0){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3Value==0){
                            textViewGrup3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[2]=true;
                        }
                        else{
                            textViewGrup3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[2]=false;
                        }

                    }
                }
        );
        seekBarOpanowanie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=1;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=1)
                            seekBar.setProgress(1);

                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {


                        if (progress < 1) {
                            seekBar.setProgress(progress=1);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);

                        }

                        if(progresBefore<progress&&textViewGrup3Value!=0){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrup3.setText(String.valueOf(textViewGrup3Value+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3Value==0){
                            textViewGrup3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctAtributsSet[2]=true;
                        }
                        else{
                            textViewGrup3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[2]=false;
                        }

                    }
                }
        );







        waliduj=(Button) rootView.findViewById(R.id.buttonWalidujAtrybuty);
        waliduj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w=textViewGrup1Value+textViewGrup2Value+textViewGrup3Value;
                if((w==0||w==12)&&radioButton1_5.isEnabled()){

                    for (RadioButton radio:listOfRadioButtons) {
                        radio.setEnabled(false);
                    }
                    for (SeekBar bar:listOfSeekBars) {
                        bar.setEnabled(true);

                    }
                    waliduj.setText("Odblokuj");
                    Toast.makeText(rootView.getContext(),"Zablokowane"+w,Toast.LENGTH_LONG).show();
                }
                else {
                    for (RadioButton radio:listOfRadioButtons) {
                        radio.setEnabled(true);
                    }
                    for (SeekBar bar:listOfSeekBars) {
                        bar.setEnabled(false);

                    }
                    waliduj.setText("Waliduj radiobuttons");
                    Toast.makeText(rootView.getContext(),"NIeZablokowane:"+w,Toast.LENGTH_LONG).show();
                }
            }
        });

        textViewGrupUM1 =  rootView.findViewById(R.id.textViewGrup1UM);
        textViewGrupUM2 =  rootView.findViewById(R.id.textViewGrup2UM);
        textViewGrupUM3 =  rootView.findViewById(R.id.textViewGrup3UM);
        final RadioGroup radioGroup1UM =  rootView .findViewById(R.id.RadioGrupUmiejetnosci1);
        final RadioGroup radioGroup2UM =  rootView .findViewById(R.id.RadioGrupUmiejetnosci2);
        final RadioGroup radioGroup3UM = rootView .findViewById(R.id.RadioGrupUmiejetnosci3);
        listOfRadioButtonsUM.add(radioButtonUM1_11 = rootView.findViewById(R.id.radioButtonGrupUM1_11));
        listOfRadioButtonsUM.add(radioButtonUM1_7 =  rootView.findViewById(R.id.radioButtonGrupUM1_7));
        listOfRadioButtonsUM.add(radioButtonUM1_4 =  rootView.findViewById(R.id.radioButtonGrupUM1_4));
        listOfRadioButtonsUM.add(radioButtonUM2_11 = rootView.findViewById(R.id.radioButtonGrupUM2_11));
        listOfRadioButtonsUM.add(radioButtonUM2_7 = rootView.findViewById(R.id.radioButtonGrupUM2_7));
        listOfRadioButtonsUM.add(radioButtonUM2_4 =  rootView.findViewById(R.id.radioButtonGrupUM2_4));
        listOfRadioButtonsUM.add(radioButtonUM3_11 =  rootView.findViewById(R.id.radioButtonGrupUM3_11));
        listOfRadioButtonsUM.add(radioButtonUM3_7=  rootView.findViewById(R.id.radioButtonGrupUM3_7));
        listOfRadioButtonsUM.add(radioButtonUM3_4 =  rootView.findViewById(R.id.radioButtonGrupUM3_4));



        radioGroup1UM.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrupUM1_11:

                        textViewGrup1ValueUM = 11;

                        textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM));

                        break;
                    case R.id.radioButtonGrupUM1_7:

                        textViewGrup1ValueUM = 7;

                        textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM));

                        break;
                    case R.id.radioButtonGrupUM1_4:

                        textViewGrup1ValueUM = 4;

                        textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM));

                        break;
                }
            }
        });
        radioGroup2UM.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrupUM2_11:

                        textViewGrup2ValueUM = 11;

                        textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM));

                        break;
                    case R.id.radioButtonGrupUM2_7:

                        textViewGrup2ValueUM = 7;

                        textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM));

                        break;
                    case R.id.radioButtonGrupUM2_4:

                        textViewGrup2ValueUM = 4;

                        textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM));

                        break;
                }
            }
        });

        radioGroup3UM.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected

                switch(checkedId) {
                    case R.id.radioButtonGrupUM3_11:

                        textViewGrup3ValueUM = 11;

                        textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM));

                        break;
                    case R.id.radioButtonGrupUM3_7:

                        textViewGrup3ValueUM = 7;

                        textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM));

                        break;
                    case R.id.radioButtonGrupUM3_4:

                        textViewGrup3ValueUM = 4;

                        textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM));

                        break;
                }
            }
        });


        listOfSeekBarsUM.add(seekBarDedukcja=rootView.findViewById(R.id.seekBarDedukcja));
        listOfSeekBarsUM.add(seekBarInformatyka=rootView.findViewById(R.id.seekBarInformatyka));
        listOfSeekBarsUM.add(seekBarMedycyna=rootView.findViewById(R.id.seekBarMedycyna));
        listOfSeekBarsUM.add(seekBarMedycyna=rootView.findViewById(R.id.seekBarMedycyna));
        listOfSeekBarsUM.add(seekBarNauka=rootView.findViewById(R.id.seekBarNauka));
        listOfSeekBarsUM.add(seekBarOkultyzm=rootView.findViewById(R.id.seekBarOkultyzm));
        listOfSeekBarsUM.add(seekBarPolityka=rootView.findViewById(R.id.seekBarPolityka));
        listOfSeekBarsUM.add(seekBarRzemioslo=rootView.findViewById(R.id.seekBarRzemioslo));
        listOfSeekBarsUM.add(seekBarWyksztalcenie=rootView.findViewById(R.id.seekBarWyksztalcenie));

        listOfSeekBarsUM.add(seekBarBijatyka=rootView.findViewById(R.id.seekBarBijatyka));
        listOfSeekBarsUM.add(seekBarBronBiala=rootView.findViewById(R.id.seekBarBronBiala));
        listOfSeekBarsUM.add(seekBarBronPalna=rootView.findViewById(R.id.seekBarBornPalna));
        listOfSeekBarsUM.add(seekBarProwadzenie=rootView.findViewById(R.id.seekBarProwadzenie));
        listOfSeekBarsUM.add(seekBarPrzetrwanie=rootView.findViewById(R.id.seekBarPrzetrwanie));
        listOfSeekBarsUM.add(seekBarSkradanie=rootView.findViewById(R.id.seekBarSkradanie));
        listOfSeekBarsUM.add(seekBarWysportowanie=rootView.findViewById(R.id.seekBarWysportowanie));
        listOfSeekBarsUM.add(seekBarZlodziejstwwo=rootView.findViewById(R.id.seekBarZlodziejstwo));

        listOfSeekBarsUM.add(seekBarEspresja=rootView.findViewById(R.id.seekBarEkspresja));
        listOfSeekBarsUM.add(seekBarEmpatia=rootView.findViewById(R.id.seekBarEmpatia));
        listOfSeekBarsUM.add(seekBarObycie=rootView.findViewById(R.id.seekBarObycie));
        listOfSeekBarsUM.add(seekBarOszustwo=rootView.findViewById(R.id.seekBarOszustwo));
        listOfSeekBarsUM.add(seekBarPerswazja=rootView.findViewById(R.id.seekBarPerswazja));
        listOfSeekBarsUM.add(seekBarPolswiatek=rootView.findViewById(R.id.seekBarPolswiatek));
        listOfSeekBarsUM.add(seekBarZastraszenie=rootView.findViewById(R.id.seekBarZastraszanie));
        listOfSeekBarsUM.add(seekBarZwierzeta=rootView.findViewById(R.id.seekBarZwierzeta));

        ///TO-DO reszta seekbarów;


        for (SeekBar bar:listOfSeekBarsUM) {
            bar.setEnabled(false);

        }

        final boolean[] correctSkillsSet= new boolean[]{false,false,false};
        seekBarDedukcja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );


        seekBarInformatyka.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarMedycyna.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarNauka.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarOkultyzm.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarPolityka.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarRzemioslo.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarWyksztalcenie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup1ValueUM!=0){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM1.setText(String.valueOf(textViewGrup1ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup1ValueUM==0){
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[0]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarBijatyka.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarBronBiala.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarBronPalna.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarProwadzenie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarPrzetrwanie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarSkradanie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarWysportowanie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarZlodziejstwwo.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup2ValueUM!=0){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM2.setText(String.valueOf(textViewGrup2ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup2ValueUM==0){
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[1]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );

        seekBarEspresja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarEmpatia.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarObycie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarOszustwo.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarPerswazja.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarPolswiatek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarZastraszenie.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        seekBarZwierzeta.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener(){

                    int progresBefore=0;
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        if(seekBar.getProgress()>=5)
                            seekBar.setProgress(5);
                        if(seekBar.getProgress()<=0)
                            seekBar.setProgress(0);
                    }

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser)
                    {



                        if (progress < 0) {
                            seekBar.setProgress(progress=0);

                        }
                        if(progress>5) {
                            seekBar.setProgress(progress = 5);
                            //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                        }

                        if(progresBefore<progress&&textViewGrup3ValueUM!=0){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM-=1));

                            progresBefore=progress;
                            seekBar.setProgress(progress=progresBefore);
                        }
                        else if(progresBefore>progress){
                            textViewGrupUM3.setText(String.valueOf(textViewGrup3ValueUM+=1));
                            progresBefore=progress;
                        }
                        if(progresBefore!=progress){
                            seekBar.setProgress(progresBefore);
                        }
                        if(textViewGrup3ValueUM==0){
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#3300FF00"));
                            correctSkillsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctSkillsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
        ///ToDO reszta seekbarów zbindowac




/*
*/

        walidujUmiejetnosci=(Button) rootView.findViewById(R.id.buttonWalidujUmiejetnosci);
        walidujUmiejetnosci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w=textViewGrup1ValueUM+textViewGrup2ValueUM+textViewGrup3ValueUM;
                if((w==0||w==22)&&(radioButtonUM1_11.isEnabled()))//&&!radioButtonUM2_11.isEnabled()&&!radioButtonUM3_11.isEnabled())||(!radioButtonUM1_11.isEnabled()&&radioButtonUM2_11.isEnabled()&&!radioButtonUM3_11.isEnabled())||(!radioButtonUM1_11.isEnabled()&&!radioButtonUM2_11.isEnabled()&&radioButtonUM3_11.isEnabled())){
                {
                    for (RadioButton radio:listOfRadioButtonsUM) {
                        radio.setEnabled(false);
                    }
                    for (SeekBar bar:listOfSeekBarsUM) {
                        bar.setEnabled(true);

                    }
                    walidujUmiejetnosci.setText("Odblokuj");
                    Toast.makeText(rootView.getContext(),"Zablokowane"+w,Toast.LENGTH_LONG).show();
                }
                else {
                    for (RadioButton radio:listOfRadioButtonsUM) {
                        radio.setEnabled(true);
                    }
                    for (SeekBar bar:listOfSeekBarsUM) {
                        bar.setEnabled(false);

                    }
                    walidujUmiejetnosci.setText("Waliduj radiobuttons");
                    Toast.makeText(rootView.getContext(),"NIeZablokowane:"+w,Toast.LENGTH_LONG).show();
                }
            }
        });
        SQLiteDatabase mDatabase = openOrCreateDatabase("db_card", SQLiteDatabase.OPEN_READWRITE, null);
        mDatabase.setLocale(Locale.getDefault());
        final MySQLiteHelper db = new MySQLiteHelper(this);
        dodajKarteDoBazy = rootView.findViewById(R.id.buttonDodaj_Karte_doBazy);
        dodajKarteDoBazy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TO-DO z danych dodać
                imie=((EditText) rootView.findViewById(R.id.editTextImie)).getText().toString();
                wiek=((EditText) rootView.findViewById(R.id.editTextWiek)).getText().toString();
                gracz=((EditText) rootView.findViewById(R.id.editTextGracz)).getText().toString();

                koncept=((EditText) rootView.findViewById(R.id.editTextKoncept)).getText().toString();
                cnota=((EditText) rootView.findViewById(R.id.editTextCnota)).getText().toString();
                skaza=((EditText) rootView.findViewById(R.id.editTextSkaza)).getText().toString();

                kronika=((EditText) rootView.findViewById(R.id.editTextKronika)).getText().toString();
                frakcja=((EditText) rootView.findViewById(R.id.editTextFrakcja)).getText().toString();
                nazwaGrupy=((EditText) rootView.findViewById(R.id.editTextNazwaGrupy)).getText().toString();

                ///INNE
                Atut1=((EditText) rootView.findViewById(R.id.editTextAtut1)).getText().toString();
                Atut2=((EditText) rootView.findViewById(R.id.editTextAtut2)).getText().toString();
                Atut3=((EditText) rootView.findViewById(R.id.editTextAtut3)).getText().toString();
                Atut4=((EditText) rootView.findViewById(R.id.editTextAtut4)).getText().toString();
                Atut5=((EditText) rootView.findViewById(R.id.editTextAtut5)).getText().toString();
                Atut6=((EditText) rootView.findViewById(R.id.editTextAtut6)).getText().toString();
                Atut7=((EditText) rootView.findViewById(R.id.editTextAtut7)).getText().toString();
                Atut8=((EditText) rootView.findViewById(R.id.editTextAtut8)).getText().toString();
                Atut9=((EditText) rootView.findViewById(R.id.editTextAtut9)).getText().toString();

                Atut1Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut1)).getProgress();
                Atut2Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut2)).getProgress();
                Atut3Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut3)).getProgress();
                Atut4Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut4)).getProgress();
                Atut5Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut5)).getProgress();
                Atut6Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut6)).getProgress();
                Atut7Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut7)).getProgress();
                Atut8Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut8)).getProgress();
                Atut9Val=((SeekBar)rootView.findViewById(R.id.seekBarAtut9)).getProgress();

                Wady1=((EditText) rootView.findViewById(R.id.editTextWada1)).getText().toString();
                Wady2=((EditText) rootView.findViewById(R.id.editTextWada2)).getText().toString();
                Wady3=((EditText) rootView.findViewById(R.id.editTextWada3)).getText().toString();
                rozmiar=((EditText) rootView.findViewById(R.id.editTextRozmiar)).getText().toString();
                szybkosc=((EditText) rootView.findViewById(R.id.editTextSzybkosc)).getText().toString();
                inicjatywa=((EditText)rootView.findViewById(R.id.editTextInicjatywa)).getText().toString();
                obrona=((EditText)rootView.findViewById(R.id.editTextObrona)).getText().toString();
                pancerz=((EditText)rootView.findViewById(R.id.editTextPancerz)).getText().toString();
                doswiadczenie=Integer.parseInt(((EditText) rootView.findViewById(R.id.editTextDoswiadczenie)).getText().toString());
                zdrowie=Integer.parseInt(((EditText) rootView.findViewById(R.id.editTextZdrowie)).getText().toString());
                silaWoli=Integer.parseInt(((EditText) rootView.findViewById(R.id.editTextSilaWoli)).getText().toString());
                moralnosc=Integer.parseInt(((EditText) rootView.findViewById(R.id.editTextMoralnosc)).getText().toString());



                //TODO reszta zbindować pod przyciskiem

                /*



                private String Bron1;
                private int BronMod1;
                private String Bron2;
                private int BronMod2;
                private String Bron3;
                private int BronMod3;
                private String Wyp1;
                private int WypMod1;
                private String Wyp2;
                private int WypMod2;
                private String Wyp3;
                private int WypMod3;
*/

                //Todo z umiejetnosci
                //Todo z atrybutow





                if(correctAtributsSet[0]&&correctAtributsSet[1]&&correctAtributsSet[2]&&
                        correctSkillsSet[0]&&correctSkillsSet[1]&&correctSkillsSet[2]){

                    //Todo do karty postaci
                    KARTA_POSTACI.setImie(imie);
                    KARTA_POSTACI.setGracz(gracz);

                    db.addKP(KARTA_POSTACI);
                    Toast.makeText(rootView.getContext(),"Dodan "+Atut1,Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(rootView.getContext(),"Nieudane "+Atut1,Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
