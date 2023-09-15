package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MenuPrincipalActivity extends AppCompatActivity {
    MaterialCardView cardAeroModelos, cardGaleria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
        cardAeroModelos = findViewById(R.id.cardAeroModelos);
        cardGaleria = findViewById(R.id.cardGaleria);
        cardAeroModelos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPrincipalActivity.this,LoginActivity.class));            }
        });
        cardGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei em galeria",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}