package com.example.intropenacova;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.intropenacova.adapter.ElementosRegulamentoAdapter;
import com.example.intropenacova.model.ElementosRegulamento;

import java.util.ArrayList;


public class Regulamento extends AppCompatActivity {

    ListView listViewRegulamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regulamento);

        listViewRegulamento = findViewById(R.id.listView_regulamento);

        //create data
        ArrayList<ElementosRegulamento> arrayList = new ArrayList<>();
        arrayList.add(new ElementosRegulamento("INTRODUÇÃO:" , "A “Maratona Penacova BTT - Rota da Lampeia 2018” é uma organização da Câmara Municipal de Penacova, terá lugar em Penacova e contará para a TAÇA REGIONAL DO CENTRO XCM 2018, com início às 9h30. "));
        arrayList.add(new ElementosRegulamento("CATEGORIAS E PARTICIPAÇÃO:" ,"A prova da Taça Regional do Centro XCM 2018 é regulada pelo regulamento oficial da UVP-FPC para o efeito (http://www.acbl.pt/pt_pt/regulationdetails/1/TACA_XCM_DO_CENTRO_2018). As categorias da classe de promoção são regulamentadas por este regulamento, da responsabilidade da Câmara Municipal de Penacova, devidamente aprovado pela UVP-FPC."));
        arrayList.add(new ElementosRegulamento("PROVA E PERCURSO:", "O percurso passa por vias públicas e caminhos rurais, estando aberto à circulação de outros veículos, pelo que todos os participantes deverão respeitar o código de estrada e as regras de circulação em vias públicas. O percurso será marcado por fitas e sinalética própria. O não cumprimento do percurso implica a desclassificação da prova."));
        arrayList.add(new ElementosRegulamento("INSCRIÇÕES:" ,"Deverão ser feitas através da página online (www.cm-penacova.pt), indicada pela organização, a inscrição só será validada após o seu pagamento através de Referência Multibanco gerada no momento da finalização do preenchimento da ficha presente no Site do Município. Valores de inscrição: 8€ sem almoço para atletas federados; 12€ com almoço para atletas federados; 9€ sem almoço para atletas não federados; 13€ com almoço para atletas não federados; acompanhantes 5€ (menores de 10 anos grátis)."));
        arrayList.add(new ElementosRegulamento("SEGURO:",  "Os atletas federados de competição, betetistas estão seguros pela apólice de acidentes pessoais da UVP.FPC. Os atletas não federados estão cobertos pela apólice de seguro de acidentes pessoais a efectuar pelo Município."));
        arrayList.add(new ElementosRegulamento("CLASSIFICAÇÃO E ATRIBUIÇÃO DE PRÉMIOS:", "Serão atribuídas lembranças aos participantes, bem como prémios para os três primeiros classificados de cada escalão. A organização disponibilizará igualmente acesso à zona de banhos e lavagem de bicicletas."));
        arrayList.add(new ElementosRegulamento("ATRIBUIÇÃO E UTILIZAÇÃO DE DORSAIS:", "Cada atleta participará com o número fornecido pela organização. Todos os atletas deverão colocar a placa frontal na bicicleta na posição correta, na parte dianteira, na zona do guiador de modo a ser bem visível em toda a sua superfície. Todo o atleta que não cumpra esta regra será excluído da prova, não sendo enquadrado pela sua organização."));
        arrayList.add(new ElementosRegulamento("DIREITOS DE IMAGEM:" ,"A inscrição no evento e a consequente aceitação deste regulamento implica obrigatoriamente a autorização para que a Organização possa efetuar o registo videográfico, fotográfico ou outro na totalidade ou parte da atividade, com vista à sua divulgação e promoção em todos os suportes (televisão, rádio, imprensa, internet, cartazes, cartões, folhetos, etc.)."));
        arrayList.add(new ElementosRegulamento("CASOS OMISSOS:" ,"Os casos não previstos neste Regulamento, assim como todas as eventuais dúvidas originadas pela sua interpretação, serão analisadas e decididas pela Organização. "));
        arrayList.add(new ElementosRegulamento("OUTROS:" ,"A organização não se responsabiliza por qualquer extravio ou avaria que possam afetar as bicicletas ou outros equipamentos dos participantes. O participante iliba a organização da responsabilidade por qualquer perca ou deterioração de objetos pessoais, em qualquer circunstância "));

        //custom adapter

        ElementosRegulamentoAdapter elementosRegulamentoAdapter = new ElementosRegulamentoAdapter(this,R.layout.list_row_regulamento,arrayList);

        listViewRegulamento.setAdapter(elementosRegulamentoAdapter);























    }

}
