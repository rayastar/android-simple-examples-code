package android.anil.com.recyclerviewwithanimations;

import android.anil.com.recyclerviewwithanimations.Employee;
import android.anil.com.recyclerviewwithanimations.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Anil on 18-01-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.VH> {

    List<Employee> list;
    Context context;

    public RecyclerAdapter(List<Employee> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public RecyclerAdapter.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerAdapter.VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.mycardview, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.VH holder, int position) {
        holder.name.setText(list.get(position).name);
        holder.loc.setText(list.get(position).addrs);
        animate(holder);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView name;
        TextView loc;

        public VH(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.list_title);
            loc = (TextView) itemView.findViewById(R.id.list_desc);
        }

    }

    public void animate(RecyclerView.ViewHolder viewHolder) {
        final Animation animAnticipateOvershoot = AnimationUtils.loadAnimation(context, R.anim.anticipateovershoot_interpolator);
        viewHolder.itemView.setAnimation(animAnticipateOvershoot);
    }
}
