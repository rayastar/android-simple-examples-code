package com.anil.RecyclerviewWithTabsusingViewpager;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.anil.RecyclerviewWithTabsusingViewpager.R;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView name_TextView;
    public TextView iso_TextView;


    public ItemViewHolder(View itemView) {
        super(itemView);
        itemView.setClickable(true);
        name_TextView = (TextView) itemView.findViewById(R.id.country_name);
        iso_TextView = (TextView) itemView.findViewById(R.id.country_iso);

    }

    public void bind(Student student) {
        name_TextView.setText(student.getName());
        iso_TextView.setText(student.getAdd() );

    }


}
