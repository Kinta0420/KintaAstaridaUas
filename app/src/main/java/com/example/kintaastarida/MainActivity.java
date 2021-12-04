package com.example.kintaastarida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClicAnggur (View v) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        intent.putExtra("KATEGORI BUAH", "ANGGUR");
        startActivity(intent);
    }
    public void onClickJeruk (View v) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        intent.putExtra("KATEGORI BUAH", "JERUK");
        startActivity(intent);

    }
    public void onClickMangga (View v) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        intent.putExtra("KATEGORI BUAH", "MANGGA");
        startActivity(intent);

    }
    public void onClickProfile (View v) {
        Intent intent = new Intent(MainActivity.this, profile_Activity.class);
        intent.putExtra("MAHASISWA", "KINTA");
        startActivity(intent);

    }
}