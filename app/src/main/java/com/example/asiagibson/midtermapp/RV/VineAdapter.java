package com.example.asiagibson.midtermapp.RV;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.asiagibson.midtermapp.Pojos.Records;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asiagibson on 12/10/16.
 */

public class VineAdapter extends RecyclerView.Adapter<VineViewHolder> {
    private List<Records> recordsList = new ArrayList<>();

    public VineAdapter() {

    }

    @Override
    public VineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VineViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(VineViewHolder holder, int position) {
        VineViewHolder vineHolder = holder;
        Records records = recordsList.get(position);
        vineHolder.bind(records);

    }

    @Override
    public int getItemCount() {
        return recordsList.size();
    }

    public void setRecordsList(List<Records> recordsList) {
        this.recordsList = recordsList;
    }

   
}
