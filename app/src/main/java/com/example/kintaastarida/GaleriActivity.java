package com.example.kintaastarida;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.kintaastarida.jenis.Buah;
import com.example.kintaastarida.jenis.DataBuah;

import java.util.ArrayList;
public class GaleriActivity extends AppCompatActivity {

    ArrayList<Buah> data_buah = new ArrayList<>();
    int index = 0;
    String karegori_buah;

    TextView nama, asal, decs;
    ImageView gambar;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);
        Intent intent = getIntent();
        karegori_buah = intent.getStringExtra("KATEGORI BUAH");
        data_buah = DataBuah.getBuahByJenis(karegori_buah);
        initialisasi();
        setContent();
    }

    void initialisasi() {
        gambar = findViewById(R.id.gambar);
        nama = findViewById(R.id.namabuah);
        asal = findViewById(R.id.asalBuah);
        decs = findViewById(R.id.description);
    }

    void setContent() {
        Buah buah = data_buah.get(index);

        nama.setText(buah.getNamaBuah());
        asal.setText(buah.getAsalBuah());
        decs.setText(buah.getDescBuah());
        gambar.setImageDrawable(getDrawable(buah.getGambarBuah()));
    }

    public void btn_left(View v) {
        if (index > 0){
            index--;
            setContent();
        }
    }
    public void btn_right(View v) {
        if (index < data_buah.size()-1){
            index++;
            setContent();
        }
    }
}
