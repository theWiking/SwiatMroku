package com.wiking.swiatmroku;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Wiking on 02.01.2018.
 */

public class Dodaj_Karte_Inne extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dodaj_karte_inne, container, false);


       /* Bundle bundle=getArguments();
       String nazwa = bundle.getString("imie");
        TextView textView =rootView.findViewById(R.id.wadytextview);
        textView.setText(nazwa);

        Toast.makeText(rootView.getContext(),nazwa+" 1",Toast.LENGTH_SHORT).show();
*/
        return rootView;
    }

}