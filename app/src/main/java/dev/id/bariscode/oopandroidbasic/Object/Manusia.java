package dev.id.bariscode.oopandroidbasic.Object;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Manusia extends AppCompatActivity {
    //TODO 1 Manusia: Extends ke AppCompatActivity
    //TODO 2 Manusia: Buat Override Method OnCreate Instance Alt + Insert lalu pilih Override Method
    //TODO 3 Manusia: Buat Context untuk Deklarasikan & Inisialisasikan Activity yang berjalan
    //TODO 4 Manusia: Buat Class (Kegiatan) dari Objek tersebut misal: Berjalan, Makan dlsb.

    //Deklarasi
    Context context_activity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Inisialisasi
        context_activity = Manusia.this;
    }

    //Buat Class (Kegiatan): Apa aksi dari objek tersebut?

    public void berjalan(){
        Toast.makeText(context_activity, "Aktifitas Manusia Berjalan", Toast.LENGTH_SHORT).show();
    }

    public void berlari(){
        Toast.makeText(context_activity, "Aktifitas Manusia Berlari", Toast.LENGTH_SHORT).show();
    }

    public void tidur(){
        Toast.makeText(context_activity, "Aktifitas Manusia Tidur", Toast.LENGTH_SHORT).show();
    }

    public void makan(){
        Toast.makeText(context_activity, "Aktifitas Manusia Makan", Toast.LENGTH_SHORT).show();
    }

}
