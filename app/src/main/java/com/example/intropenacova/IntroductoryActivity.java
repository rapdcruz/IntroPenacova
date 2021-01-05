package com.example.intropenacova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;



public class IntroductoryActivity extends AppCompatActivity {

    //Declarar variáveis
    ImageView logo, splashImg;
    TextView NomeApp;
    Animation fade_in_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        //Declarar ids
        logo= findViewById(R.id.logo);
        splashImg= findViewById(R.id.img);
        NomeApp = findViewById(R.id.txtAppNome);

        //logo.animate().alpha(0).setDuration(800);
        splashImg.animate().translationY(-3000).setDuration(700).setStartDelay(3000);
        logo.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        NomeApp.animate().translationY(2000).setDuration(1000).setStartDelay(3000);
        logo.animate().alpha(0).setDuration(800);
        NomeApp.animate().alpha(0).setDuration(800);

        //FADE IN, LOGO E TEXTO
        fade_in_anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        NomeApp.startAnimation(fade_in_anim);
        logo.startAnimation(fade_in_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            //ir para a pagina inicial
            public void run() {
                irparaalgumlado();
                finish();
            }
        }, 3500);
    }



    //------------------ir para a pagina inicial ---------------------//
    private void irparaalgumlado() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
  }
    //----------------------------------------------------------------//


}

