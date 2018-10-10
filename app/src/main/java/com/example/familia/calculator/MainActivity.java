package com.example.familia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button suma, resta, multi, divi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        suma = findViewById(R.id.Sumar);
        resta = findViewById(R.id.Restar);
        multi = findViewById(R.id.Multiplicar);
        divi = findViewById(R.id.Dividir);

        resultado = findViewById(R.id.resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 =  num1.getText().toString();
        String n2 = num2.getText().toString();

        int entero1 = Integer.parseInt(n1);
        int entero2 = Integer.parseInt(n2);

        int result = 0;

        switch(v.getId()){

            case R.id.Sumar:
                result = entero1 + entero2;
                break;
            case R.id.Restar:
                result = entero1 - entero2;
                break;
            case R.id.Multiplicar:
                result = entero1 * entero2;
                break;
            case R.id.Dividir:
                result = entero1 / entero2;
                break;

        }

    resultado.setText(""+ result);

    }
}
