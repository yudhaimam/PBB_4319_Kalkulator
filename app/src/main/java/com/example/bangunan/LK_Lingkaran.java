package com.example.bangunan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LK_Lingkaran extends AppCompatActivity {

    private EditText r;
    private TextView hasilLuas, hasilKeliling;
    private float rr, countLuas, countKeliling, phi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lk_lingkaran);
        r = findViewById(R.id.edTextR);
        hasilLuas = findViewById(R.id.txtLuas);
        hasilKeliling = findViewById(R.id.txtKeliling);
    }

    public void btnHitung(View view) {
        phi = (float) 3.14;

//        Luas Lingkaran (phi * (r*r))
        try {
            rr = Float.parseFloat(r.getText().toString());
            countLuas = phi * (rr*rr);
            hasilLuas.setText(Float.toString(countLuas));
        }
        catch(NumberFormatException e)
        {
            Log.d("Error","Format Salah!"+e);
            Toast.makeText(getApplicationContext(), "Format Salah", Toast.LENGTH_SHORT).show();
        }

//        Keliling Lingkaran (2 * phi * r)
        try {
            rr = Float.parseFloat(r.getText().toString());
            countKeliling = 2 * phi * rr;
            hasilKeliling.setText(Float.toString(countKeliling));
        }
        catch(NumberFormatException e)
        {
            Log.d("Error","Format Salah!"+e);
            Toast.makeText(getApplicationContext(), "Format Salah", Toast.LENGTH_SHORT).show();
        }
    }

    public void dashboard(View view) {
        Intent db = new Intent(this, MainActivity.class);
        startActivity(db);
    }
}