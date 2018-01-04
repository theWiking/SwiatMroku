package com.wiking.swiatmroku;

/**
 * Created by Wiking on 02.01.2018.
 */
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Dodaj_Karte_Atrybuty extends Fragment implements SeekBar.OnSeekBarChangeListener {
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
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dodaj_karte_atrybuty, container, false);
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




            radioGroup1.setOnCheckedChangeListener(new OnCheckedChangeListener()
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
            radioGroup2.setOnCheckedChangeListener(new OnCheckedChangeListener()
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
            radioGroup3.setOnCheckedChangeListener(new OnCheckedChangeListener()
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






            return rootView;
    }
    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
       // textViewGrup1.setText("" + i);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
