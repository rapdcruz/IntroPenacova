package com.example.intropenacova;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.intropenacova.adapter.ElementosPoliticaPrivacidadeAdapter;
import com.example.intropenacova.adapter.ElementosRegulamentoAdapter;
import com.example.intropenacova.model.ElementosPoliticaPrivacidade;
import com.example.intropenacova.model.ElementosRegulamento;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PoliticaPrivacidadeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PoliticaPrivacidadeFragment extends Fragment {
    ListView listViewPoliticaPrivacidade;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PoliticaPrivacidadeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SupportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PoliticaPrivacidadeFragment newInstance(String param1, String param2) {
        PoliticaPrivacidadeFragment fragment = new PoliticaPrivacidadeFragment();
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
        ViewGroup root =  (ViewGroup) inflater.inflate(R.layout.fragment_politicaprivacidade, container, false);


        listViewPoliticaPrivacidade = root.findViewById(R.id.listView_PoliticaPrivacidade);

        ArrayList<ElementosPoliticaPrivacidade> arrayList = new ArrayList<>();
        arrayList.add(new ElementosPoliticaPrivacidade("Termos e Condições:" , "A sua privacidade é importante para nós. É política do App Penacova Desportos respeitar a sua privacidade em relação a qualquer informação sua que possamos coletar no site App Penacova Desportos, e outros sites que possuímos e operamos.\n" +
                "\n" +
                "Solicitamos informações pessoais apenas quando realmente precisamos delas para lhe fornecer um serviço. Fazemo-lo por meios justos e legais, com o seu conhecimento e consentimento. Também informamos por que estamos coletando e como será usado.\n" +
                "\n" +
                "Apenas retemos as informações coletadas pelo tempo necessário para fornecer o serviço solicitado. Quando armazenamos dados, protegemos dentro de meios comercialmente aceitáveis \u200B\u200Bpara evitar perdas e roubos, bem como acesso, divulgação, cópia, uso ou modificação não autorizados.\n" +
                "\n" +
                "Não compartilhamos informações de identificação pessoal publicamente ou com terceiros, exceto quando exigido por lei.\n" +
                "\n" +
                "O nosso site pode ter links para sites externos que não são operados por nós. Esteja ciente de que não temos controle sobre o conteúdo e práticas desses sites e não podemos aceitar responsabilidade por suas respectivas políticas de privacidade.\n" +
                "\n" +
                "Você é livre para recusar a nossa solicitação de informações pessoais, entendendo que talvez não possamos fornecer alguns dos serviços desejados.\n" +
                "\n" +
                "O uso continuado de nosso site será considerado como aceitação de nossas práticas em torno de privacidade e informações pessoais. Se você tiver alguma dúvida sobre como lidamos com dados do usuário e informações pessoais, entre em contacto connosco.\n" +
                "\n" +
                "Compromisso do Usuário\n" +
                "O usuário se compromete a fazer uso adequado dos conteúdos e da informação que o App Penacova Desportos oferece no site e com caráter enunciativo, mas não limitativo:\n" +
                "\n" +
                "A) Não se envolver em atividades que sejam ilegais ou contrárias à boa fé a à ordem pública;\n" +
                "B) Não divulgar conteúdo ou propaganda de natureza racista, xenofóbica, casas de apostas online, pornografia ilegal, de apologia ao terrorismo ou contra os direitos humanos;\n" +
                "C) Não causar danos aos sistemas físicos (hardwares) e lógicos (softwares) do App Penacova Desportos, de seus fornecedores ou terceiros, para introduzir ou disseminar vírus informáticos ou quaisquer outros sistemas de hardware ou software que sejam capazes de causar danos anteriormente mencionados.\n"));
        arrayList.add(new ElementosPoliticaPrivacidade("Mais informações:","Esperemos que esteja esclarecido e, como mencionado anteriormente, se houver algo que você não tem certeza se precisa ou não, geralmente é mais seguro deixar os cookies ativados, caso interaja com um dos recursos que você usa em nosso site.\n" + "Esta política é efetiva a partir de December 2020."));

        ElementosPoliticaPrivacidadeAdapter elementosPoliticaPrivacidadeAdapter = new ElementosPoliticaPrivacidadeAdapter(getActivity(),R.layout.list_row_politicaprivacidade,arrayList);

       listViewPoliticaPrivacidade.setAdapter(elementosPoliticaPrivacidadeAdapter);


        return root;
    }
}



