package com.example.javier.convertidor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Javier on 26/09/2015.
 */
public class respuestaGrados extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resgra);
        Bundle grado = this.getIntent().getExtras();
        double resgr =grado.getDouble("grado");

        TextView tvMensaje = (TextView)findViewById(R.id.resg);
        tvMensaje.setText(resgr + " °F ");
    }
}
