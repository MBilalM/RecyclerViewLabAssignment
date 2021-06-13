package com.muhammadbilal.receclerview_191073.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import com.muhammadbilal.receclerview_191073.ModelInfo.PersonInfo;
        import com.muhammadbilal.receclerview_191073.R;

        import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    List<PersonInfo> personList;
    Context context;

    public MainAdapter(List<PersonInfo> personList, Context context) {
        this.personList = personList;
        this.context = context;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {

        PersonInfo person = personList.get(position);
        holder.imgPic.setImageResource(person.getImgAdd());
        holder.txtName.setText(person.getName());
        holder.txtCont.setText(person.getPC());
        holder.txtAge.setText(person.getAge());
        holder.txtXP.setText(person.getXP());
        holder.txtGend.setText(person.getGEND());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                personList.remove(position);

                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtName, txtCont,txtAge,txtXP,txtGend;
        ImageView imgPic;
        ImageButton delete;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.tvName);
            txtCont = itemView.findViewById(R.id.tvCont);
            txtAge=itemView.findViewById(R.id.tvAge);
            txtXP=itemView.findViewById(R.id.tvExp);
            imgPic=itemView.findViewById(R.id.ivPic);
            txtGend=itemView.findViewById(R.id.tvGen);
            delete=itemView.findViewById(R.id.btnDel);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {


        }
    }
}