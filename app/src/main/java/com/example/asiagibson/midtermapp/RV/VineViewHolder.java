package com.example.asiagibson.midtermapp.RV;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asiagibson.midtermapp.Pojos.Records;
import com.example.asiagibson.midtermapp.R;

/**
 * Created by asiagibson on 12/10/16.
 */

public class VineViewHolder extends RecyclerView.ViewHolder {
    private final View mView;

    TextView username;
    TextView user;
    TextView created;
    TextView userID;
    TextView liked;


    public VineViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;

        username =(TextView) mView.findViewById(R.id.username);
        user =(TextView) mView.findViewById(R.id.user);
        userID =(TextView) mView.findViewById(R.id.user_id);
        created =(TextView) mView.findViewById(R.id.created);
        liked =(TextView) mView.findViewById(R.id.liked);

    }


    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.vine_viewholder, parent, false);
    }


    public void bind(Records records) {

        username.setText(records.getUsername());
        user.setText((CharSequence) records.getUser());
        userID.setText(records.getUserId());
        created.setText(records.getCreated());
        liked.setText(records.getLikeId());

    }
}
