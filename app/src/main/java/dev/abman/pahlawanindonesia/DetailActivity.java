package dev.abman.pahlawanindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;
import dev.abman.pahlawanindonesia.data.entity.Pahlawan;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CircleImageView imgFoto = (CircleImageView) findViewById(R.id.img_item_photo);
        TextView tvName = (TextView) findViewById(R.id.tv_item_name);
        TextView tvJabatan = (TextView) findViewById(R.id.tv_item_remarks);
        TextView tvKeterangan = (TextView) findViewById(R.id.tv_item_keterangan);
        TextView tvLahir = (TextView) findViewById(R.id.tv_item_lahir);
        TextView tvWafat = (TextView) findViewById(R.id.tv_item_wafat);

        Pahlawan pahlawan = getIntent().getParcelableExtra(EXTRA_DATA);

        if (pahlawan!=null){
            Glide.with(this)
                    .load(pahlawan.getFoto())
                    .into(imgFoto);

            tvName.setText(pahlawan.getNama());
            tvJabatan.setText(pahlawan.getJabatan());
            tvKeterangan.setText(pahlawan.getKeterangan());
            tvLahir.setText(pahlawan.getLahir());
            tvWafat.setText(pahlawan.getWafat());
        }
    }
}
