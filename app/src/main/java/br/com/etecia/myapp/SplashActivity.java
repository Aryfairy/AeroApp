package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    //Declarar uma variável global do tipo objeto no layout no usages
    ImageView imgLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        imgLogo = findViewById(R.id.imgLogo);

        //criando  evento de click na imagem
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this,LoginActivity.class));
            }
        });
    }
}