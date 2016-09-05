package com.example.faustocheca.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    Button buttonNoMegusta;
    Button buttonHumor;
    Button buttonDimeAlgo;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        buttonNoMegusta = (Button) findViewById(R.id.button_NoMeGusta);
        textView = (TextView) findViewById(R.id.text_view);
        imageView = (ImageView) findViewById(R.id.image_view);
        buttonHumor = (Button) findViewById(R.id.button_humor);
        buttonDimeAlgo = (Button) findViewById(R.id.button_dimealgo);





        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = spinner.getSelectedItem().toString();
                Log.i("TAG >>>>  ",item);

                Accion accion = new Accion(view.getContext(),imageView);

                accion.traerfoto (item);
    }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }




        });

        buttonNoMegusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Al hacer click selecciona otra foto
                // de un array de fotos de ese político

                String politico_seleccionado = spinner.getSelectedItem().toString();
                Log.i("POLITICO >>>>",  politico_seleccionado);

                Accion accion = new Accion(v.getContext(),imageView);

                accion.cambiarDeFoto(politico_seleccionado);






            }
        });




    }



    }






