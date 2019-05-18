package com.example.proyectouber;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.myviewHolder> {

    Context mcontext;
    List<Items> mdata;

    public Adapter(Context mcontext, List<Items> mdata) {
        this.mcontext = mcontext;
        this.mdata = mdata;
    }

    @Override
    public myviewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        View v=inflater.inflate(R.layout.listadorutas,parent,false);

        return new myviewHolder(v);
    }

    @Override
    public void onBindViewHolder( myviewHolder holder, int position) {
    holder.background_img.setImageResource(mdata.get(position).getBacground());
    holder.perfil_imagen.setImageResource(mdata.get(position).getPerfilimagen());
    holder.tv_title.setText(mdata.get(position).getPerfil());
    holder.tv_nbFollower.setText(mdata.get(position).getNbFollowes()+"Follers");
    }

    @Override
    public int getItemCount() {

        return mdata.size();
    }

    public class myviewHolder extends RecyclerView.ViewHolder{

        ImageView perfil_imagen,background_img;
        TextView tv_title,tv_nbFollower;

        public myviewHolder(View itemView) {
            super(itemView);
            perfil_imagen=itemView.findViewById(R.id.perfil_imagi);
            background_img=itemView.findViewById(R.id.card_background);
            tv_title=itemView.findViewById(R.id.card_titulo);
            tv_nbFollower=itemView.findViewById(R.id.card_nb_follower);
        }
    }
}
