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
        binding.old67.setOnClickListener(view1 -> {old =6;});
        binding.old89.setOnClickListener(view1 -> {old =8;});
        binding.old1011.setOnClickListener(view1 -> {old =10;});
        binding.old1213.setOnClickListener(view1 -> {old =12;});
        binding.old1415.setOnClickListener(view1 -> {old =14;});
        binding.old1617.setOnClickListener(view1 -> {old =16;});
        binding.man.setOnClickListener(view1 -> {pol =1;});
        binding.women.setOnClickListener(view1 -> {pol =2;});
binding.gotovo.setOnClickListener(view -> {

if(pol > 0&& old>0&&medal>0){

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
//============================================================== мужики на золото
    if(pol == 1 && old ==6 && medal == 1)a = "M,6-7,G";
    if(pol == 1 && old ==8 && medal == 1)a = "M,8-9,G";
    if(pol == 1 && old ==10 && medal == 1)a = "M,10-11,G";
    if(pol == 1 && old ==12 && medal == 1)a = "M,12-13,G";
    if(pol == 1 && old ==14 && medal == 1)a = "M,14-15,G";
    if(pol == 1 && old ==16 && medal == 1)a = "M,16-17,G";
//============================================================== мужики на серебро
    if(pol == 1 && old ==6 && medal == 2)a = "M,6-7,S";
    if(pol == 1 && old ==8 && medal == 2)a = "M,8-9,S";
    if(pol == 1 && old ==10 && medal == 2)a = "M,10-11,S";
    if(pol == 1 && old ==12 && medal == 2)a = "M,12-13,S";
    if(pol == 1 && old ==14 && medal == 2)a = "M,14-15,S";
    if(pol == 1 && old ==16 && medal == 2)a = "M,16-17,S";
//============================================================== мужики на бронзу
    if(pol == 1 && old ==6 && medal == 3)a = "M,6-7,С";
    if(pol == 1 && old ==8 && medal == 3)a = "M,8-9,С";
    if(pol == 1 && old ==10 && medal == 3)a = "M,10-11,C";
    if(pol == 1 && old ==12 && medal == 3)a = "M,12-13,C";
    if(pol == 1 && old ==14 && medal == 3)a = "M,14-15,C";
    if(pol == 1 && old ==16 && medal == 3)a = "M,16-17,C";




//============================================================== девочки на золото
    if(pol == 2 && old ==6 && medal == 1)a = "W,6-7,G";
    if(pol == 2 && old ==8 && medal == 1)a = "W,8-9,G";
    if(pol == 2 && old ==10 && medal == 1)a = "W,10-11,G";
    if(pol == 2 && old ==12 && medal == 1)a = "W,12-13,G";
    if(pol == 2 && old ==14 && medal == 1)a = "W,14-15,G";
    if(pol == 2 && old ==16 && medal == 1)a = "W,16-17,G";
//============================================================== девочки на серебро
    if(pol == 2 && old ==6 && medal == 2)a = "W,6-7,S";
    if(pol == 2 && old ==8 && medal == 2)a = "W,8-9,S";
    if(pol == 2 && old ==10 && medal == 2)a = "W,10-11,S";
    if(pol == 2 && old ==12 && medal == 2)a = "W,12-13,S";
    if(pol == 2 && old ==14 && medal == 2)a = "W,14-15,S";
    if(pol == 2 && old ==16 && medal == 2)a = "W,16-17,S";
//============================================================== девочки на бронзу
    if(pol == 2 && old ==6 && medal == 3)a = "W,6-7,С";
    if(pol == 2 && old ==8 && medal == 3)a = "W,8-9,С";
    if(pol == 2 && old ==10 && medal == 3)a = "W,10-11,С";
    if(pol == 2 && old ==12 && medal == 3)a = "W,12-13,С";
    if(pol == 2 && old ==14 && medal == 3)a = "W,14-15,С";
    if(pol == 2 && old ==16 && medal == 3)a = "W,16-17,С";


    return a;
}

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("jj");
    }
}