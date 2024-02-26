package com.example.mybook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.mybook.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        bookproperty kurk = new bookproperty("kürk mantolu modanna","Sabahattin Ali",R.drawable.manto);
        bookproperty b1984 = new bookproperty("1984","Gearge Orwell",R.drawable.b1984);
        bookproperty hayvan = new bookproperty("hayvan çiftliği","Gearge Orwell",R.drawable.hayvan);
        ArrayList<bookproperty> bookpropertyArrayList = new ArrayList<bookproperty>();
        bookpropertyArrayList.add(kurk);
        bookpropertyArrayList.add(b1984);
        bookpropertyArrayList.add(hayvan);
        Intent intent=getIntent();
        startActivity(intent);
        binding.recycle.setLayoutManager(new LinearLayoutManager(this));
        recycleadapter recycleadapter = new recycleadapter(bookpropertyArrayList);
        binding.recycle.setAdapter(recycleadapter);
    }
}