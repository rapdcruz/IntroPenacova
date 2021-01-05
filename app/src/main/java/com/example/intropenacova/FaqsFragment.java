package com.example.intropenacova;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intropenacova.adapter.FaqsAdapter;
import com.example.intropenacova.model.Faqs;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FaqsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FaqsFragment extends Fragment {

   RecyclerView recyclerViewFaqs;
   List<Faqs> faqsList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FaqsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FaqsFragment newInstance(String param1, String param2) {
        FaqsFragment fragment = new FaqsFragment();
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
        ViewGroup root =  (ViewGroup) inflater.inflate(R.layout.fragment_faqs, container, false);
        recyclerViewFaqs = root.findViewById(R.id.rv_faqs);




        faqsList = new ArrayList<>();

        faqsList.add(new Faqs("Como faço para comprar os produtos na loja virtual?","Primeiro você precisa ter um cadastro em nosso site. Não se preocupe, é tudo seguro e protegido. Feito o cadastro, é só você navegar pela loja virtual, selecionar os produtos do seu desejo e finalizar a compra. Se você ainda tiver alguma dúvida, entre em contato conosco."));
        faqsList.add(new Faqs("Como faço para comprar via boleto?","bPara comprar via boleto, você precisar selecionar a opção de pagamento via Moip e ao finalizar a sua compra selecionar a opção boleto. Qualquer dúvida, entre em contato conosco ou chame a atendente no chat online!"));
        faqsList.add(new Faqs("Esqueci minha senha. O que devo fazer?","Não se preocupe! Na página de login, clique em \"esqueci a senha\" e informe o e-mail cadastrado em nossa loja virtual. Após a solicitação, em instantes você receberá em seu e-mail para redefinir sua senha de acesso."));
        faqsList.add(new Faqs("Desejo mudar meu endereço de entrega. Onde faço essa alteração?","Para alterar seus dados, efetue seu login no site. Em seguida, clique em Minha Conta > Endereços. Para os pedidos já efetuados não é possível alterar o endereço de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));
        faqsList.add(new Faqs("Posso comprar na loja virtual e retirar pessoalmente?","Depende. Caso você deseje retirar seu pedido pessoalmente, nós recomendamos que você entre em contato conosco antes de finalizar a compra para verificação de endereço e disponibilidade de entrega."));

        FaqsAdapter faqsAdapter = new FaqsAdapter(faqsList);
        recyclerViewFaqs.setAdapter(faqsAdapter);
        recyclerViewFaqs.setHasFixedSize(true);

        return root;
    }
}