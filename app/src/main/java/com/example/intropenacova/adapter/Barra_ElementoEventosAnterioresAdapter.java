package com.example.intropenacova.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.intropenacova.R;
import com.example.intropenacova.model.Barra_ElementoEventosAnteriores;

import java.util.List;


public class Barra_ElementoEventosAnterioresAdapter extends RecyclerView.Adapter <Barra_ElementoEventosAnterioresAdapter.BarraAnterioresViewHolder> {

    Context context;
    List<Barra_ElementoEventosAnteriores> EventosAnterioresListBarra;

    public Barra_ElementoEventosAnterioresAdapter(Context context, List<Barra_ElementoEventosAnteriores> EventosAnterioresListBarra){
        this.context = context;
        this.EventosAnterioresListBarra = EventosAnterioresListBarra;
    }

    @NonNull
    @Override
    public BarraAnterioresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item_eventos_anteriores_barra, parent, false);
        return new BarraAnterioresViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull BarraAnterioresViewHolder holder, int position) {

        holder.ImagemEvento.setImageResource(EventosAnterioresListBarra.get(position).getImagem_eventoAnterior());
        holder.tvNomeAnterior.setText(EventosAnterioresListBarra.get(position).getTextoNomeEventoAnterior());
        holder.tvDataAnterior.setText(EventosAnterioresListBarra.get(position).getTextoDataEventoAnterior());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"FALTA ABRIR DETALHESEVENTOSANTERIORES.", Toast.LENGTH_LONG).show();
          }
         });
    }

    @Override
    public int getItemCount() {
        return EventosAnterioresListBarra.size();
    }



    public static final class BarraAnterioresViewHolder extends RecyclerView.ViewHolder {

        ImageView ImagemEvento;
        TextView tvNomeAnterior;
        TextView tvDataAnterior;

        public BarraAnterioresViewHolder(@NonNull View itemView){
            super(itemView);

            ImagemEvento = itemView.findViewById(R.id.id_imagemEventosAnteriores_barra);
            tvNomeAnterior = itemView.findViewById(R.id.id_TextoNomeEventoAnteriores_barra);
            tvDataAnterior = itemView.findViewById(R.id.id_DataNomeEventoAnteriores_barra);


        }

    }



}

