package com.example.gto_progect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gto_progect.databinding.ActivityMainBinding;
import com.example.gto_progect.databinding.ActivityStatisticBinding;

public class StatisticActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        com.example.gto_progect.databinding.ActivityStatisticBinding binding = ActivityStatisticBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        String info = InfoBase.information;



        switch (info) {
            case "M,6-7,G":
                //============================================================================================================================ 6 - 7 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("");
                binding.static2.setText("8.3");
                binding.static3.setText("800");
                binding.static4.setText("1400");
                binding.static5.setText("600");
                binding.static6.setText("305");
                binding.static7.setText("15");
                binding.static8.setText("115");
                binding.static10.setText("+7");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,6-7,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
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
                binding.static10.setText("+3");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,6-7,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
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
                binding.static10.setText("+1");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3.3");
                binding.static2.setText("8.8");
                binding.static3.setText("700");
                binding.static4.setText("1300");
                binding.static5.setText("480");
                binding.static6.setText("250");
                binding.static7.setText("14");
                binding.static8.setText("107");
                binding.static10.setText("+9");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("3.6");
                binding.static2.setText("9.1");
                binding.static3.setText("500");
                binding.static4.setText("900");
                binding.static5.setText("280");
                binding.static6.setText("155");
                binding.static7.setText("11");
                binding.static8.setText("87");
                binding.static10.setText("+5");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,6-7,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 10м (с)");
                binding.normative2.setText(" Бег 30м (с)");
                binding.normative3.setText(" Шестиминутный бег (м)");
                binding.normative4.setText(" Ходьба на лыжах (м)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местности (м)");
                binding.normative6.setText(" Бросок набивного мяча (1кг) двумя руками из-за головы из исходного положения: ноги на ширине плеч, мяч в руках внизу (см)");
                binding.normative7.setText(" Поднимание туловища из положения лежа на спине (количество раз за 30 с)");
                binding.normative8.setText(" прыжок в длину с места толчком двумя ногами (см)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье\n" +
                        "(от уровня скамьи – см) ");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);

                binding.static1.setText("4.0");
                binding.static2.setText("10.1");
                binding.static3.setText("300");
                binding.static4.setText("500");
                binding.static5.setText("180");
                binding.static6.setText("145");
                binding.static7.setText("10");
                binding.static8.setText("77");
                binding.static10.setText("+3");
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,8-9,G":
                //============================================================================================================================ 8 - 9 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");
                binding.normative6.setText(" Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.9");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("5:12");
                binding.static4.setText("7:55");
                binding.static5.setText("5:55");
                binding.static6.setText("5");
                binding.static7.setText("16");
                binding.static8.setText("18");
                binding.static10.setText("+7");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,8-9,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
               binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");
                binding.normative6.setText(" Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.5");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("6:30");
                binding.static4.setText("9:20");
                binding.static5.setText("6:55");
                binding.static6.setText("4");
                binding.static7.setText("10");
                binding.static8.setText("11");
                binding.static10.setText("+3");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,8-9,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
               binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");
                binding.normative6.setText(" Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("7.1");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("7:21");
                binding.static4.setText("11:25");
                binding.static5.setText("9:55");
                binding.static6.setText("2");
                binding.static7.setText("6");
                binding.static8.setText("5");
                binding.static10.setText("+1");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,8-9,G":
                //============================================================================================================================ 8 - 9 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");

                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                

                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.1");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("5:55");
                binding.static4.setText("8:18");
                binding.static5.setVisibility(View.GONE);
                binding.static6.setText("6:23");
                binding.static7.setText("12");
                binding.static8.setText("12");
                binding.static10.setText("+9");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,8-9,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");

                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                

                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.6");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("6:55");
                binding.static4.setText("10:05");
                binding.static5.setVisibility(View.GONE);
                binding.static6.setText("7:20");
                binding.static7.setText("7");
                binding.static8.setText("7");
                binding.static10.setText("+5");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,8-9,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Смешанное передвижение на 1000 м (мин, с)");
                binding.normative4.setText(" Бег на лыжах на 1 км\n"+"(мин, с)");
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setText(" Смешанное передвижение по пересечённой местностина 1 км (мин, с)");

                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                

                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("7.3");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("7:45");
                binding.static4.setText("12:45");
                binding.static5.setVisibility(View.GONE);
                binding.static6.setText("9:44");
                binding.static7.setText("4");
                binding.static8.setText("4");
                binding.static10.setText("+3");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,10-11,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "1 км (мин, с)");
                
                binding.normative5.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.3");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("4:42");
                binding.static4.setText("6:35");
                binding.static5.setText("12:45");
                binding.static6.setText("6");
                binding.static7.setText("21");
                binding.static8.setText("22");
                binding.static10.setText("+8");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,10-11,S":
                //============================================================================================================================ 10 - 11 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
              binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "1 км (мин, с)");
                
                binding.normative5.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);






                binding.static1.setText("5.9");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("5:41");
                binding.static4.setText("7:35");
                binding.static5.setText("15:45");
                binding.static6.setText("4");
                binding.static7.setText("13");
                binding.static8.setText("13");
                binding.static10.setText("+4");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,10-11,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
              binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "1 км (мин, с)");
                
                binding.normative5.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на высокой перекладине (кол-во раз)");
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);






                binding.static1.setText("6.3");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("6:20");
                binding.static4.setText("8:25");
                binding.static5.setText("18:25");
                binding.static6.setText("2");
                binding.static7.setText("8");
                binding.static8.setText("10");
                binding.static10.setText("+2");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText("Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "1 км (мин, с)");

                binding.normative5.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                ;
                binding.normative6.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.5");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("5:03");
                binding.static4.setText("7:19");

                binding.static5.setText("14:45");
                binding.static6.setText("16");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("13");
                binding.static10.setText("+11");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText("Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "1 км (мин, с)");
                binding.normative5.setVisibility(View.GONE);
                binding.normative6.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                ;
                binding.normative7.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.1");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("6:12");
                binding.static4.setText("8:10");
                binding.static5.setText("17:10");
                binding.static6.setText("10");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("7");
                binding.static10.setText("+5");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,10-11,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setVisibility(View.GONE);
                binding.normative3.setText("Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "1 км (мин, с)");

                binding.normative5.setText(" Кросс на 2 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                ;
                binding.static6.setText(" Подтягивание из виса лёжа на низкой перекладине 90 см (кол-во раз)");
                binding.static7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из положения стоя на гимнастической скамье (от уровня скамьи – см)");

                binding.normative9.setVisibility(View.GONE);
               
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("6.5");
                binding.static2.setVisibility(View.GONE);
                binding.static3.setText("6:40");
                binding.static4.setText("10:15");

                binding.static5.setText("19:25");
                binding.static6.setText("7");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("5");
                binding.static10.setText("+3");


                
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,12-13,G":
                //============================================================================================================================ 12 - 13 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setText("Бег на 60 м (с)");
                binding.normative3.setText("Бег на 1500 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "2 км (мин, с)");
                binding.normative5.setText("Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText("Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.0");
                binding.static2.setText("9.4");
                binding.static3.setText("6:40");
                binding.static4.setText("12:15");
                binding.static5.setText("15:45");
                binding.static6.setText("8");
                binding.static7.setText("24");
                binding.static8.setText("29");
                binding.static10.setText("+9");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,12-13,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setText("Бег на 60 м (с)");
                binding.normative3.setText("Бег на 1500 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "2 км (мин, с)");
                binding.normative5.setText("Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText("Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("5.4");
                binding.static2.setText("10.2");
                binding.static3.setText("7:55");
                binding.static4.setText("13:35");
                binding.static5.setText("17:05");
                binding.static6.setText("5");
                binding.static7.setText("16");
                binding.static8.setText("18");
                binding.static10.setText("+5");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,12-13,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText("Бег 30м (с)");
                binding.normative2.setText("Бег на 60 м (с)");
                binding.normative3.setText("Бег на 1500 м\n" +
                        "(мин, с)");
                binding.normative4.setText("Бег на лыжах на\n" +
                        "2 км (мин, с)");
                binding.normative5.setText("Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText("Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText("Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("5.4");
                binding.static2.setText("10.2");
                binding.static3.setText("7:55");
                binding.static4.setText("13:35");
                binding.static5.setText("17:05");
                binding.static6.setText("5");
                binding.static7.setText("16");
                binding.static8.setText("18");
                binding.static10.setText("+5");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,12-13,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 1500 м\n" +
                        "(мин, с)");

                binding.normative4.setText(" Бег на лыжах на\n" +
                        "2 км (мин, с)");

               ;
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.2");
                binding.static2.setText("9.9");
                binding.static3.setText("7:03");

                binding.static4.setText("13:10");

                binding.static5.setText("17:15");
                binding.static6.setText("18");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("15");
                binding.static10.setText("+13");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,12-13,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
               binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 1500 м\n" +
                        "(мин, с)");

                binding.normative4.setText(" Бег на лыжах на\n" +
                        "2 км (мин, с)");

               ;
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.7");
                binding.static2.setText("10.7");
                binding.static3.setText("8:15");
                binding.static4.setText("14:20");
                binding.static5.setText("19:40");
                binding.static6.setText("12");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("9");
                binding.static10.setText("+6");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "W,12-13,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
               binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 1500 м\n" +
                        "(мин, с)");

                binding.normative4.setText(" Бег на лыжах на\n" +
                        "2 км (мин, с)");

               ;
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);






                binding.static1.setText("6.1");
                binding.static2.setText("11.5");
                binding.static3.setText("9:10");
                binding.static4.setText("15:20");
                binding.static5.setText("21:30");
                binding.static6.setText("8");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("6");
                binding.static10.setText("+4");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,14-15,G":
                //============================================================================================================================ 14 - 15 лет
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("4.6");
                binding.static2.setText("8.1");
                binding.static3.setText("8:00");
                binding.static4.setText("16:05");
                binding.static5.setText("14:10");
                binding.static6.setText("13");
                binding.static7.setText("25");
                binding.static8.setText("37");
                binding.static10.setText("+11");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,14-15,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.0");
                binding.static2.setText("9.1");
                binding.static3.setText("9:2");
                binding.static4.setText("17:15");
                binding.static5.setText("15:45");
                binding.static6.setText("9");
                binding.static7.setText("18");
                binding.static8.setText("25");
                binding.static10.setText("+6");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;
            case "M,14-15,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.4");
                binding.static2.setText("9.7");
                binding.static3.setText("10:10");
                binding.static4.setText("19:15");
                binding.static5.setText("16:15");
                binding.static6.setText("5");
                binding.static7.setText("12");
                binding.static8.setText("19");
                binding.static10.setText("+4");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,14-15,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("4.9");
                binding.static2.setText("9.5");
                binding.static3.setText("9:55");
                binding.static4.setText("19:05");
                binding.static5.setText("16:40");
                binding.static6.setText("19");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("16");
                binding.static10.setText("+15");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,14-15,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                  binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.3");
                binding.static2.setText("10.2");
                binding.static3.setText("11:27");
                binding.static4.setText("20:25");
                binding.static5.setText("18:25");
                binding.static6.setText("13");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("11");
                binding.static10.setText("+8");


                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "W,14-15,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                  binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 60 м (с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");
                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине\n" +
                        "90 см (количество раз)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("5.7");
                binding.static2.setText("10.8");
                binding.static3.setText("12:40");
                binding.static4.setText("22:55");
                binding.static5.setText("19:55");
                binding.static6.setText("9");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("7");
                binding.static10.setText("+5");

                
                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,16-17,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");
                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("7.9");
                binding.static2.setText("1");
                binding.static3.setText("12:20");
                binding.static4.setText("23:40");
                binding.static5.setText("23:00");
                binding.static6.setText("15");
                binding.static7.setText("34");
                binding.static8.setText("43");
                binding.static10.setText("+13");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,16-17,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");
                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("8.4");
                binding.static2.setText("14.1");
                binding.static3.setText("14:10");
                binding.static4.setText("25:45");
                binding.static5.setText("25:00");
                binding.static6.setText("12");
                binding.static7.setText("19");
                binding.static8.setText("32");
                binding.static10.setText("+8");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,16-17,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 30м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");
                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");
                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9.0");
                binding.static2.setText("14.8");
                binding.static3.setText("15:20");
                binding.static4.setText("27:55");
                binding.static5.setText("27  :00");
                binding.static6.setText("8");
                binding.static7.setText("14");
                binding.static8.setText("25");
                binding.static10.setText("+6");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,16-17,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9.2");
                binding.static2.setText("15.8");
                binding.static3.setText("9:45");
                binding.static4.setText("16:40");
                binding.static5.setText("16:05");
                binding.static6.setText("20");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("17");
                binding.static10.setText("+16");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,16-17,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("9.9");
                binding.static2.setText("16.9");
                binding.static3.setText("11:10");
                binding.static4.setText("18:35");
                binding.static5.setText("17:35");
                binding.static6.setText("14");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("12");
                binding.static10.setText("+9");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "W,16-17,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("10.7");
                binding.static2.setText("17.9");
                binding.static3.setText("12:25");
                binding.static4.setText("20:30");
                binding.static5.setText("19:25");
                binding.static6.setText("10");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("8");
                binding.static10.setText("+7");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;












            case "M,18-19,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");

                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");



                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("7,9");
                binding.static2.setText("13,2");
                binding.static3.setText("12:20");
                binding.static4.setText("23:30");
                binding.static5.setText("23:00");
                binding.static6.setText("15");
                binding.static7.setText("35");
                binding.static8.setText("43");
                binding.static10.setText("+13");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,18-19,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");

                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");



                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("8,4");
                binding.static2.setText("14,1");
                binding.static3.setText("14:10");
                binding.static4.setText("25:40");
                binding.static5.setText("25:00");
                binding.static6.setText("12");
                binding.static7.setText("19");
                binding.static8.setText("32");
                binding.static10.setText("+8");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,18-19,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");

                binding.normative7.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");



                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("8,9");
                binding.static2.setText("14,8");
                binding.static3.setText("15:20");
                binding.static4.setText("28:00");
                binding.static5.setText("27:00");
                binding.static6.setText("8");
                binding.static7.setText("14");
                binding.static8.setText("25");
                binding.static10.setText("+6");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,18-19,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText("3 Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9.2");
                binding.static2.setText("15.8");
                binding.static3.setText("9:40");
                binding.static4.setText("16:40");
                binding.static5.setText("16:10");
                binding.static6.setText("20");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("17");
                binding.static10.setText("+16");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,18-19,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("9.9");
                binding.static2.setText("16.9");
                binding.static3.setText("11:05");
                binding.static4.setText("18:40");
                binding.static5.setText("17:40");
                binding.static6.setText("14");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("12");
                binding.static10.setText("+9");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,18-19,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)");

                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");
                binding.normative10.setText(" Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);


                binding.static1.setText("10.7");
                binding.static2.setText("17.9");
                binding.static3.setText("12:20");
                binding.static4.setText("20:30");
                binding.static5.setText("19:20");
                binding.static6.setText("10");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("8");
                binding.static10.setText("+7");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,20-24,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative8.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("8,0");
                binding.static2.setText("13,9");
                binding.static3.setText("12:00");
                binding.static4.setText("21:35");
                binding.static5.setText("21:30");
                binding.static6.setText("16");
                binding.static7.setText("45");
                binding.static8.setText("44");
                binding.static10.setText("+13");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,20-24,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative8.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("8,5");
                binding.static2.setText("14,4");
                binding.static3.setText("13:20");
                binding.static4.setText("25:00");
                binding.static5.setText("24:30");
                binding.static6.setText("13");
                binding.static7.setText("33");
                binding.static8.setText("26");
                binding.static10.setText("+8");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;


            case "M,20-24,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative8.setText(" Рывок гири 16 кг\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9,1");
                binding.static2.setText("15,8");
                binding.static3.setText("14:50");
                binding.static4.setText("27:30");
                binding.static5.setText("26:30");
                binding.static6.setText("9");
                binding.static7.setText("27");
                binding.static8.setText("20");
                binding.static10.setText("+6");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,20-24,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative5.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative6.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative7.setText(" Подтягивание из виса на\n" +
                        "низкой перекладине\n" +
                        "(количество раз)");


                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9,5");
                binding.static2.setText("16,2");
                binding.static3.setText("4:00");
                binding.static4.setText("10:40");
                binding.static5.setText("17:50");
                binding.static6.setText("17:10");
                binding.static7.setText("19");
                binding.static8.setText("18");
                binding.static10.setText("+16");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;



            case "W,20-24,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative5.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative6.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative7.setText(" Подтягивание из виса на\n" +
                        "низкой перекладине\n" +
                        "(количество раз)");


                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("10,3");
                binding.static2.setText("17,1");
                binding.static3.setText("4:15");
                binding.static4.setText("12:10");
                binding.static5.setText("19:20");
                binding.static6.setText("18:10");
                binding.static7.setText("13");
                binding.static8.setText("13");
                binding.static10.setText("+11");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;



            case "W,20-24,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative5.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative6.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative7.setText(" Подтягивание из виса на\n" +
                        "низкой перекладине\n" +
                        "(количество раз)");


                binding.normative8.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("11,1");
                binding.static2.setText("18,1");
                binding.static3.setText("4:35");
                binding.static4.setText("13:25");
                binding.static5.setText("21:30");
                binding.static6.setText("19:35");
                binding.static7.setText("9");
                binding.static8.setText("9");
                binding.static10.setText("+8");



                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,25-29,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative8.setText("Рывок гири\n" +
                        "16 кг (количество раз)");

                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("8,1");
                binding.static2.setText("13,6");
                binding.static3.setText("12:30");
                binding.static4.setText("22:00");
                binding.static5.setText("22:00");
                binding.static6.setText("14");
                binding.static7.setText("40");
                binding.static8.setText("41");
                binding.static10.setText("+12");




                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,25-29,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative8.setText("Рывок гири\n" +
                        "16 кг (количество раз)");

                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9,0");
                binding.static2.setText("14,6");
                binding.static3.setText("14:20");
                binding.static4.setText("26:00");
                binding.static5.setText("25:30");
                binding.static6.setText("10");
                binding.static7.setText("25");
                binding.static8.setText("24");
                binding.static10.setText("+7");




                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "M,25-29,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");

                binding.normative3.setText(" Бег на 3000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "5 км (мин, с)");

                binding.normative5.setText(" Кросс на 5 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса на\n" +
                        "высокой перекладине\n" +
                        "(количество раз)");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");





                binding.normative8.setText("Рывок гири\n" +
                        "16 кг (количество раз)");

                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");
                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9,6");
                binding.static2.setText("15,3");
                binding.static3.setText("15:20");
                binding.static4.setText("28:00");
                binding.static5.setText("27:00");
                binding.static6.setText("6");
                binding.static7.setText("21");
                binding.static8.setText("18");
                binding.static10.setText("+5");




                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,25-29,G":
                binding.nameNormative.setText("НОРМАТИВЫ НА ЗОЛОТО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative5.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative6.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");
                binding.normative7.setVisibility(View.GONE);
                binding.normative8.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)\n");


                binding.normative10.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");


                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("9,8");
                binding.static2.setText("16,7");
                binding.static3.setText("4:20");
                binding.static4.setText("11:15");
                binding.static5.setText("18:10");
                binding.static6.setText("17:40");
                binding.static7.setVisibility(View.GONE);
                binding.static8.setText("18");
                binding.static10.setText("17");
                binding.static10.setText("+14");


                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,25-29,S":
                binding.nameNormative.setText("НОРМАТИВЫ НА СЕРЕБРО");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)\n");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("10,5");
                binding.static2.setText("17,9");
                binding.static3.setText("4:40");
                binding.static4.setText("12:50");
                binding.static5.setText("20:20");
                binding.static6.setText("19:50");
                binding.static7.setText("12");
                binding.static8.setText("12");
                binding.static10.setText("+9");

                
                binding.static11.setVisibility(View.GONE);
                binding.static12.setVisibility(View.GONE);
                binding.static13.setVisibility(View.GONE);
                break;

            case "W,25-29,C":
                binding.nameNormative.setText("НОРМАТИВЫ НА БРОНЗУ");

                //======================================================================== Название нормативов
                binding.normative1.setText(" Бег 60м (с)");
                binding.normative2.setText(" Бег на 100 м (с)");
                binding.normative3.setText(" Бег на 1000 м\n" +
                        "(мин, с)");
                binding.normative3.setText(" Бег на 2000 м\n" +
                        "(мин, с)");
                binding.normative4.setText(" Бег на лыжах на\n" +
                        "3 км (мин, с)");

                binding.normative5.setText(" Кросс на 3 км (бег по\n" +
                        "пересеченной местности)\n" +
                        "(мин, с)");

                binding.normative6.setText(" Подтягивание из виса\n" +
                        "лежа на низкой\n" +
                        "перекладине 90 см\n" +
                        "(количество раз)\n");


                binding.normative7.setText(" Сгибание и разгибание\n" +
                        "рук в упоре лежа на полу\n" +
                        "(количество раз)");


                binding.normative10.setText("Наклон вперед из\n" +
                        "положения стоя на\n" +
                        "гимнастической скамье\n" +
                        "(от уровня скамьи – см)");

                
                binding.normative11.setVisibility(View.GONE);
                binding.normative12.setVisibility(View.GONE);
                binding.normative13.setVisibility(View.GONE);



                binding.static1.setText("11,4");
                binding.static2.setText("19,1");
                binding.static3.setText("5:10");
                binding.static4.setText("14:20");
                binding.static5.setText("23:00");
                binding.static6.setText("22:30");
                binding.static7.setText("8");
                binding.static8.setText("8");
                binding.static10.setText("+7");

                
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
        binding.dopNorm.setOnClickListener(view -> {
            Intent next = new Intent();
            next.setClass(StatisticActivity.this, DopstatisticActivity.class);
            startActivity(next);
        });
    }
}





















