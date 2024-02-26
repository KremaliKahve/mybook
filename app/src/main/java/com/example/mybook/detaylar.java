package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;

import com.example.mybook.databinding.ActivityDetaylarBinding;
import com.example.mybook.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class detaylar extends AppCompatActivity {
    String ad,yazar;

    private ActivityDetaylarBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetaylarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        ad=intent.getStringExtra("ad");
        yazar=intent.getStringExtra("yazar");
        startActivity(intent);
        binding.ad.setText(ad);
        binding.yazar.setText(yazar);
    }
}