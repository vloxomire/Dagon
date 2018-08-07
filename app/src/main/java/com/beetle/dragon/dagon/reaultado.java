package com.beetle.dragon.dagon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class reaultado extends AppCompatActivity {
    EditText eText3;
    Button bVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaultado);

        eText3 = findViewById(R.id.eText3);
        bVolver = findViewById(R.id.bVolver);


    }
}
