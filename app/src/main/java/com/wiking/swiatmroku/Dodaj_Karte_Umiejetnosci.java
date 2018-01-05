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
    private List<RadioButton> listOfRadioButtonsUM=new ArrayList<RadioButton>();
    private List<SeekBar> listOfSeekBarsUM = new ArrayList<SeekBar>();
    private Button walidujUmiejetnosci;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dodaj_karte_umiejetnosci, container, false);
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

        return rootView;
    }
}
