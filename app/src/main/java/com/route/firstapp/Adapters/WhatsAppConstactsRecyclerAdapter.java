package com.route.firstapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.route.firstapp.Model.WhatsAppContact;
import com.route.firstapp.R;

import java.util.List;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 1/11/2019.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class WhatsAppConstactsRecyclerAdapter extends
        RecyclerView.Adapter<WhatsAppConstactsRecyclerAdapter.ViewHolder> {

    List<WhatsAppContact> items;

    public WhatsAppConstactsRecyclerAdapter(List<WhatsAppContact> items){
        this.items=items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.whatsapp_contact_item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        WhatsAppContact contact = items.get(position);
        viewHolder.name.setText(contact.getName());
        viewHolder.status.setText(contact.getStatus());
        viewHolder.image.setImageResource(contact.getImage());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView status;
        ImageView image;
        public ViewHolder(View view){
            super(view);
            name=view.findViewById(R.id.name);
            status = view.findViewById(R.id.status);
            image = view.findViewById(R.id.image);

        }
    }
}
