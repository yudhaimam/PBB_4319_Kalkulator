package com.example.bangunan;

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

    public void btnPersegi(View view) {
        Intent persegi = new Intent(this, LK_Persegi.class);
        startActivity(persegi);
    }

    public void btnSegitiga(View view) {
        Intent segitiga = new Intent(this, LK_Segitiga.class);
        startActivity(segitiga);
    }

    public void btnLingkaran(View view) {
        Intent lingkaran = new Intent(this, LK_Lingkaran.class);
        startActivity(lingkaran);
    }

    public void btnKubus(View view) {
        Intent kubus = new Intent(this, LK_Kubus.class);
        startActivity(kubus);
    }
}