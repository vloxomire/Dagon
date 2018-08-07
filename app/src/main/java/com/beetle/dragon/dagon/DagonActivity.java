package com.beetle.dragon.dagon;

import android.app.Activity;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class DagonActivity extends Activity {
    //Definimos variables en java donde almacenamos las referencias a los objetos definidos en los
    // archivos xml
    EditText eText1, eText2;
    Button button;
    TextView tView;
    ListenerResta listenerResta; //variable del listenerResta declarada en memoria

    //Genero los get de los editText. Me permiten obtener al valor de los EditText
    public EditText geteText1() {
        return eText1;
    }
    public EditText geteText2() {
        return eText2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {//En el método onCreate se enlazan las
        // variables con los objetos definidos en el archivo XML.Se hace llamando al método findViewById.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dagon);//Ya tenemos almacenados en las variables,q hacen referencias
        // a los objetos que se crean al llamar al método:setContentView(R.layout.dagon);
        eText1 = findViewById(R.id.eText1);
        eText2 = findViewById(R.id.eText2);
        tView = findViewById(R.id.tView);

        listenerResta = new ListenerResta(this);
    }
    //(el método debe recibir como parámetro un objeto de la clase View)
public void metSumar(View vSumar){
    String valor1 = eText1.getText().toString();//Extraemos el texto de los dos controles de tipo
    String valor2 = eText2.getText().toString();// EditText y los almacenamos en dos variables
                                                // locales de tipo String.

    int num1 = Integer.parseInt(valor1);//Convertimos los String a tipo entero
    int num2 = Integer.parseInt(valor2);//Convertimos los String a tipo entero

    int suma = num1 + num2;

    String resultado = String.valueOf(suma);//convertir la suma a String

    tView.setText(resultado);//el resultado lo enviamos al TextView
}
}