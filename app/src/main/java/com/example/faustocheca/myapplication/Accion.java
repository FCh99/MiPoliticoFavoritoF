package com.example.faustocheca.myapplication;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by faustocheca on 5/6/16.
 */
public class Accion {


    Context context;
    ImageView imageView;

    public Accion(Context context, ImageView imageView) {
        this.context = context;
        this.imageView = imageView;
    }

    public void traerfoto(String politico_elegido) {


        switch (politico_elegido){

            case "Mariano Rajoy": imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.rajoy));
                break;

            case "Pablo Iglesias": imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.pablo_iglesias));
                break;

            case "Pedro Sánchez": imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.pedro_sanchez));
                break;

            case  "Albert Rivera": imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.albert_rivera));
                break;


        }





    }


    public void cambiarDeFoto (String politico_enSpinner){


        if (politico_enSpinner == "Mariano Rajoy"){

            imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.mariano2));
        }else {

            imageView.setImageDrawable(context.getResources().getDrawable(R.drawable.pablo2));

        }


    }




    }
