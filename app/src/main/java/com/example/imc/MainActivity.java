package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcula(View v){

        TextView resultadoTxt = (TextView)findViewById(R.id.resultadoTxt);
        EditText pesoTxt = (EditText) findViewById(R.id.pesoTxt);
        EditText alturaTxt = (EditText) findViewById(R.id.alturaTxt);

        int peso = Integer.parseInt(pesoTxt.getText().toString());
        float altura = Float.parseFloat(alturaTxt.getText().toString());

        float resultado = peso / (altura * altura);
//        resultadoTxt.setText(String.valueOf(resultado));

        if(resultado < 19){
            //abaixo
            resultadoTxt.setText("Abaixo do peso!");
        }
        else if(resultado > 32){
            //obeso
            resultadoTxt.setText("Acima do peso!");
        }
        else{
            //ok
            resultadoTxt.setText("Peso ideal!");
        }

    }
}