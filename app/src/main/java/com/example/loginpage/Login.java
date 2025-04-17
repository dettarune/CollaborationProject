package com.example.loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.collaborationproject.R;

public class Kalkulator extends AppCompatActivity {

    EditText edAngka1;
    EditText edAngka2;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiple;
    Button btnDivide;
    TextView txtResult;
    Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edAngka1 = (EditText) findViewById(R.id.edAngka1);
        edAngka2 = (EditText) findViewById(R.id.edAngka2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiple = (Button) findViewById(R.id.btnMultiple);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2= Integer.parseInt(edAngka2.getText().toString());

                int result =  angka1 + angka2;
                txtResult.setText("Hasil Penjumlahan dari " + angka1 + " + " + angka2 + " adalah : " + result );
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2= Integer.parseInt(edAngka2.getText().toString());

                int result =  angka1 - angka2;
                txtResult.setText("Hasil Pengurangan dari " + angka1 + " - " + angka2 + " adalah : " + result );
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2= Integer.parseInt(edAngka2.getText().toString());

                int result =  angka1 * angka2;
                txtResult.setText("Hasil Perkalian dari " + angka1 + " * " + angka2 + " adalah : " + result );
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2= Integer.parseInt(edAngka2.getText().toString());

                int result =  angka1 / angka2;
                txtResult.setText("Hasil Pembagian dari " + angka1 + " / " + angka2 + " adalah : " + result );
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edAngka1.setText("");
                edAngka2.setText("");
                txtResult.setText("Result : ");
                Toast.makeText(Kalkulator.this, "Form Clear", Toast.LENGTH_SHORT).show();
            }
        });



    }
}