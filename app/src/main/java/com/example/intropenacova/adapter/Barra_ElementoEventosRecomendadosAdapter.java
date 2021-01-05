package com.example.intropenacova.adapter;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentTransaction;
        import androidx.recyclerview.widget.RecyclerView;


        import com.example.intropenacova.DetalhesEventoAntesdeInscrever;
        import com.example.intropenacova.R;
        import com.example.intropenacova.model.Barra_ElementoEventosRecomendados;

        import java.util.List;

        import static com.example.intropenacova.MainActivity.fragmentManager;


public class Barra_ElementoEventosRecomendadosAdapter extends RecyclerView.Adapter<Barra_ElementoEventosRecomendadosAdapter.PopularFoodViewHolder> {

    Context context;
    List<Barra_ElementoEventosRecomendados> barraElementoEventosRecomendadosList;





    public Barra_ElementoEventosRecomendadosAdapter(Context context, List<Barra_ElementoEventosRecomendados> barraElementoEventosRecomendadosList) {
        this.context = context;
        this.barraElementoEventosRecomendadosList = barraElementoEventosRecomendadosList;
    }

    @NonNull
    @Override
    public PopularFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_card_eventos_recomendados, parent, false);
        return new PopularFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularFoodViewHolder holder, int position) {

        holder.PhotoEventoUrl.setImageResource(barraElementoEventosRecomendadosList.get(position).getPhotoEventoUrl());
        holder.nome.setText(barraElementoEventosRecomendadosList.get(position).getNome());
        holder.data.setText(barraElementoEventosRecomendadosList.get(position).getData());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent i = new Intent(context, DetalhesEventoAntesdeInscrever.class);
                //context.startActivity(i);

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = new DetalhesEventoAntesdeInscrever();
                fragmentTransaction.add(R.id.frame,fragment,null);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return barraElementoEventosRecomendadosList.size();
    }


    public static final class PopularFoodViewHolder extends RecyclerView.ViewHolder{


        ImageView PhotoEventoUrl;
        TextView data, nome;

        public PopularFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            PhotoEventoUrl = itemView.findViewById(R.id.id_foto_evento_recomendado_card);
            data = itemView.findViewById(R.id.id_data_evento_recomendado_card);
            nome = itemView.findViewById(R.id.id_nome_evento_recomendado_card);





        }
    }






}
