package com.example.intropenacova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.intropenacova.R;
import com.example.intropenacova.model.ElementosPoliticaPrivacidade;
import com.example.intropenacova.model.ElementosRegulamento;

import java.util.ArrayList;

public class ElementosPoliticaPrivacidadeAdapter extends ArrayAdapter<ElementosPoliticaPrivacidade> {

    private Context mContext;
    private int mResource;

    //usar array list
    public ElementosPoliticaPrivacidadeAdapter(@NonNull Context context, int resource, @NonNull ArrayList <ElementosPoliticaPrivacidade> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        TextView txttitulo = convertView.findViewById(R.id.Titulo_Politica_Privacidade);
        TextView txtconteudopolitica = convertView.findViewById(R.id.texto_Politica_Privacidade);
        txttitulo.setText(getItem(position).getTitulo_politicaPrivacidade());
        txtconteudopolitica.setText(getItem(position).getTexto_politicaPrivacidade());
        return convertView;
    }
}





