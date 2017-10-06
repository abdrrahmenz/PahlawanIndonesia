package dev.abman.pahlawanindonesia.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import dev.abman.pahlawanindonesia.DetailActivity;
import dev.abman.pahlawanindonesia.R;
import dev.abman.pahlawanindonesia.data.entity.Pahlawan;
import dev.abman.pahlawanindonesia.utils.CustomOnItemClickListener;

/**
 * Created by adul on 03/10/17.
 */

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder> {

    private Context context;
    private ArrayList<Pahlawan> listPahlawan;

    public PahlawanAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Pahlawan> getListPahlawan() {
        return listPahlawan;
    }

    public void setListPahlawan(ArrayList<Pahlawan> listPahlawan) {
        this.listPahlawan = listPahlawan;
    }

    @Override
    public PahlawanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PahlawanViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_pahlawan,parent,false));
    }

    @Override
    public void onBindViewHolder(PahlawanViewHolder holder, int position) {

        final Pahlawan posisi = getListPahlawan().get(position);

        Glide.with(context)
                .load(posisi.getFoto())
                .override(350,550)
                .into(holder.imgPhoto);

        holder.tvName.setText(posisi.getNama());
        holder.tvJabatan.setText(posisi.getJabatan());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Pahlawan list = new Pahlawan();
                list.setNama(posisi.getNama());
                list.setJabatan(posisi.getJabatan());
                list.setKeterangan(posisi.getKeterangan());
                list.setFoto(posisi.getFoto());
                list.setLahir(posisi.getLahir());
                list.setWafat(posisi.getWafat());

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_DATA, list);
                context.startActivity(intent);
            }
        }));

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, posisi.getNama());
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListPahlawan().size();
    }

    public class PahlawanViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvJabatan;
        Button btnDetail, btnShare;

        public PahlawanViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvJabatan = itemView.findViewById(R.id.tv_item_remarks);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnShare = itemView.findViewById(R.id.btn_share);
        }
    }
}
