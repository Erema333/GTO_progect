package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
        switch (info) {
            case "M,6-7,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("1.1 Бег 10м (с)");
                binding.normative2.setText("1.2 Бег 30м (с)");
                binding.normative3.setText("2.1 Шестиминутный бег (м)");
                binding.normative4.setText("2.2 Ходьба на лыжах (м)");
                binding.normative5.setText("2.3 Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText("3.1 Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText("3.2 Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText("3.3 прыжок в длину с места толчком двумя ногами (см)");
                binding.normative9.setText("4 Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3.1");
                binding.static2.setText("8.3");
                binding.static3.setText("800");
                binding.static4.setText("1400");
                binding.static5.setText("600");
                binding.static6.setText("305");
                binding.static7.setText("15");
                binding.static8.setText("115");
                binding.static9.setText("+7");
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,6-7,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("1.1 Бег 10м (с)");
                binding.normative2.setText("1.2 Бег 30м (с)");
                binding.normative3.setText("2.1 Шестиминутный бег (м)");
                binding.normative4.setText("2.2 Ходьба на лыжах (м)");
                binding.normative5.setText("2.3 Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText("3.1 Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText("3.2 Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText("3.3 прыжок в длину с места толчком двумя ногами (см)");
                binding.normative9.setText("4 Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3.4");
                binding.static2.setText("8.6");
                binding.static3.setText("600");
                binding.static4.setText("1000");
                binding.static5.setText("400");
                binding.static6.setText("220");
                binding.static7.setText("12");
                binding.static8.setText("95");
                binding.static9.setText("+3");
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,6-7,С":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("1.1 Бег 10м (с)");
                binding.normative2.setText("1.2 Бег 30м (с)");
                binding.normative3.setText("2.1 Шестиминутный бег (м)");
                binding.normative4.setText("2.2 Ходьба на лыжах (м)");
                binding.normative5.setText("2.3 Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText("3.1 Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText("3.2 Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText("3.3 прыжок в длину с места толчком двумя ногами (см)");
                binding.normative9.setText("4 Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3.8");
                binding.static2.setText("9.6");
                binding.static3.setText("400");
                binding.static4.setText("600");
                binding.static5.setText("200");
                binding.static6.setText("210");
                binding.static7.setText("11");
                binding.static8.setText("85");
                binding.static9.setText("+1");
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,8-9,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("1 Бег 30м (с)");
                binding.normative2.setText("2.1 Смешанное передвижение на 1000 м (мин, с)");
                binding.normative3.setText("2.2 Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative4.setText("2.3 Смешанное передвижение по пересечённой местностина 1 км (мин, с)");
                binding.normative5.setText("3.1 Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative6.setText("3.2 Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative7.setText("3.3 Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative8.setText("4 Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.9");
                binding.static2.setText("5:12");
                binding.static3.setText("7:55");
                binding.static4.setText("5:55");
                binding.static5.setText("5");
                binding.static6.setText("16");
                binding.static7.setText("18");
                binding.static8.setText("+7");

                binding.static9.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,8-9,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("1 Бег 30м (с)");
                binding.normative2.setText("2.1 Смешанное передвижение на 1000 м (мин, с)");
                binding.normative3.setText("2.2 Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative4.setText("2.3 Смешанное передвижение по пересечённой местностина 1 км (мин, с)");
                binding.normative5.setText("3.1 Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative6.setText("3.2 Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative7.setText("3.3 Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative8.setText("4 Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                binding.normative9.setVisibility(View.GONE);
                binding.normative10.setVisibility(View.GONE);
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.5");
                binding.static2.setText("6:30");
                binding.static3.setText("9:20");
                binding.static4.setText("6:55");
                binding.static5.setText("4");
                binding.static6.setText("10");
                binding.static7.setText("11");
                binding.static8.setText("+3");

                binding.static9.setVisibility(View.GONE);
                binding.static10.setVisibility(View.GONE);
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
        }

            binding.back.setOnClickListener(view -> {
            Intent back = new Intent();
            back.setClass(StatisticActivity.this, MainActivity.class);
            startActivity(back);
        });

    }
}