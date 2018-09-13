package dev.id.bariscode.oopandroidbasic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import dev.id.bariscode.oopandroidbasic.Object.Manusia;

public class HumanActivity extends Manusia {

    //TODO 1: Buat Package dengan nama Objek dan buat Class Java didalamnya dengan nama Manusia
    //TODO 2: Buat Layout untuk HumanActivity.java dengan 4 Button & ImageView
    //TODO 3: Deklarasikan, Inisialisasikan & Buat Event Click untuk Button
    //TODO 4: Buat sebuah kegiatan yang menginterpretasikan pada objek tersebut misal: berjalan, berlari dsb.
    //TODO 5: Extend Class Yang akan dijadikan Program yang Mengambil referensi Data dari Class Objek
    //TODO 6: Panggil aksi kegiatan Objek tersebut dan Jalankan Program

    Button btnBerjalan, btnBerlari, btnTidur, btnMakan;
    ImageView tampilkanGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);

        btnBerjalan = (Button)findViewById(R.id.btBerjalan);
        btnBerlari = (Button)findViewById(R.id.btBerlari);
        btnTidur = (Button)findViewById(R.id.btTidur);
        btnMakan = (Button)findViewById(R.id.btMakan);
        tampilkanGambar = (ImageView) findViewById(R.id.ivGambar);

        btnBerjalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                berjalan();
                tampilkanGambar.setImageResource(R.drawable.berjalan);
            }
        });

        btnBerlari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                berlari();;
                tampilkanGambar.setImageResource(R.drawable.berlari);
            }
        });

        btnTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tidur();
                tampilkanGambar.setImageResource(R.drawable.tidur);
            }
        });

        btnMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makan();
                tampilkanGambar.setImageResource(R.drawable.makan);
            }
        });
    }
}
