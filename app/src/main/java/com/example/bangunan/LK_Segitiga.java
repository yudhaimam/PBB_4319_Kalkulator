package com.example.bangunan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LK_Segitiga extends AppCompatActivity {

    private EditText a, t, s;
    private TextView hasilLuas, hasilKeliling;
    private float alas, tinggi, sisi, countLuas, countKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lk_segitiga);
        a = findViewById(R.id.edTextAlas);
        t = findViewById(R.id.edTextTinggi);
        s = findViewById(R.id.edTextSisi);
        hasilLuas = findViewById(R.id.txtLuas);
        hasilKeliling = findViewById(R.id.txtKeliling);
    }

    public void btnHitung(View view) {
//        Luas Segitiga (1/2 * a * t)
        try {
            alas = Float.parseFloat(a.getText().toString());
            tinggi = Float.parseFloat(t.getText().toString());
            countLuas = (float) (0.5 * alas * tinggi);
            hasilLuas.setText(Float.toString(countLuas));
        }
        catch(NumberFormatException e)
        {
            Log.d("Error","Format Salah!"+e);
            Toast.makeText(getApplicationContext(), "Format Salah", Toast.LENGTH_SHORT).show();
        }

//        Keliling Segitiga (s + s + s)
        try {
            sisi = Float.parseFloat(s.getText().toString());
            countKeliling = sisi + sisi + sisi;
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