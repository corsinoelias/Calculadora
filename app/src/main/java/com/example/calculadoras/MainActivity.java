package com.example.calculadoras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt1,edt2;
    TextView tev;
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    public void calcular(View view) {
        edt1=findViewById(R.id.base);
        edt2=findViewById(R.id.altura);
        tev=findViewById(R.id.area);
        double num1=Double.parseDouble(edt1.getText().toString());
        double num2=Double.parseDouble(edt2.getText().toString());
        DecimalFormat df = new DecimalFormat("#.000");
        double resultado= (num1*num2)/2;
        tev.setText("\t  \uD83D\uDD3C = "+df.format(resultado));
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button2){
            Intent intent = new Intent(this,Calcu2.class);
            startActivity(intent);
        }
    }
}
