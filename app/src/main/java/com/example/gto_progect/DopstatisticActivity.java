package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gto_progect.databinding.ActivityDopstatisticBinding;
import com.example.gto_progect.databinding.ActivityMainBinding;
import com.example.gto_progect.databinding.ActivityStatisticBinding;

public class DopstatisticActivity extends AppCompatActivity {
    private ActivityDopstatisticBinding binding;

    @Override
         protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDopstatisticBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

binding.back.setOnClickListener(view -> {
    Intent back = new Intent();
    back.setClass(DopstatisticActivity.this, StatisticActivity.class);
    startActivity(back);
});




     String info = InfoBase.information;



        switch (info) {
            case "M,6-7,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("4");
                binding.static2.setText("9,9");
                binding.static3.setText("25");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,6-7,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3");
                binding.static2.setText("10,8");
                binding.static3.setText("18");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,6-7,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("2");
                binding.static2.setText("11,2");
                binding.static3.setText("12");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3");
                binding.static2.setText("10,8");
                binding.static3.setText("25");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("2");
                binding.static2.setText("11,2");
                binding.static3.setText("18");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Метание теннисного мяча\n" +
                        "в цель, дистанция 5 м\n" +
                        "(количество попаданий) ");
                binding.normative2.setText("5. Челночный бег 3x10 м (с)");
                binding.normative3.setText("6. Плавание (м) ");
                binding.normative4.setVisibility(View.GONE);
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("1");
                binding.static2.setText("11,7");
                binding.static3.setText("12");
                binding.static4.setVisibility(View.GONE);
                binding.static5.setVisibility(View.GONE);
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,8-9,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("142");
                binding.static2.setText("37");
                binding.static3.setText("4");
                binding.static4.setText("9,1");
                binding.static5.setText("2:27");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,8-9,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("122");
                binding.static2.setText("25");
                binding.static3.setText("3");
                binding.static4.setText("9,8");
                binding.static5.setText("2:36");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,8-9,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("108");
                binding.static2.setText("20");
                binding.static3.setText("2");
                binding.static4.setText("10,5");
                binding.static5.setText("3:05");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,8-9,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("137");
                binding.static2.setText("32");
                binding.static3.setText("3");
                binding.static4.setText("9,4");
                binding.static5.setText("2:27");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,8-9,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("117");
                binding.static2.setText("22");
                binding.static3.setText("2");
                binding.static4.setText("10,2");
                binding.static5.setText("2:36");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "W,8-9,С":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину\n" +
                        "с места толчком\n" +
                        "двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6. Метание теннисного мяча\n" +
                        "в цель, дистанция 6 м\n" +
                        "(количество попаданий) ");
                binding.normative4.setText("6. Челночный бег\n" +
                        "3x10 м (с)");
                binding.normative5.setText("7. Плавание\n" +
                        "на 25 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("103");
                binding.static2.setText("17");
                binding.static3.setText("1");
                binding.static4.setText("10,8");
                binding.static5.setText("3:05");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,10-11,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.4");
                binding.static2.setText("162");
                binding.static3.setText("43");
                binding.static4.setText("28");
                binding.static5.setText("2:18");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,10-11,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.2");
                binding.static2.setText("142");
                binding.static3.setText("33");
                binding.static4.setText("22");
                binding.static5.setText("2:27");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,10-11,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.7");
                binding.static2.setText("128");
                binding.static3.setText("26");
                binding.static4.setText("18");
                binding.static5.setText("3:00");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.6");
                binding.static2.setText("152");
                binding.static3.setText("37");
                binding.static4.setText("20");
                binding.static5.setText("2:20");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.4");
                binding.static2.setText("132");
                binding.static3.setText("28");
                binding.static4.setText("15");
                binding.static5.setText("2:30");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setVisibility(View.GONE);
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setVisibility(View.GONE);
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("10.1");
                binding.static2.setText("118");
                binding.static3.setText("23");
                binding.static4.setText("12");
                binding.static5.setText("3:00");
                binding.static6.setVisibility(View.GONE);
                binding.static7.setVisibility(View.GONE);
                binding.static8.setVisibility(View.GONE);
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,12-13,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("7.7");
                binding.static2.setText("183");
                binding.static3.setText("47");
                binding.static4.setText("34");
                binding.static5.setText("0:58");
                binding.static6.setText("20");
                binding.static7.setText("25");
                binding.static8.setText("7");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,12-13,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.5");
                binding.static2.setText("162");
                binding.static3.setText("37");
                binding.static4.setText("27");
                binding.static5.setText("1:18");
                binding.static6.setText("15");
                binding.static7.setText("20");
                binding.static8.setText("5");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,12-13,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.2");
                binding.static2.setText("147");
                binding.static3.setText("31");
                binding.static4.setText("23");
                binding.static5.setText("1:33");
                binding.static6.setText("9");
                binding.static7.setText("10");
                binding.static8.setText("3");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,12-13,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.0");
                binding.static2.setText("167");
                binding.static3.setText("41");
                binding.static4.setText("23");
                binding.static5.setText("1:03");
                binding.static6.setText("20");
                binding.static7.setText("25");
                binding.static8.setText("7");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "W,12-13,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на\n" +
                        "навыки\n" +
                        "50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.9");
                binding.static2.setText("147");
                binding.static3.setText("31");
                binding.static4.setText("19");
                binding.static5.setText("1:23");
                binding.static6.setText("15");
                binding.static7.setText("20");
                binding.static8.setText("5");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,12-13,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.6");
                binding.static2.setText("132");
                binding.static3.setText("27");
                binding.static4.setText("15");
                binding.static5.setText("1:38");
                binding.static6.setText("9");
                binding.static7.setText("10");
                binding.static8.setText("3");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,14-15,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("7.1");
                binding.static2.setText("218");
                binding.static3.setText("50");
                binding.static4.setText("41");
                binding.static5.setText("0:54");
                binding.static6.setText("25");
                binding.static7.setText("30");
                binding.static8.setText("26-30");
                binding.static9.setText("7");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,14-15,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("7.7");
                binding.static2.setText("193");
                binding.static3.setText("40");
                binding.static4.setText("35");
                binding.static5.setText("1:13");
                binding.static6.setText("20");
                binding.static7.setText("25");
                binding.static8.setText("21-25");
                binding.static9.setText("5");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,14-15,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.2");
                binding.static2.setText("167");
                binding.static3.setText("34");
                binding.static4.setText("30");
                binding.static5.setText("1:27");
                binding.static6.setText("15");
                binding.static7.setText("18");
                binding.static8.setText("15-20");
                binding.static9.setText("3");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,14-15,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("7.9");
                binding.static2.setText("183");
                binding.static3.setText("44");
                binding.static4.setText("27");
                binding.static5.setText("1:01");
                binding.static6.setText("25");
                binding.static7.setText("30");
                binding.static8.setText("26-30");
                binding.static9.setText("7");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,14-15,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо \n" +
                        "«электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("8.7");
                binding.static2.setText("162");
                binding.static3.setText("35");
                binding.static4.setText("21");
                binding.static5.setText("1:18");
                binding.static6.setText("20");
                binding.static7.setText("25");
                binding.static8.setText("21-25");
                binding.static9.setText("5");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,14-15,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Челночный бег\n" +
                        "3x10 м (с) ");
                binding.normative2.setText("6. Прыжок в длину\n" +
                        "с места толчком двумя\n" +
                        "ногами (см)");
                binding.normative3.setText("6. Поднимание туловища\n" +
                        "из положения лежа\n" +
                        "на спине (количество раз\n" +
                        "за 1 мин)\n ");
                binding.normative4.setText("7. Метание мяча весом\n" +
                        "150 г (м)");
                binding.normative5.setText("7. Плавание на 50 м (мин, с) ");
                binding.normative6.setText("7. Стрельба из положения сидя с\n" +
                        "опорой локтей о стол и с упора\n" +
                        "для винтовки, дистанция 10 м\n" +
                        "из пневматической винтовки с\n" +
                        "открытым прицелом (очки) ");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 5 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("9.1");
                binding.static2.setText("148");
                binding.static3.setText("31");
                binding.static4.setText("19");
                binding.static5.setText("1:32");
                binding.static6.setText("15");
                binding.static7.setText("18");
                binding.static8.setText("15-20");
                binding.static9.setText("3");
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,16-17,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 700 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("235");
                binding.static2.setText("51");
                binding.static3.setText("36");
                binding.static4.setText("00:49");
                binding.static5.setText("25");
                binding.static6.setText("30");
                binding.static7.setText("26-30");
                binding.static8.setText("7");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,16-17,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 700 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("213");
                binding.static2.setText("41");
                binding.static3.setText("30");
                binding.static4.setText("1:05");
                binding.static5.setText("20");
                binding.static6.setText("25");
                binding.static7.setText("21-25");
                binding.static8.setText("5");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,16-17,С":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ>");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 700 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("192");
                binding.static2.setText("35");
                binding.static3.setText("17");
                binding.static4.setText("1:20");
                binding.static5.setText("15");
                binding.static6.setText("18");
                binding.static7.setText("15-20");
                binding.static8.setText("3");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,16-17,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 500 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("188");
                binding.static2.setText("45");
                binding.static3.setText("22");
                binding.static4.setText("1:00");
                binding.static5.setText("25");
                binding.static6.setText("30");
                binding.static7.setText("26-30");
                binding.static8.setText("7");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,16-17,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 500 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("173");
                binding.static2.setText("37");
                binding.static3.setText("17");
                binding.static4.setText("1:18");
                binding.static5.setText("20");
                binding.static6.setText("25");
                binding.static7.setText("21-25");
                binding.static8.setText("5");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,16-17,С":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ>");

                //======================================================================== Название нормативов
                binding.normative1.setText("5. Прыжок в длину с места\n" +
                        "толчком двумя ногами (см) ");
                binding.normative2.setText("5. Поднимание туловища из\n" +
                        "положения лежа на спине\n" +
                        "(количество раз за 1 мин)");
                binding.normative3.setText("6.Метание спортивного снаряда\n" +
                        "весом 700 г (м) ");
                binding.normative4.setText("6. Плавание на 50 м (мин, с)");
                binding.normative5.setText("7.  ");
                binding.normative6.setText("6. Стрельба из положения сидя\n" +
                        "или стоя с опорой локтей о\n" +
                        "стол или стойку, дистанция\n" +
                        "10 м (очки): из\n" +
                        "пневматической винтовки с\n" +
                        "открытым прицелом");
                binding.normative7.setText("7. Стрельба из пневматической\n" +
                        "винтовки с диоптрическим\n" +
                        "прицелом либо\n" +
                        " «электронного оружия» (очки) ");
                binding.normative8.setText("7. Самозащита без оружия\n" +
                        "(очки)");
                binding.normative9.setText("7. Туристский поход с проверкой\n" +
                        "туристских навыков\n" +
                        "протяженностью не менее 10 км\n" +
                        "(количество навыков) ");

                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("157");
                binding.static2.setText("32");
                binding.static3.setText("12");
                binding.static4.setText("1:45");
                binding.static5.setText("15");
                binding.static6.setText("18");
                binding.static7.setText("15-20");
                binding.static8.setText("3");
                binding.static9.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

                //TODO ТАМ КРЧ БАГ С НОРМАТИВАМИ У ВУМЕН 16-17 (НОРМАТИВ 5) НЕ ЗАБУДЬ ИСПРАВИТЬ
            //TODO WOMEN БРОНЗА 16-17 не работает на эмуляторе. Чекни чо херь
            //TODO добавить тёмную тему, пофиксить баг с тёмной темой в главном меню
            //TODO и Добавь объяснение как с этой хернёй (твоим приложением) работь. Чо то типо вкладки "помощь","подробнее" ну или на конец "как это работает"
        }
    }}





























































