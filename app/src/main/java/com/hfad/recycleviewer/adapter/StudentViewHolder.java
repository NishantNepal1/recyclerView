package com.hfad.recycleviewer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.hfad.recycleviewer.R;

/**
 * Created by user on 8/21/2016.
 */
public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtAge;
    CheckBox checkBox;

    public StudentViewHolder(View itemView) {
        super(itemView);
        txtName = (TextView) itemView.findViewById(R.id.txtName);
        txtAge = (TextView) itemView.findViewById(R.id.txtAge);
        checkBox = (CheckBox) itemView.findViewById(R.id.checkbox);
    }
}
