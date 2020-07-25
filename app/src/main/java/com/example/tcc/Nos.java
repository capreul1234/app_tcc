package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Nos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nos);
    }

    public void neves(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/gbneves7?igshid=1hglo88j3pse6"));
        startActivity(intent);
    }
    public void gabriel(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/gbiel_elias?igshid=gn82lu5o8cko"));
        startActivity(intent);
    }


}