package mfajar8.wordpress.pahlawanku.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.ButterKnife;
import butterknife.OnClick;
import mfajar8.wordpress.pahlawanku.R;
import mfajar8.wordpress.pahlawanku.Views.Explore.FragmentHero;

public class HeroDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hero_detail);

        ButterKnife.bind(this);

        String foto = getIntent().getExtras().getString("foto");
        String kategori = getIntent().getExtras().getString("kategori");
        String nama = getIntent().getExtras().getString("nama");
        String nama_asli = getIntent().getExtras().getString("nama_asli");
        String tempatL = getIntent().getExtras().getString("tempatL");
        String tanggalL = getIntent().getExtras().getString("tanggalL");
        String tempatW = getIntent().getExtras().getString("tempatW");
        String tanggalW = getIntent().getExtras().getString("tanggalW");
        String julukan = getIntent().getExtras().getString("julukan");
        String jasa = getIntent().getExtras().getString("jasa");
        String biografi = getIntent().getExtras().getString("biografi");

        ImageView fotop = (ImageView)findViewById(R.id.fotopahlawan);
        TextView kategorip = (TextView)findViewById(R.id.kategori);
        TextView namap = (TextView)findViewById(R.id.namapahlawan);
        TextView namaap = (TextView)findViewById(R.id.namaasli);
        TextView tempatlp = (TextView)findViewById(R.id.tempatlahir);
        TextView tanggallp = (TextView)findViewById(R.id.tanggallahir);
        TextView tempatwp = (TextView)findViewById(R.id.tempatwafat);
        TextView tanggalwp = (TextView)findViewById(R.id.tanggalwafat);
        TextView julukanp = (TextView)findViewById(R.id.julukan);
        TextView jasap = (TextView)findViewById(R.id.jasa);
        TextView biop = (TextView)findViewById(R.id.bio);


        kategorip.setText(kategori);
        namap.setText(nama);
        namaap.setText(nama_asli);
        tempatlp.setText(tempatL);
        tanggallp.setText(tanggalL);
        tempatwp.setText(tempatW);
        tanggalwp.setText(tanggalW);
        julukanp.setText(julukan);
        jasap.setText(jasa);
        biop.setText(biografi);

        Glide.with(this)
                .load("https://kostlab.id/project/fajar/xfile/foto/"+foto)
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(fotop);

    }

    @OnClick(R.id.btn_back)
    public void back(){
        Intent in = new Intent(HeroDetailActivity.this, MainActivity.class);
        in.putExtra("source", "detail");
        startActivity(in);
    }
}
