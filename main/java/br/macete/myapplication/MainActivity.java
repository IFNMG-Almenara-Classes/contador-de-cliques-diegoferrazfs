package br.macete.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int conte = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contador(View view){
        conte++;
        TextView contar = findViewById(R.id.cont);
        contar.setText(" " + conte);
    }

    public void reduzirContador(View view){
        conte--;
        TextView reduzir = findViewById(R.id.cont);
        reduzir.setText(" " + conte);

    }

    public void resetar(View view){
        conte = 0;
        TextView reset = findViewById(R.id.cont);
        reset.setText(" " + conte);
    }


}