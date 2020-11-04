package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.b1);
        editText = findViewById(R.id.nom);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String nom = editText.getText().toString();


        Intent intent = new Intent(this,Activity_2.class);
        intent.putExtra("nom",nom);
        startActivity(intent);
    }
}