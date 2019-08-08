package com.anil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.anil.recyclerviewradiobuttonandroidtutorial.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentVH> {
    Context context;
    List<Student> list;
    public int mSelectedItem = -1;

    public StudentAdapter(Context context, List<Student> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public StudentVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_data, parent, false);

        return new StudentVH(view);
    }

    @Override
    public void onBindViewHolder(StudentVH holder, int position) {
        holder.rviewRadiobutton.setChecked(position == mSelectedItem);
        holder.loadData(position);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StudentVH extends RecyclerView.ViewHolder {
        @BindView(R.id.textView_rvname)
        TextView textViewRvname;
        @BindView(R.id.textView_rvloc)
        TextView textViewRvloc;
        @BindView(R.id.rview_radiobutton)
        RadioButton rviewRadiobutton;


        public StudentVH(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }

        void loadData(final int position) {
            textViewRvname.setText(list.get(position).getName());
            textViewRvloc.setText(list.get(position).getLocation());
            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSelectedItem = getAdapterPosition();
                    notifyDataSetChanged();
                    Toast.makeText(context, "" + list.get(position).getName() + "\n" + list.get(position).getLocation(), Toast.LENGTH_SHORT).show();


                }
            };
            rviewRadiobutton.setOnClickListener(listener);
            itemView.setOnClickListener(listener);
        }
    }

}
