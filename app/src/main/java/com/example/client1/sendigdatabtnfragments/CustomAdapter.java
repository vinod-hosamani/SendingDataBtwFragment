package com.example.client1.sendigdatabtnfragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by client1 on 1/4/2018.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolderVinod> {
    List<CustModel> modelList;
    onClick onClick;

    public CustomAdapter(List<CustModel> modelList, onClick onClick) {
        this.onClick = onClick;
        this.modelList = modelList;
    }

    @Override
    public ViewHolderVinod onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolderVinod(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderVinod holder, final int position) {
        holder.fn.setText(modelList.get(position).firstName);
        holder.ln.setText(modelList.get(position).lastName);
        holder.Lin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(view, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class ViewHolderVinod extends RecyclerView.ViewHolder {
        TextView fn, ln;
        LinearLayout Lin;

        public ViewHolderVinod(View itemView) {
            super(itemView);
            fn = (TextView) itemView.findViewById(R.id.firstName);
            ln = (TextView) itemView.findViewById(R.id.lastName);
            Lin = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }

    public interface onClick {
        void onClick(View v, int position);
    }
}
