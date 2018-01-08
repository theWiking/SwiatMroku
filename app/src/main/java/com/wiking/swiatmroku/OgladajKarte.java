package com.wiking.swiatmroku;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
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
    private TextView ODaneInne;

    private TextView OAtuty;
   private TextView OWady;
   private TextView Bron;
   private TextView WYposazenie;

   private TextView Dedukcja;
   private TextView Informatyka;
   private TextView Medycyna;
   private TextView Nauka;
   private TextView Okultyzm;
   private TextView Polityka;
   private TextView Rzemioslo;
   private TextView Wyksztalcenie;

    private TextView Bijatyka;
    private TextView BronBiala;
    private TextView BronPalna;
    private TextView Prowadzenie;
    private TextView Przetrwanie;
    private TextView Skradanie;
    private TextView Wysportowanie;
    private TextView Zlodziejstwo;

    private TextView Ekspresja;
    private TextView Empatia;
    private TextView Obycie;
    private TextView Oszustwo;
    private TextView Perswazja;
    private TextView Polswiatek;
    private TextView Zastraszeni;
    private TextView Zwierzeta;

    private SeekBar ZycieMax;
    private SeekBar Zycie;
    private SeekBar SilaWoliMax;
    private SeekBar SilaWoli;


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

        ODaneInne=rootView.findViewById(R.id.ODaneInne);
        ODaneInne.setText("Szybkość: "+KP.getSzybkosc()+"\nRozmiar: "+KP.getSzybkosc()+"\nInicjatywa: "+KP.getInicjatywa()+"\nObrona: "+KP.getObrona()+"\nPancerz: "+KP.getPancerz()+"\nDoswiadczenie: "+KP.getDoswiadczenie()+"\nMoralność: "+KP.getMoralnosc());

        OInteligencja =rootView.findViewById(R.id.OInteligencja);
        OInteligencja.setText("Inteligencja:"+ HowManyDots(KP.getInteligencja(),5));

        OSila=rootView.findViewById(R.id.OSila);
        OSila.setText("Siła:"+HowManyDots(KP.getSila(),5));

        OPrezencja=rootView.findViewById(R.id.OPrezencja);
        OPrezencja.setText("Prezencja:"+HowManyDots(KP.getPrezentacja(),5));

        OCzujnosc=rootView.findViewById(R.id.OCzujnosc);
        OCzujnosc.setText("Czujność:"+HowManyDots(KP.getCzujnosc(),5));

        OZrecznosc=rootView.findViewById(R.id.OZrecznosc);
        OZrecznosc.setText("Zręczność:"+HowManyDots(KP.getZrecznosc(),5));

        OManipulacja=rootView.findViewById(R.id.OManipulacja);
        OManipulacja.setText("Manipulacja:"+HowManyDots(KP.getManipulacja(),5));

        ODeterminacja=rootView.findViewById(R.id.ODeterminacja);
        ODeterminacja.setText("Determinacja:"+HowManyDots(KP.getDeterminacja(),5));

        OWytrzymalosc=rootView.findViewById(R.id.OWytrzymalosc);
        OWytrzymalosc.setText("Wytrzymałośc:"+HowManyDots(KP.getWytrzymalosc(),5));

        OOpanowanie=rootView.findViewById(R.id.OOpanowanie);
        OOpanowanie.setText("Opanowanie:"+HowManyDots(KP.getOpanowanie(),5));

        Dedukcja=rootView.findViewById(R.id.ODedukcja);
        Informatyka=rootView.findViewById(R.id.OInformatyka);
        Medycyna=rootView.findViewById(R.id.OMedycyna);
        Nauka=rootView.findViewById(R.id.ONauka);
        Okultyzm=rootView.findViewById(R.id.OOkultyzm);
        Polityka=rootView.findViewById(R.id.OPolityka);
        Rzemioslo=rootView.findViewById(R.id.ORzemioslo);
        Wyksztalcenie=rootView.findViewById(R.id.OWyksztalcenie);

        Bijatyka=rootView.findViewById(R.id.OBijatyka);
        BronBiala=rootView.findViewById(R.id.OBronBiala);
        BronPalna=rootView.findViewById(R.id.OBronPalna);
        Prowadzenie=rootView.findViewById(R.id.OProwadzeni);
        Przetrwanie=rootView.findViewById(R.id.OPrzetrwanie);
        Skradanie=rootView.findViewById(R.id.OSkradanie);
        Wysportowanie=rootView.findViewById(R.id.OWysportowanie);
        Zlodziejstwo=rootView.findViewById(R.id.OZlodziejstwo);

        Ekspresja=rootView.findViewById(R.id.OEkspresja);
        Empatia=rootView.findViewById(R.id.OEmpatia);
        Obycie=rootView.findViewById(R.id.OObycie);
        Oszustwo=rootView.findViewById(R.id.OOszustwo);
        Perswazja=rootView.findViewById(R.id.OPersfazja);
        Polswiatek=rootView.findViewById(R.id.OPolswiatek);
        Zastraszeni=rootView.findViewById(R.id.OZastraszeni);
        Zwierzeta=rootView.findViewById(R.id.OZwierzeta);

        Dedukcja.setText("Dedukcja: "+HowManyDots(KP.getDedukcja(),5));
        Informatyka.setText("Informatyka: "+HowManyDots(KP.getInformatyka(),5));
        Medycyna.setText("Medycyna: "+HowManyDots(KP.getMedycyna(),5));
        Nauka.setText("Nauka: "+HowManyDots(KP.getNauka(),5));
        Okultyzm.setText("Okultyzm: "+HowManyDots(KP.getOkultyzm(),5));
        Polityka.setText("Polityka: "+HowManyDots(KP.getPolityka(),5));

        Rzemioslo.setText("Rzemioslo: "+HowManyDots(KP.getRzemioslo(),5));
        Wyksztalcenie.setText("Wyksztalcenie: "+HowManyDots(KP.getWyksztalcenie(),5));
        Bijatyka.setText("Bijatyka: "+HowManyDots(KP.getBijatyka(),5));
        BronBiala.setText("BronBiala: "+HowManyDots(KP.getBronBiala(),5));
        BronPalna.setText("BronPalna: "+HowManyDots(KP.getBronPalna(),5));
        Prowadzenie.setText("Prowadzenie: "+HowManyDots(KP.getProwadzenie(),5));
        Przetrwanie.setText("Przetrwanie: "+HowManyDots(KP.getPrzetrwanie(),5));
        Skradanie.setText("Skradanie: "+HowManyDots(KP.getSkradanie(),5));

        Wysportowanie.setText("Wysportowanie: "+HowManyDots(KP.getWysportowanie(),5));
        Zlodziejstwo.setText("Zlodziejstwo: "+HowManyDots(KP.getZlodziejstwo(),5));
        Ekspresja.setText("Ekspresja: "+HowManyDots(KP.getEkspresja(),5));
        Empatia.setText("Empatia: "+HowManyDots(KP.getEmpatia(),5));
        Obycie.setText("Obycie: "+HowManyDots(KP.getObycie(),5));

        Oszustwo.setText("Oszustwo: "+HowManyDots(KP.getOszustwo(),5));


        Perswazja.setText("Perswazja: "+HowManyDots(KP.getPreswazja(),5));

        Polswiatek.setText("Polswiatek: "+HowManyDots(KP.getPolswiate(),5));
        Zastraszeni.setText("Zastraszani: "+HowManyDots(KP.getZatraszanie(),5));
        Zwierzeta.setText("Zwierzeta: "+HowManyDots(KP.getZwierzeta(),5));


        OAtuty=rootView.findViewById(R.id.textViewAtuty);

        String Atuty="";

        if(KP.getAt1Nazwa().length()>0) {
            Atuty += KP.getAt1Nazwa() + ": " + HowManyDots(KP.getAt1Wartosc(), 5) + "\n";
        }
        if(KP.getAt2Nazwa().length()>0){
            Atuty+=KP.getAt2Nazwa()+": "+HowManyDots(KP.getAt2Wartosc(),5)+"\n";
        }
        if(KP.getAt3Nazwa().length()>0){
            Atuty+=KP.getAt3Nazwa()+": "+HowManyDots(KP.getAt3Wartosc(),5)+"\n";
        }
        if(KP.getAt4Nazwa().length()>0){
            Atuty+=KP.getAt4Nazwa()+": "+HowManyDots(KP.getAt4Wartosc(),5)+"\n";
        }
        if(KP.getAt5Nazwa().length()>0){
            Atuty+=KP.getAt5Nazwa()+": "+HowManyDots(KP.getAt5Wartosc(),5)+"\n";
        }
        if(KP.getAt6Nazwa().length()>0){
            Atuty+=KP.getAt6Nazwa()+": "+HowManyDots(KP.getAt6Wartosc(),5)+"\n";
        }
        if(KP.getAt7Nazwa().length()>0){
            Atuty+=KP.getAt7Nazwa()+": "+HowManyDots(KP.getAt7Wartosc(),5)+"\n";
        }
        if(KP.getAt8Nazwa().length()>0){
            Atuty+=KP.getAt8Nazwa()+": "+HowManyDots(KP.getAt8Wartosc(),5)+"\n";
        }
        if(KP.getAt9Nazwa().length()>0){
            Atuty+=KP.getAt9Nazwa()+": "+HowManyDots(KP.getAt9Wartosc(),5)+"\n";
        }
        if(Atuty=="") {
            OAtuty.setText("Brak atutów do wyświetlenia");
        }
        else{
            OAtuty.setText(Atuty);
        }

        OWady=rootView.findViewById(R.id.textViewWady);
        String Wady="";


        if(KP.getWada1Nazwa().length()>0) {
            Wady += (KP.getWada1Nazwa() + "\n");
        }
        if(KP.getWada2Nazwa().length()>0) {
            Wady += (KP.getWada2Nazwa() + "\n");
        }
        if(KP.getWada3Nazwa().length()>0) {
            Wady += (KP.getWada3Nazwa() + "\n");
        }
        if(KP.getWada4Nazwa().length()>0) {
            Wady += (KP.getWada4Nazwa() + "\n");
        }
        Log.i("testy","Atu1="+KP.getAt1Nazwa());
        if(Wady=="") {
            OWady.setText("Brak wad do wyświetlenia");
        }
        else {
           OWady.setText(Wady);
        }

        Bron=rootView.findViewById(R.id.textViewOBron);
        WYposazenie=rootView.findViewById(R.id.textViewOWyp);
        String stringBron="";
        if(KP.getBron1Nazwa().length()>0){
            stringBron+=KP.getBron1Nazwa()+": "+HowManyDots(KP.getBron1Mod(),5)+"\n";
        }
        if(KP.getBron2Nazwa().length()>0){
            stringBron+=KP.getBron2Nazwa()+": "+HowManyDots(KP.getBron2Mod(),5)+"\n";
        }
        if(KP.getBron3Nazwa().length()>0){
            stringBron+=KP.getBron3Nazwa()+": "+HowManyDots(KP.getBron3Mod(),5)+"\n";
        }
        if(stringBron==""){
            Bron.setText("Brak Broni do wyświetlenia");
        }
        else {
            Bron.setText(stringBron);
        }
        String wyp="";
        if(KP.getWyp1Nazwa().length()>0){
            wyp+=KP.getWyp1Nazwa()+" mod "+KP.getWyp1Mod()+"\n";
        }
        if(KP.getWyp2Nazwa().length()>0){
            wyp+=KP.getWyp2Nazwa()+" mod "+KP.getWyp2Mod()+"\n";
        }
        if(KP.getWyp3Nazwa().length()>0){
            wyp+=KP.getWyp3Nazwa()+" mod "+KP.getWyp3Mod()+"\n";
        }
        if(wyp==""){
            WYposazenie.setText("Brak wyposażenia");
        }
        else {
            WYposazenie.setText(wyp);
        }

        //Sekkbary
        ZycieMax=rootView.findViewById(R.id.seekBarZdrowieMax);
        Zycie=rootView.findViewById(R.id.seekBarZdrowie);

        SilaWoliMax=rootView.findViewById(R.id.seekBarSilaWoliMax);
        SilaWoli=rootView.findViewById(R.id.seekBarSilaWoli);

        ZycieMax.setProgress(KP.getZdrowieMax());
        ZycieMax.setEnabled(false);
        SilaWoliMax.setProgress(KP.getSilaWoliMax());
        SilaWoliMax.setEnabled(false);
        SilaWoli.setProgress(SilaWoliMax.getProgress());
        Zycie.setProgress(ZycieMax.getProgress());

        Zycie.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                if (progress < 0) {
                    seekBar.setProgress(progress=0);

                }
                if(progress>ZycieMax.getProgress()) {
                    seekBar.setProgress(progress = ZycieMax.getProgress());
                    //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SilaWoli.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                if (progress < 0) {
                    seekBar.setProgress(progress=0);

                }
                if(progress>SilaWoliMax.getProgress()) {
                    seekBar.setProgress(progress = SilaWoliMax.getProgress());
                    //textViewGrup1.setText(String.valueOf(textViewGrup1Value = textViewGrup1Value - progress + 1));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
