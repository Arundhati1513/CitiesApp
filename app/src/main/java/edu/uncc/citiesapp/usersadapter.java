package edu.uncc.citiesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class usersadapter extends RecyclerView.Adapter<usersadapter.usersviewholder> {
   ArrayList<String> users;

    public usersadapter(ArrayList<String> users) {
    }

    @NonNull
    @Override
    public usersviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.userparticular, parent,false);
        usersviewholder holder = new usersviewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull usersviewholder holder, int position) {
        holder.statetextview.setText(users.get(position));
        holder.nametextview.setText(users.get(position));
        holder.agetextview.setText(users.get(position));
        holder.relationtextview.setText(users.get(position));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class usersviewholder  extends RecyclerView.ViewHolder{
        TextView nametextview;
        TextView statetextview;
        TextView agetextview;
        TextView relationtextview;
        public usersviewholder(@NonNull View itemView) {
            super(itemView);
            nametextview = itemView.findViewById(R.id.nametextview);
            statetextview = itemView.findViewById(R.id.statetextview);
            agetextview = itemView.findViewById(R.id.agetextview);
            relationtextview = itemView.findViewById(R.id.relationtextview);
        }
    }
}
