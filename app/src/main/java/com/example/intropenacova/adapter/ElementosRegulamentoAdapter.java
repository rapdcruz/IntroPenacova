package com.example.intropenacova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.intropenacova.R;
import com.example.intropenacova.model.ElementosRegulamento;

import java.util.ArrayList;

public class ElementosRegulamentoAdapter extends ArrayAdapter<ElementosRegulamento> {
    private Context  mContext;
    private int mResource;

    //i want to use array list

    public ElementosRegulamentoAdapter(@NonNull Context context, int resource, @NonNull ArrayList <ElementosRegulamento> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent, false);
        TextView txtName = convertView.findViewById(R.id.Titulo_regulamento);
        TextView txtDes = convertView.findViewById(R.id.texto_regulamentoConteudo);
        txtName.setText(getItem(position).getTitulo());
        txtDes.setText(getItem(position).getDescricao());
        return convertView;
    }
}
