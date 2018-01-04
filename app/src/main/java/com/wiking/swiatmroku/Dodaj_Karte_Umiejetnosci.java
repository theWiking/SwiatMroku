package com.wiking.swiatmroku;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wiking on 02.01.2018.
 */

public class Dodaj_Karte_Umiejetnosci extends Fragment {
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
    private List<RadioButton> listOfRadioButtons=new ArrayList<RadioButton>();
    private List<SeekBar> listOfSeekBars = new ArrayList<SeekBar>();
    private Button waliduj;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dodaj_karte_umiejetnosci, container, false);
      textViewGrupUM1 =  rootView.findViewById(R.id.textViewGrup1UM);
        textViewGrupUM2 =  rootView.findViewById(R.id.textViewGrup2UM);
        textViewGrupUM3 =  rootView.findViewById(R.id.textViewGrup3UM);
        final RadioGroup radioGroup1 =  rootView .findViewById(R.id.RadioGrupUmiejetnosci1);
        final RadioGroup radioGroup2 =  rootView .findViewById(R.id.RadioGrupUmiejetnosci2);
        final RadioGroup radioGroup3 = rootView .findViewById(R.id.RadioGrupUmiejetnosci3);
        listOfRadioButtons.add(radioButtonUM1_11 = rootView.findViewById(R.id.radioButtonGrupUM1_11));
        listOfRadioButtons.add(radioButtonUM1_7 =  rootView.findViewById(R.id.radioButtonGrupUM1_7));
        listOfRadioButtons.add(radioButtonUM1_4 =  rootView.findViewById(R.id.radioButtonGrupUM1_4));
        listOfRadioButtons.add(radioButtonUM2_11 = rootView.findViewById(R.id.radioButtonGrupUM2_11));
        listOfRadioButtons.add(radioButtonUM2_7 = rootView.findViewById(R.id.radioButtonGrupUM2_7));
        listOfRadioButtons.add(radioButtonUM2_4 =  rootView.findViewById(R.id.radioButtonGrupUM2_4));
        listOfRadioButtons.add(radioButtonUM3_11 =  rootView.findViewById(R.id.radioButtonGrupUM3_11));
        listOfRadioButtons.add(radioButtonUM3_7=  rootView.findViewById(R.id.radioButtonGrupUM3_7));
        listOfRadioButtons.add(radioButtonUM3_4 =  rootView.findViewById(R.id.radioButtonGrupUM3_4));

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
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
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
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

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
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


        listOfSeekBars.add(seekBarDedukcja=rootView.findViewById(R.id.seekBarDedukcja));
        listOfSeekBars.add(seekBarInformatyka=rootView.findViewById(R.id.seekBarInformatyka));
        listOfSeekBars.add(seekBarMedycyna=rootView.findViewById(R.id.seekBarMedycyna));
        listOfSeekBars.add(seekBarMedycyna=rootView.findViewById(R.id.seekBarMedycyna));
        listOfSeekBars.add(seekBarNauka=rootView.findViewById(R.id.seekBarNauka));
        listOfSeekBars.add(seekBarOkultyzm=rootView.findViewById(R.id.seekBarOkultyzm));
        listOfSeekBars.add(seekBarPolityka=rootView.findViewById(R.id.seekBarPolityka));
        listOfSeekBars.add(seekBarRzemioslo=rootView.findViewById(R.id.seekBarRzemioslo));
        listOfSeekBars.add(seekBarWyksztalcenie=rootView.findViewById(R.id.seekBarWyksztalcenie));

        listOfSeekBars.add(seekBarBijatyka=rootView.findViewById(R.id.seekBarBijatyka));
        listOfSeekBars.add(seekBarBronBiala=rootView.findViewById(R.id.seekBarBronBiala));
        listOfSeekBars.add(seekBarBronPalna=rootView.findViewById(R.id.seekBarBornPalna));
        listOfSeekBars.add(seekBarProwadzenie=rootView.findViewById(R.id.seekBarProwadzenie));
        listOfSeekBars.add(seekBarPrzetrwanie=rootView.findViewById(R.id.seekBarPrzetrwanie));
        listOfSeekBars.add(seekBarSkradanie=rootView.findViewById(R.id.seekBarSkradanie));
        listOfSeekBars.add(seekBarWysportowanie=rootView.findViewById(R.id.seekBarWysportowanie));
        listOfSeekBars.add(seekBarZlodziejstwwo=rootView.findViewById(R.id.seekBarZlodziejstwo));

        listOfSeekBars.add(seekBarEspresja=rootView.findViewById(R.id.seekBarEkspresja));
        listOfSeekBars.add(seekBarEmpatia=rootView.findViewById(R.id.seekBarEmpatia));
        listOfSeekBars.add(seekBarObycie=rootView.findViewById(R.id.seekBarObycie));
        listOfSeekBars.add(seekBarOszustwo=rootView.findViewById(R.id.seekBarOszustwo));
        listOfSeekBars.add(seekBarPerswazja=rootView.findViewById(R.id.seekBarPerswazja));
        listOfSeekBars.add(seekBarPolswiatek=rootView.findViewById(R.id.seekBarPolswiatek));
        listOfSeekBars.add(seekBarZastraszenie=rootView.findViewById(R.id.seekBarZastraszanie));
        listOfSeekBars.add(seekBarZwierzeta=rootView.findViewById(R.id.seekBarZwierzeta));

        ///TO-DO reszta seekbarów;


        for (SeekBar bar:listOfSeekBars) {
            bar.setEnabled(false);

        }

        final boolean[] correctAtributsSet= new boolean[]{false,false,false};
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[0]=true;
                        }
                        else{
                            textViewGrupUM1.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[0]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[1]=true;
                        }
                        else{
                            textViewGrupUM2.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[1]=false;
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
                            correctAtributsSet[2]=true;
                        }
                        else{
                            textViewGrupUM3.setBackgroundColor(Color.parseColor("#FFFF5555"));
                            correctAtributsSet[2]=false;
                        }
                        //  Toast.makeText(rootView.getContext(),textViewGrup1.getText().toString()+"",Toast.LENGTH_LONG).show();
                    }
                }
        );
    ///ToDO reszta seekbarów zbindowac




/*
*/

        waliduj=(Button) rootView.findViewById(R.id.buttonWalidujUmiejetnosci);
        waliduj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w=textViewGrup1ValueUM+textViewGrup2ValueUM+textViewGrup3ValueUM;
                if((w==0||w==22)&&(radioButtonUM1_11.isEnabled()))//&&!radioButtonUM2_11.isEnabled()&&!radioButtonUM3_11.isEnabled())||(!radioButtonUM1_11.isEnabled()&&radioButtonUM2_11.isEnabled()&&!radioButtonUM3_11.isEnabled())||(!radioButtonUM1_11.isEnabled()&&!radioButtonUM2_11.isEnabled()&&radioButtonUM3_11.isEnabled())){
                {
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

        return rootView;
    }
}
