package android.dsi32.org.proosoft_project.views.project;


import android.dsi32.org.proosoft_project.R;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import static android.dsi32.org.proosoft_project.views.project.DataModel.*;

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    public ArrayList<DataModel> dataset;
    public CustomAdapter(ArrayList<DataModel> dataModels ){
        this.dataset=dataModels;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ligne_project,parent,false);
        return new MyViewHolder(view);
    }



    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TextView textView=holder.textViewName;
        TextView managerView=holder.textViewManager;
        textView.setText(dataset.get(position).getName());
        managerView.setText(dataset.get(position).getManager());
    }


    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
