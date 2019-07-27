package mfajar8.wordpress.pahlawanku.Presenters.Pahlawan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import mfajar8.wordpress.pahlawanku.Models.ResultPahlawan;
import mfajar8.wordpress.pahlawanku.R;
import mfajar8.wordpress.pahlawanku.Views.HeroDetailActivity;

public class PahlawanViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.img_hero)
    ImageView img_hero;
    @BindView(R.id.txt_item)
    TextView txt_item;

    private List<ResultPahlawan> resultPahlawanList = new ArrayList<>();

    public PahlawanViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    public void setItem(List<ResultPahlawan> item){
        resultPahlawanList = item;

    }
    @OnClick()
    void click(@NonNull View itemView){
        int posisiion = getAdapterPosition();
        String foto = resultPahlawanList.get(posisiion).getFoto();
        String kategori = resultPahlawanList.get(posisiion).getKategori();
        String nama = resultPahlawanList.get(posisiion).getNama();
        String nama_asli = resultPahlawanList.get(posisiion).getNama_asli();
        String tempatL = resultPahlawanList.get(posisiion).getTempat_lahir();
        String tanggalL = resultPahlawanList.get(posisiion).getTanggal_lahir();
        String tempatW = resultPahlawanList.get(posisiion).getTempat_wafat();
        String tanggalW = resultPahlawanList.get(posisiion).getTanggal_wafat();
        String julukan = resultPahlawanList.get(posisiion).getJulukan();
        String jasa = resultPahlawanList.get(posisiion).getJasa();
        String biografi = resultPahlawanList.get(posisiion).getBiografi();

        Intent intent = new Intent(itemView.getContext(), HeroDetailActivity.class);
        intent.putExtra("foto", foto);
        intent.putExtra("kategori", kategori);
        intent.putExtra("nama", nama);
        intent.putExtra("nama_asli", nama_asli);
        intent.putExtra("tempatL", tempatL);
        intent.putExtra("tanggalL", tanggalL);
        intent.putExtra("tempatW", tempatW);
        intent.putExtra("tanggalW", tanggalW);
        intent.putExtra("julukan", julukan);
        intent.putExtra("jasa", jasa);
        intent.putExtra("biografi", biografi);
        itemView.getContext().startActivity(intent);
    }
}
