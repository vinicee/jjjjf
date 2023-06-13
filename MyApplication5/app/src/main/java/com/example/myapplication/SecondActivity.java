package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();


        RecyclerView recyclerView = findViewById(R.id.list_animal);

        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        recyclerView.setAdapter(adapter);
    }


    private void setInitialData() {
        animals.add( new Animal("Рысь", "Род хищных млекопитающих семейства кошачьих, наиболее близкий к роду кошек",
                R.drawable.lynx, "Численность средняя"));
        animals.add( new Animal("Бобр", "Полуводное млекопитающее отряда грызунов",
                R.drawable.beaver, "Численность большая"));
        animals.add( new Animal("Медведь", "Семейство млекопитающих отряда хищных. Отличаются от других представителей псообразных более коренастым телосложениемв",
                R.drawable.bear, "Численность большая"));
        animals.add( new Animal("Волк", "Вид хищных млекопитающих из семейства псовых",
                R.drawable.wolf, "Численность большая"));
        animals.add( new Animal("Сова", "Хищная птица семейства совиных с мягким рыхлым оперением, обеспечивающим бесшумность полёта, с продолговатым крючковатым клювом и круглой головой, на которой оперение вокруг больших глаз образует так называемый «лицевой» диск, ведущая сумеречный образ жизни",
                R.drawable.owl, "Численность большая"));
    }
}