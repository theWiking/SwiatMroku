package com.wiking.swiatmroku;

/**
 * Created by Wiking on 02.01.2018.
 * passing date https://www.youtube.com/watch?v=_4i5Jk5RnFA
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Dodaj_Karte_Dane extends Fragment {

    String imie;
    String wiek;
    String gracz;
    String koncept;
    String cnota;
    String skaza;
    String kronika;
    String frakcja;
    String nazwaGrupy;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dodaj_karte_dane, container, false);
        imie=((EditText) rootView.findViewById(R.id.editTextImie)).getText().toString();
        wiek=((EditText) rootView.findViewById(R.id.editTextWiek)).getText().toString();
        gracz=((EditText) rootView.findViewById(R.id.editTextGracz)).getText().toString();

        koncept=((EditText) rootView.findViewById(R.id.editTextKoncept)).getText().toString();
        cnota=((EditText) rootView.findViewById(R.id.editTextCnota)).getText().toString();
        skaza=((EditText) rootView.findViewById(R.id.editTextSkaza)).getText().toString();

        kronika=((EditText) rootView.findViewById(R.id.editTextKronika)).getText().toString();
        frakcja=((EditText) rootView.findViewById(R.id.editTextFrakcja)).getText().toString();
        nazwaGrupy=((EditText) rootView.findViewById(R.id.editTextNazwaGrupy)).getText().toString();

/*
        Button button = rootView.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("imie",imie);
                bundle.putString("wiek",wiek);
                bundle.putString("gracz",gracz);
                bundle.putString("koncept",koncept);
                bundle.putString("cnota",cnota);
                bundle.putString("skaza",skaza);
                bundle.putString("kronika",kronika);
                bundle.putString("frakcja",frakcja);;
                bundle.putString("nazwaGrupy",nazwaGrupy);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                Dodaj_Karte_Inne dodaj_karte_inne = new Dodaj_Karte_Inne();
                dodaj_karte_inne.setArguments(bundle);

                fragmentTransaction.replace(R.id.main_content,dodaj_karte_inne);
                fragmentTransaction.commit();
            }
        });
        /*
        bundle.putString("imie",imie);
        bundle.putString("wiek",wiek);
        bundle.putString("gracz",gracz);
        bundle.putString("koncept",koncept);
        bundle.putString("cnota",cnota);
        bundle.putString("skaza",skaza);
        bundle.putString("kronika",kronika);
        bundle.putString("frakcja",frakcja);;
        bundle.putString("nazwaGrupy",nazwaGrupy);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Dodaj_Karte_Inne dodaj_karte_inne = new Dodaj_Karte_Inne();
        dodaj_karte_inne.setArguments(bundle);

        fragmentTransaction.replace(R.id.main_content,dodaj_karte_inne);
        fragmentTransaction.commit();
*/

        return rootView;
    }
   // @Override
   /* public void onDetach() {

        super.onDetach();

        Bundle bundle = new Bundle();
        bundle.putString("DaneImie",imie);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Dodaj_Karte_Inne inne =new Dodaj_Karte_Inne();
        inne.setArguments(bundle);
        fragmentTransaction.replace(R.id.main_content,inne);
        fragmentTransaction.commit();
    }*/
}
