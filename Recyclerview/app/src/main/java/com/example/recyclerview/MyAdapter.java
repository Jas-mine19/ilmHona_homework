package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String[] contacts={"Juddy","Tom","Elza",
                        "Bart","Liza","Jerry",
                         "Kora","Anna","Lady Bug"};

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
        holder.textView.setText(contacts[position]);

    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public MyViewHolder( View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
