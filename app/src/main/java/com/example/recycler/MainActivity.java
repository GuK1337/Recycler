package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        FruitAdapter adapter = new FruitAdapter(this, fruits);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

    }
    public void check(View view){
        TextView nameView = view.findViewById(R.id.name);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Выбран элемент - " + nameView.getText(), Toast.LENGTH_SHORT);
        toast.show();
    }

    private void setInitialData(){
        fruits.add(new Fruit ("Лимон", "Желтый весь", R.drawable.lemon));
        fruits.add(new Fruit ("Киви", "Зеленый внутри", R.drawable.kivi));
        fruits.add(new Fruit ("Яблоко", "Красный снаружи", R.drawable.apple));
        fruits.add(new Fruit ("Ананас", "Желтый внутри", R.drawable.pineapple));

    }


}