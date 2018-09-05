package br.com.ibgenesis.fragmentsnew.fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.ibgenesis.fragmentsnew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends android.support.v4.app.Fragment {

    private TextView textContato;

    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);

        textContato = view.findViewById(R.id.textContato);
        textContato.setText("Contatos alterado");

        return view;
    }

}
