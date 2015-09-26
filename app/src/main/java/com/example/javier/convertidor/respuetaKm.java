package com.example.javier.convertidor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class respuetaKm extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reskm);
        Bundle km = this.getIntent().getExtras();
        double r =km.getDouble("km");

        TextView tvMensaje = (TextView)findViewById(R.id.rekm);
        tvMensaje.setText(r + " Millas ");
    }

}
