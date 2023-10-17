package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.gto_progect.databinding.ActivityMainBinding;
import com.example.gto_progect.databinding.ActivityStatisticBinding;

public class StatisticActivity extends AppCompatActivity {
private ActivityStatisticBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityStatisticBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
Intent intent = getIntent();
String info = intent.getStringExtra("key");
switch (info){
    case "M,9-10,G":
        binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");
        binding.static1.setText("10.5");
        binding.static2.setText("1.5");
        binding.static3.setText("5");
        binding.static4.setText("---");
        binding.static5.setText("16");
        binding.static6.setText("Достать пол ладонями");
        break;
    case "W,9-10,G":


}
binding.back.setOnClickListener(view -> {
    Intent back = new Intent();
    back.setClass(StatisticActivity.this,MainActivity.class);
    startActivity(back);
});

    }
}