package com.example.quandopassa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView dayRec;
    private TextView dayRej;
    private Spinner selectNeighborhood;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayRec = findViewById(R.id.dayRec);
        dayRej = findViewById(R.id.dayRej);
        selectNeighborhood = findViewById(R.id.selectNeighborhood);
        button = findViewById(R.id.button);

        Map<String, String> reciclavel = new HashMap<>();
        reciclavel.put("Besenello", "quarta-feira");
        reciclavel.put("Cascata", "quarta-feira");
        reciclavel.put("Centro", "quarta-feira");
        reciclavel.put("Claraiba", "quarta-feira");
        reciclavel.put("Espraiado", "quarta-feira");
        reciclavel.put("Frederico", "quinta-feira");
        reciclavel.put("Indaiá", "quarta-feira");
        reciclavel.put("João Bayer Sobrinho", "quinta-feira");
        reciclavel.put("Mato Queimado", "sexta-feira");
        reciclavel.put("Morro da Onça", "quarta-feira");
        reciclavel.put("Ponta Fina Sul", "sexta-feira");
        reciclavel.put("Salto", "quinta-feira");
        reciclavel.put("Santo Antonin", "quarta-feira");
        reciclavel.put("Trinta Réis", "quinta-feira");
        reciclavel.put("Velha", "terca-feira");
        reciclavel.put("Velha de Dentro", "terca-feira");
        reciclavel.put("Vasca", "quinta-feira");
        reciclavel.put("Vígolo", "quinta-feira");

        Map<String, String> rejeito = new HashMap<>();
        rejeito.put("Besenello", "segunda-feira");
        rejeito.put("Cascata", "segunda-feira");
        rejeito.put("Centro", "segunda-feira");
        rejeito.put("Claraiba", "quinta-feira");
        rejeito.put("Espraiado", "quinta-feira");
        rejeito.put("Frederico", "sexta-feira");
        rejeito.put("Indaiá", "quinta-feira");
        rejeito.put("João Bayer Sobrinho", "terca-feira");
        rejeito.put("Mato Queimado", "segunda-feira");
        rejeito.put("Morro da Onça", "quinta-feira");
        rejeito.put("Ponta Fina Sul", "terca-feira");
        rejeito.put("Salto", "terca-feira");
        rejeito.put("Santo Antonin", "segunda-feira");
        rejeito.put("Trinta Réis", "quinta-feira");
        rejeito.put("Velha", "terca-feira");
        rejeito.put("Velha de Dentro", "terca-feira");
        rejeito.put("Vasca", "terca-feira");
        rejeito.put("Vígolo", "segunda-feira");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected = selectNeighborhood.getSelectedItem().toString();

                dayRec.setText(reciclavel.get(selected));
                dayRej.setText(rejeito.get(selected));
            }
        });
    }
}
