package com.example.intropenacova.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intropenacova.R;
import com.example.intropenacova.model.Faqs;

import java.util.List;


public class FaqsAdapter extends RecyclerView.Adapter<FaqsAdapter.faqsVH> {

    List<Faqs> faqsList;

    public FaqsAdapter(List<Faqs> faqsList) {
        this.faqsList = faqsList;
    }


    @NonNull
    @Override
    public faqsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_faqs,parent,false);
        return new faqsVH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull faqsVH holder, int position) {

        Faqs Faqs = faqsList.get(position);
        holder.NomeFaq.setText(Faqs.getNomeFaqs());
        holder.DescricaoFaq.setText(Faqs.getDescricaoFaqs());

        boolean isExpandable = faqsList.get(position).isExpandable();
        holder.expandableLayoutFaqs.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return faqsList.size();
    }

    public class faqsVH extends RecyclerView.ViewHolder {

        TextView NomeFaq, DescricaoFaq;
        LinearLayout linearLayoutFaqs;
        RelativeLayout expandableLayoutFaqs;

        public faqsVH(@NonNull View itemView) {
            super(itemView);

            NomeFaq = itemView.findViewById(R.id.faq_name);
            DescricaoFaq = itemView.findViewById(R.id.faq_descricao);

            linearLayoutFaqs = itemView.findViewById(R.id.linear_layoutFAQS);
            expandableLayoutFaqs = itemView.findViewById(R.id.expandable_layoutFAQS);

            linearLayoutFaqs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Faqs Faqs = faqsList.get(getAdapterPosition());
                    Faqs.setExpandable(!Faqs.isExpandable());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }



}
