package dev.id.bariscode.oopandroidbasic;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dev.id.bariscode.oopandroidbasic.Method.Function_Logic;

public class GetMethodReturnValActivity extends Function_Logic {

    CoordinatorLayout crLayoutRoot;

    EditText edtInputA, edtInputB;
    Button btTampilVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_method_return_val);

        edtInputA = (EditText)findViewById(R.id.InpNilai_A);
        edtInputB = (EditText)findViewById(R.id.InpNilai_B);
        btTampilVal = (Button)findViewById(R.id.btnTampilkanHasilValue);
        crLayoutRoot = (CoordinatorLayout)findViewById(R.id.rootView);

        btTampilVal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val_a = Integer.parseInt(edtInputA.getText().toString());
                int val_b = Integer.parseInt(edtInputB.getText().toString());

                penjumlahan(val_a, val_b);
            }
        });
    }

    //Mengambil Method dari Class Diri Sendiri
    public double volume_kubus(double sisi, int pangkat) {
        pangkat = 3;
        double hasil_nilaivolume = Math.pow(sisi, pangkat);
        Toast.makeText(this, "Hasil nilai volume dari kubus adalah " + hasil_nilaivolume, Toast.LENGTH_SHORT).show();
        return hasil_nilaivolume;
    }
}
