package com.example.intropenacova;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.intropenacova.adapter.Barra_ElementoEventosRecomendadosAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactosFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactosFragment extends Fragment {

    EditText etNome, etSubject, etMessage;
    ImageView btSend;
    ImageView btMaps;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactosFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PromoCodeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactosFragment newInstance(String param1, String param2) {
        ContactosFragment fragment = new ContactosFragment();
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
        ViewGroup root =  (ViewGroup) inflater.inflate(R.layout.fragment_contactos, container, false);


        etNome = root.findViewById(R.id.et_name);
        etSubject = root.findViewById(R.id.et_subject);
        etMessage = root.findViewById(R.id.et_message);
        btSend = root.findViewById(R.id.bt_send);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = etNome.getText().toString();
                String strSubject = etSubject.getText().toString();
                String strMessage = etMessage.getText().toString();

                if(TextUtils.isEmpty(strUserName)) {
                    etNome.setError("Obrigatório preencher o campo nome");
                    return;
                }

                if(TextUtils.isEmpty(strSubject)) {
                    etSubject.setError("Obrigatório preencher o campo assunto");
                    return;
                }

                if(TextUtils.isEmpty(strMessage)) {
                    etMessage.setError("Obrigatório preencher o campo mensagem");
                    return;
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "cruz.a.rafael@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, etSubject.getText().toString());
                    intent.putExtra(Intent.EXTRA_TEXT, "Nome do Utilizador: " + etNome.getText().toString() + "\n" +"\n"+ etMessage.getText().toString());
                    startActivity(intent);

                    //limpar campos ao fim de enviar
                    etNome.getText().clear();
                    etSubject.getText().clear();
                    etMessage.getText().clear();
                }

            }
        });

        btMaps = root.findViewById(R.id.id_imagem_mapa);
        btMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.navigation:q=40.27019011646054,-8.28115998676962&mode=l"));
                intent.setPackage("com.google.android.apps.maps");

                if(intent.resolveActivity(getActivity().getPackageManager())!= null){
                   startActivity(intent);
                }
            }
        });

return root;
    }



}