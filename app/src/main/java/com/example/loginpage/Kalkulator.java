package com.example.loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
// EdgeToEdge di-disable dulu kalau belum pakai Activity 1.6.0 ke atas
// import androidx.activity.EdgeToEdge;

import com.example.loginpage.R; // Pastikan pakai ini, bukan com.example.collaborationproject

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
        setContentView(R.layout.activity_main);

        edAngka1 = findViewById(R.id.edAngka1);
        edAngka2 = findViewById(R.id.edAngka2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivide = findViewById(R.id.btnDivide);
        txtResult = findViewById(R.id.txtResult);
        btnClear = findViewById(R.id.btnClear);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isInputValid()) return;

                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());

                int result = angka1 + angka2;
                txtResult.setText("Hasil Penjumlahan dari " + angka1 + " + " + angka2 + " adalah : " + result);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isInputValid()) return;

                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());

                int result = angka1 - angka2;
                txtResult.setText("Hasil Pengurangan dari " + angka1 + " - " + angka2 + " adalah : " + result);
            }
        });

        btnMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isInputValid()) return;

                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());

                int result = angka1 * angka2;
                txtResult.setText("Hasil Perkalian dari " + angka1 + " * " + angka2 + " adalah : " + result);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isInputValid()) return;

                int angka1 = Integer.parseInt(edAngka1.getText().toString());
                int angka2 = Integer.parseInt(edAngka2.getText().toString());

                if (angka2 == 0) {
                    Toast.makeText(Kalkulator.this, "Tidak bisa dibagi dengan 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                int result = angka1 / angka2;
                txtResult.setText("Hasil Pembagian dari " + angka1 + " / " + angka2 + " adalah : " + result);
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

    private boolean isInputValid() {
        String angka1 = edAngka1.getText().toString();
        String angka2 = edAngka2.getText().toString();

        if (angka1.isEmpty() || angka2.isEmpty()) {
            Toast.makeText(Kalkulator.this, "Harap isi kedua angka terlebih dahulu!", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}

//
 //
