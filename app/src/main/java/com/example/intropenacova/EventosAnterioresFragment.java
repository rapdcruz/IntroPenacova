package com.example.intropenacova;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intropenacova.adapter.Barra_ElementoEventosAnterioresAdapter;
import com.example.intropenacova.model.Barra_ElementoEventosAnteriores;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EventosAnterioresFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EventosAnterioresFragment extends Fragment {

    RecyclerView  AnterioresRecycler;
    Barra_ElementoEventosAnterioresAdapter barra_ElementoEventosAnterioresAdapter_;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EventosAnterioresFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BasketFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventosAnterioresFragment newInstance(String param1, String param2) {
        EventosAnterioresFragment fragment = new EventosAnterioresFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup root =  (ViewGroup) inflater.inflate(R.layout.fragment_eventosanteriores, container, false);

        List<Barra_ElementoEventosAnteriores> EventosAnterioresListBarra = new ArrayList<>();

        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Rota da Lampreia", "01/03/2020", R.drawable.rotadalampreia));
        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Funny Run", "23/03/2013", R.drawable.funnyrun));
        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Btt", "17/03/2019", R.drawable.btt));
        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Rota da Lampreia", "01/03/2020", R.drawable.rotadalampreia));
        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Funny Run", "23/03/2013", R.drawable.funnyrun));
        EventosAnterioresListBarra.add(new Barra_ElementoEventosAnteriores("Btt", "17/03/2019", R.drawable.btt));

        AnterioresRecycler = root.findViewById(R.id.recyclerViewEventosAnterioresDaBarra);
        RecyclerView.LayoutManager layoutManagervertical = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        AnterioresRecycler.setLayoutManager(layoutManagervertical);
        barra_ElementoEventosAnterioresAdapter_ = new Barra_ElementoEventosAnterioresAdapter(getActivity(), EventosAnterioresListBarra);
        AnterioresRecycler.setAdapter(barra_ElementoEventosAnterioresAdapter_);

        return root;

    }
}










