package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);
        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");
        switch (nama)
        {
            case "Naufal":
                tvnama.setText("Naufal M");
                tvnomor.setText("082288416394");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("081298239451");
                break;
            case "Kurniawan":
                tvnama.setText("Kurniawan J");
                tvnomor.setText("081294492939");
                break;
            case "Gempi":
                tvnama.setText("Gempi K");
                tvnomor.setText("081244345425");
                break;
            case "Giselle":
                tvnama.setText("Giselle M");
                tvnomor.setText("0812084504823");
                break;
            case "Raffi":
                tvnama.setText("Raffi R");
                tvnomor.setText("082254567893");
                break;
            case "Ahmad":
                tvnama.setText("Ahmad M");
                tvnomor.setText("081245454345");
                break;
            case "Deddy":
                tvnama.setText("Deddy C");
                tvnomor.setText("081374739475");
                break;
            case "Corbuzier":
                tvnama.setText("Corbuzier M");
                tvnomor.setText("081256634567");
                break;
            case "Rafatar":
                tvnama.setText("Rafatar R");
                tvnomor.setText("0821453902849");
        }
    }
}