package com.beetle.dragon.dagon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class DagonActivity extends Activity {
    //Definimos variables en java donde almacenamos las referencias a los objetos definidos en los archivos xml
    EditText eText1, eText2;
    Button button; //el unico nombre de variable q toma los tipo Button son button?
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagon);
    }
}
