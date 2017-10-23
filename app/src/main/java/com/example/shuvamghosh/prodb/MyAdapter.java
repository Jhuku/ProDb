package com.example.shuvamghosh.prodb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.shuvamghosh.prodb.model.RespModel;

import java.util.List;
import java.util.zip.Inflater;


/**
 * Author: Shuvam Ghosh
 * Created on 9/17/2017
 */
public class MyAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private android.content.Context mContext;

    List<RespModel> mDataList;

    private ClickListener clickListener;

    public MyAdapter(Context context, List<RespModel> dataList) {
        this.mContext = context;
        this.mDataList = dataList;
    }


    @Override
    public ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        ViewHolder vh = new ViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {


        holder.tvAccessionNo.setText(mDataList.get(position).getAccession());
        holder.tvName.setText(mDataList.get(position).getName());
        holder.tvSequence.setText(mDataList.get(position).getSequence());

        if(mDataList.get(position).getProtein()!=null) {
            if(mDataList.get(position).getProtein().getSubmittedName().size()>0) {
                holder.tvFullName.setText("(" + mDataList.get(position).getProtein().getSubmittedName().get(0).getFullName() + ")");
                Log.d("Protein Value:", "" + mDataList.get(position).getProtein().getSubmittedName().get(0).getFullName());
            }
        }
        else if(mDataList.get(position).getProtein()==null)
        {
            holder.tvFullName.setText("(Null)");
        }
        //TODO: add your code



    }

    public void setOnClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvAccessionNo;
        TextView tvName;
        TextView tvSequence;
        TextView tvFullName;

        public ViewHolder(View itemView) {
            super(itemView);

            tvAccessionNo = itemView.findViewById(R.id.lbl_accession);
            tvName = itemView.findViewById(R.id.lbl_prot_name);
            tvSequence = itemView.findViewById(R.id.lbl_seq);
            tvFullName = itemView.findViewById(R.id.lbl_full_name);

        }
    }

    public interface ClickListener {
        void onClick(android.view.View view, int position);
    }

}
