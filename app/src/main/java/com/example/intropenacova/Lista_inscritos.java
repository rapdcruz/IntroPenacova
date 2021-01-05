package com.example.intropenacova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.intropenacova.adapter.ElementosInscritosAdapter;
import com.example.intropenacova.model.ElementosInscritos;

import java.util.ArrayList;

public class Lista_inscritos extends AppCompatActivity {
    ListView listViewInscritos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inscritos);

        listViewInscritos = findViewById(R.id.id_listView_inscritos);
        //create data
        ArrayList<ElementosInscritos> arrayList = new ArrayList<>();
        
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));
        arrayList.add(new ElementosInscritos("Nomeeeeee","equipaaaa"));


        //custom adapter

        ElementosInscritosAdapter elementosInscritosAdapter = new ElementosInscritosAdapter(this,R.layout.list_inscritos_adapter,arrayList);

        listViewInscritos.setAdapter(elementosInscritosAdapter);
    }
}




