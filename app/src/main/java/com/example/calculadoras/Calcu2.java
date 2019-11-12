package com.example.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Calcu2 extends AppCompatActivity {

    Button btn;
    EditText edt;
    TextView tev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu2);
        btn= findViewById(R.id.calcular);
        edt=findViewById(R.id.radio);
        tev=findViewById(R.id.resultado);
    }

    public void calcular(View view) {
        Double radio = Double.parseDouble(edt.getText().toString());
        Double perimetro= 2*radio*Math.PI;
        DecimalFormat df = new DecimalFormat("#.0000");
        tev.setText("\uD83D\uDD34 = "+df.format(perimetro));
    }
}
