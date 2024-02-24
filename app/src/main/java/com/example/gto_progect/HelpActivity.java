package com.example.gto_progect;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.example.gto_progect.databinding.HelpWindowBinding;


public class HelpActivity extends AppCompatActivity {
    private HelpWindowBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = HelpWindowBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.back.setOnClickListener(view -> {
            Intent back = new Intent();
            back.setClass(HelpActivity.this, MainActivity.class);
            startActivity(back);
        });

}}
