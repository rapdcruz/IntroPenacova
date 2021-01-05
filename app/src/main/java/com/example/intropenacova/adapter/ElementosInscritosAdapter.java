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
import com.example.intropenacova.model.ElementosInscritos;
import com.example.intropenacova.model.ElementosPoliticaPrivacidade;

import java.util.ArrayList;

public class ElementosInscritosAdapter extends ArrayAdapter<ElementosInscritos> {
    private Context mContext;
    private int mResource;

    //usar array list
    public ElementosInscritosAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ElementosInscritos> objects) {
        super(context, resource, objects);
        this.mContext=context;
        this.mResource=resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);
        TextView txtnome = convertView.findViewById(R.id.text1);
        TextView txtequipa = convertView.findViewById(R.id.text2);

        txtnome.setText(getItem(position).getNome());
        txtequipa.setText(getItem(position).getEquipa());

        return convertView;
    }

}


