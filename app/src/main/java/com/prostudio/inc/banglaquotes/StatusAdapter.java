package com.prostudio.inc.banglaquotes;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.StatusViewHolder>{

    List <String> status = null;
    Context context;

    public StatusAdapter(List<String> status, Context context) {
        this.status = status;
        this.context = context;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_design, viewGroup, false);
        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        String [] colors = {"#00AEE7","#911AAA","#009688","#C66E2F","#F70039","#072B4F"};
        String stats = status.get(position);
        holder.statusText.setText(stats);
        int color = position % colors.length;
        int intcolor = Color.parseColor(colors[color]);
        holder.statusContainer.setBackgroundColor(intcolor);
    }

    @Override
    public int getItemCount() {
        return status.size();
    }

    public class StatusViewHolder extends RecyclerView.ViewHolder{

        TextView statusText;
        LinearLayout statusContainer;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);

            statusText = itemView.findViewById(R.id.status_text_design);
            statusContainer = itemView.findViewById(R.id.status_container);

        }
    }
}
