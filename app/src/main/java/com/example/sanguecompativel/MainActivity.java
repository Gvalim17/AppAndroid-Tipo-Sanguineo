package com.example.sanguecompativel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionButton(View v) {
        EditText etT = findViewById(R.id.idT);
        TextView etR = findViewById(R.id.idR);

        String trat = etT.getText().toString().toUpperCase();

        String resposta = new Sangue().busca(trat);
        etR.setText(resposta);
    }
}