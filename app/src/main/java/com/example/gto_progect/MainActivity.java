package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;

import com.example.gto_progect.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private int old = 0;
    private int pol = 0;
    private int medal = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        binding.gold.setOnClickListener(view1 -> {medal =1;});
        binding.serebro.setOnClickListener(view1 -> {medal =2;});
        binding.copper.setOnClickListener(view1 -> {medal =3;});
        binding.old910.setOnClickListener(view1 -> {old =1;});
        binding.old1112.setOnClickListener(view1 -> {old =2;});
        binding.old1315.setOnClickListener(view1 -> {old =3;});
        binding.old1617.setOnClickListener(view1 -> {old =4;});
        binding.man.setOnClickListener(view1 -> {pol =1;});
        binding.women.setOnClickListener(view1 -> {pol =2;});
binding.gotovo.setOnClickListener(view -> {

if(pol > 0|| old>0){

    Intent perehod = new Intent();
    perehod.setClass(MainActivity.this,StatisticActivity.class);
    perehod.putExtra("key", getInfo());
    startActivity(perehod);

}else{
    System.out.println("там ноль");

}
});
    }
public String getInfo(){
        String a = "null";
        if(pol == 1 && old ==1 && medal == 1)a = "M,9-10,G";
        if(pol == 1 && old ==2 && medal == 1)a = "M,11-12,G";
        if(pol == 1 && old ==3 && medal == 1)a = "M,13-15,G";
        if(pol == 1 && old ==4 && medal == 1)a = "M,16-17,G";
        if(pol == 2 && old ==1 && medal == 1)a = "W,9-10,G";
        if(pol == 2 && old ==2 && medal == 1)a = "W,11-12,G";
        if(pol == 2 && old ==3 && medal == 1)a = "W,13-15,G";
        if(pol == 2 && old ==4 && medal == 1)a = "W,16-17,G";

    if(pol == 1 && old ==1 && medal == 2)a = "M,9-10,S";
    if(pol == 1 && old ==2 && medal == 2)a = "M,11-12,S";
    if(pol == 1 && old ==3 && medal == 2)a = "M,13-15,S";
    if(pol == 1 && old ==4 && medal == 2)a = "M,16-17,S";
    if(pol == 2 && old ==1 && medal == 2)a = "W,9-10,S";
    if(pol == 2 && old ==2 && medal == 2)a = "W,11-12,S";
    if(pol == 2 && old ==3 && medal == 2)a = "W,13-15,S";
    if(pol == 2 && old ==4 && medal == 2)a = "W,16-17,S";

    if(pol == 1 && old ==1 && medal == 3)a = "M,9-10,C";
    if(pol == 1 && old ==2 && medal == 3)a = "M,11-12,C";
    if(pol == 1 && old ==3 && medal == 3)a = "M,13-15,C";
    if(pol == 1 && old ==4 && medal == 3)a = "M,16-17,C";
    if(pol == 2 && old ==1 && medal == 3)a = "W,9-10,C";
    if(pol == 2 && old ==2 && medal == 3)a = "W,11-12,C";
    if(pol == 2 && old ==3 && medal == 3)a = "W,13-15,C";
    if(pol == 2 && old ==4 && medal == 3)a = "W,16-17,C";
    return a;
}

}