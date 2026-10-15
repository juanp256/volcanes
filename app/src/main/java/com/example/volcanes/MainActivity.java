package com.example.volcanes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Volcan> volcanes = new ArrayList<>();
        volcanes.add(new Volcan(
                "Nevado del Ruiz", "Caldas y Tolima", "5.321 m s. n. m.",
                "Volcán activo del Parque Nacional Natural Los Nevados. Su erupción de 1985 destruyó Armero y es una de las mayores tragedias volcánicas del siglo XX.",
                R.drawable.nevado_ruiz));
        volcanes.add(new Volcan(
                "Nevado del Huila", "Huila, Tolima y Cauca", "5.364 m s. n. m.",
                "La cumbre más alta de Colombia entre los volcanes. Tiene varios picos cubiertos de glaciar y está en la Cordillera Central.",
                R.drawable.nevado_huila));
        volcanes.add(new Volcan(
                "Galeras", "Nariño", "4.276 m s. n. m.",
                "Uno de los volcanes más activos del país. Se alza junto a la ciudad de Pasto y se vigila de forma permanente.",
                R.drawable.galeras));
        volcanes.add(new Volcan(
                "Puracé", "Cauca", "4.650 m s. n. m.",
                "Volcán activo cerca de Popayán. En su entorno hay aguas termales, páramo y el hábitat del cóndor andino.",
                R.drawable.purace));
        volcanes.add(new Volcan(
                "Cumbal", "Nariño", "4.764 m s. n. m.",
                "Volcán en la frontera con Ecuador, con dos cráteres y fumarolas. Es un complejo volcánico de gran tamaño.",
                R.drawable.cumbal));
        volcanes.add(new Volcan(
                "Azufral", "Nariño", "4.070 m s. n. m.",
                "En su cráter hay una laguna de color verde esmeralda. Su nombre viene del azufre que se encuentra en la zona.",
                R.drawable.azufral));

        ViewPager2 pager = findViewById(R.id.pager);
        TextView contador = findViewById(R.id.tvContador);

        pager.setAdapter(new VolcanAdapter(volcanes));
        contador.setText("1 / " + volcanes.size());

        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                contador.setText((position + 1) + " / " + volcanes.size());
            }
        });
    }
}
