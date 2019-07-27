package mfajar8.wordpress.pahlawanku.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mfajar8.wordpress.pahlawanku.Entity.Pahlawan;
import mfajar8.wordpress.pahlawanku.R;

public class ItemPahlawanAdapter extends RecyclerView.Adapter<ItemPahlawanAdapter.Viewholder> {

    List<Pahlawan> pahlawanList;

    public ItemPahlawanAdapter(List<Pahlawan> pahlawanList) {
        this.pahlawanList = pahlawanList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new Viewholder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hero, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int i) {
        Pahlawan pahlawan = pahlawanList.get(i);
        viewholder.item.setText(pahlawan.getNama());
        viewholder.img_hero.setImageResource(R.drawable.ic_about);
    }

    @Override
    public int getItemCount() {
        return pahlawanList.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {
        TextView item;
        ImageView img_hero;
        public Viewholder(@NonNull View itemView) {

            super(itemView);
            item = itemView.findViewById(R.id.txt_item);
            img_hero = itemView.findViewById(R.id.img_hero);
        }
    }
}
