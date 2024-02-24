package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;

import com.example.gto_progect.databinding.ActivityMainBinding;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
boolean blan = false;
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
        binding.old1819.setOnClickListener(view1 -> {old =18;});
        binding.old2024.setOnClickListener(view1 -> {old =20;});
        binding.old2529.setOnClickListener(view1 -> {old =25;});
        binding.man.setOnClickListener(view1 -> {pol =1;});
        binding.women.setOnClickListener(view1 -> {pol =2;});

binding.gotovo.setOnClickListener(view -> {

if(pol > 0&& old>0&&medal>0){
    InfoBase.information = getInfo();
    Intent perehod = new Intent();
    perehod.setClass(MainActivity.this,StatisticActivity.class);
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
    if(pol == 1 && old ==18 && medal == 1)a = "M,18-19,G";
    if(pol == 1 && old ==20 && medal == 1)a = "M,20-24,G";
    if(pol == 1 && old ==25 && medal == 1)a = "M,25-29,G";
    if(pol == 1 && old ==30 && medal == 1)a = "M,30-34,G";
//============================================================== мужики на серебро
    if(pol == 1 && old ==6 && medal == 2)a = "M,6-7,S";
    if(pol == 1 && old ==8 && medal == 2)a = "M,8-9,S";
    if(pol == 1 && old ==10 && medal == 2)a = "M,10-11,S";
    if(pol == 1 && old ==12 && medal == 2)a = "M,12-13,S";
    if(pol == 1 && old ==14 && medal == 2)a = "M,14-15,S";
    if(pol == 1 && old ==16 && medal == 2)a = "M,16-17,S";
    if(pol == 1 && old ==18 && medal == 2)a = "M,18-19,S";
    if(pol == 1 && old ==20 && medal == 2)a = "M,20-24,S";
    if(pol == 1 && old ==25 && medal == 2)a = "M,25-29,S";
    if(pol == 1 && old ==30 && medal == 2)a = "M,30-34,S";
//============================================================== мужики на бронзу
    if(pol == 1 && old ==6 && medal == 3)a = "M,6-7,C";
    if(pol == 1 && old ==8 && medal == 3)a = "M,8-9,C";
    if(pol == 1 && old ==10 && medal == 3)a = "M,10-11,C";
    if(pol == 1 && old ==12 && medal == 3)a = "M,12-13,C";
    if(pol == 1 && old ==14 && medal == 3)a = "M,14-15,C";
    if(pol == 1 && old ==16 && medal == 3)a = "M,16-17,C";
    if(pol == 1 && old ==18 && medal == 3)a = "M,18-19,C";
    if(pol == 1 && old ==20 && medal == 3)a = "M,20-24,C";
    if(pol == 1 && old ==25 && medal == 3)a = "M,25-29,C";
    if(pol == 1 && old ==30 && medal == 3)a = "M,30-34,C";



//============================================================== девочки на золото
    if(pol == 2 && old ==6 && medal == 1)a = "W,6-7,G";
    if(pol == 2 && old ==8 && medal == 1)a = "W,8-9,G";
    if(pol == 2 && old ==10 && medal == 1)a = "W,10-11,G";
    if(pol == 2 && old ==12 && medal == 1)a = "W,12-13,G";
    if(pol == 2 && old ==14 && medal == 1)a = "W,14-15,G";
    if(pol == 2 && old ==16 && medal == 1)a = "W,16-17,G";
    if(pol == 2 && old ==18 && medal == 1)a = "W,18-19,G";
    if(pol == 2 && old ==20 && medal == 1)a = "W,20-24,G";
    if(pol == 2 && old ==25 && medal == 1)a = "W,25-29,G";
    if(pol == 2 && old ==30 && medal == 1)a = "W,30-34,G";
//============================================================== девочки на серебро
    if(pol == 2 && old ==6 && medal == 2)a = "W,6-7,S";
    if(pol == 2 && old ==8 && medal == 2)a = "W,8-9,S";
    if(pol == 2 && old ==10 && medal == 2)a = "W,10-11,S";
    if(pol == 2 && old ==12 && medal == 2)a = "W,12-13,S";
    if(pol == 2 && old ==14 && medal == 2)a = "W,14-15,S";
    if(pol == 2 && old ==16 && medal == 2)a = "W,16-17,S";
    if(pol == 2 && old ==18 && medal == 2)a = "W,18-19,S";
    if(pol == 2 && old ==20 && medal == 2)a = "W,20-24,S";
    if(pol == 2 && old ==25 && medal == 2)a = "W,25-29,S";
    if(pol == 2 && old ==30 && medal == 2)a = "W,30-34,S";
//============================================================== девочки на бронзу
    if(pol == 2 && old ==6 && medal == 3)a = "W,6-7,C";
    if(pol == 2 && old ==8 && medal == 3)a = "W,8-9,C";
    if(pol == 2 && old ==10 && medal == 3)a = "W,10-11,C";
    if(pol == 2 && old ==12 && medal == 3)a = "W,12-13,C";
    if(pol == 2 && old ==14 && medal == 3)a = "W,14-15,C";
    if(pol == 2 && old ==16 && medal == 3)a = "W,16-17,C";
    if(pol == 2 && old ==18 && medal == 3)a = "W,18-19,C";
    if(pol == 2 && old ==20 && medal == 3)a = "W,20-24,C";
    if(pol == 2 && old ==25 && medal == 3)a = "W,25-29,C";
    if(pol == 2 && old ==30 && medal == 3)a = "W,30-34,C";

    return a;

}

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("jj");
    }
}