package com.example.bangunan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LK_Kubus extends AppCompatActivity {

    private EditText s;
    private TextView hasilLuas, hasilKeliling;
    private float sisi, countLuas, countKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lk_kubus);
        s=findViewById(R.id.edTextSisi);
        hasilLuas=findViewById(R.id.txtLuas);
        hasilKeliling=findViewById(R.id.txtKeliling);
    }

    public void btnHitung(View view) {
//        Luas Kubus (6 * (s*s))
        try {
            sisi = Float.parseFloat(s.getText().toString());
            countLuas = 6 * (sisi * sisi);
            hasilLuas.setText(Float.toString(countLuas));
        }
        catch(NumberFormatException e)
        {
            Log.d("Error","Format Salah!"+e);
            Toast.makeText(getApplicationContext(), "Format Salah", Toast.LENGTH_SHORT).show();
        }

//        Keliiling Kubus (12 * s)
        try {
            sisi = Float.parseFloat(s.getText().toString());
            countKeliling = 12 * sisi;
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