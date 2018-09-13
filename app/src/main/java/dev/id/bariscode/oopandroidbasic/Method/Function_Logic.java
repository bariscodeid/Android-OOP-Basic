package dev.id.bariscode.oopandroidbasic.Method;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Function_Logic extends AppCompatActivity {

    Context context_pilihactivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context_pilihactivity = Function_Logic.this;
    }

    //Membuat Method Return Value dari Class Function Logic untuk diakses kedalam
    //Class lain dengan mengextend class ini

    public int penjumlahan(int masukannilai_a, int masukannilai_b) {
        int hasil = masukannilai_a + masukannilai_b;
        Toast.makeText(context_pilihactivity, "Hasil dari penjumalahan adalah " + hasil, Toast.LENGTH_SHORT).show();
        return hasil;
    }
}
