package mfajar8.wordpress.pahlawanku.Presenters.Pahlawan;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

import mfajar8.wordpress.pahlawanku.Models.ResultPahlawan;
import mfajar8.wordpress.pahlawanku.R;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanViewHolder> {

    private Context context;
    private List<ResultPahlawan> resultPahlawanList;

    public PahlawanAdapter(Context context, List<ResultPahlawan> resultPahlawanList){
        this.context = context;
        this.resultPahlawanList = resultPahlawanList;
    }
    @NonNull
    @Override
    public PahlawanViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_hero, viewGroup, false);
        return new PahlawanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanViewHolder pahlawanViewHolder, int i) {
    ResultPahlawan resultPahlawan = resultPahlawanList.get(i);
    pahlawanViewHolder.txt_item.setText(resultPahlawan.getNama());
        Glide.with(context)
                .load("https://kostlab.id/project/fajar/xfile/foto/"+resultPahlawan.getFoto())
        .apply(new RequestOptions().override(100,100).centerCrop())
                .into(pahlawanViewHolder.img_hero);
        pahlawanViewHolder.setItem(resultPahlawanList);
    }

    @Override
    public int getItemCount() {
        return resultPahlawanList.size();
    }
}
