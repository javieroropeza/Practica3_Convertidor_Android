package com.example.javier.convertidor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private View.OnClickListener ckListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            operacion();
        }
    };
    private View.OnClickListener pkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            OpGrados();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button) findViewById(R.id.btnKm);
        boton.setOnClickListener(ckListener);
        Button botonC = (Button)findViewById(R.id.btnCel);
        botonC.setOnClickListener(pkListener);
    }

    private void operacion(){
        EditText inKm = (EditText)findViewById(R.id.etkm);
        int obKm = Integer.parseInt(inKm.getText().toString());
        double millas =  1.6;
        double res = obKm /millas;

        Intent mi = new Intent(this, respuetaKm.class);
        mi.putExtra("km", res );
        startActivity(mi);
      /*  TextView tvMensaje = (TextView)findViewById(R.id.tvrespuesta);
        tvMensaje.setText(resKm + " Millas ");*/
    }

    private void OpGrados(){
        EditText etKm = (EditText)findViewById(R.id.etCel);

        int obgra = Integer.parseInt(etKm.getText().toString());
        double farenheit= 1.8;
        double resGr = obgra*farenheit+32;

        Intent gra = new Intent(this, respuestaGrados.class);
        gra.putExtra("grado", resGr );
        startActivity(gra);

        /*TextView tvMensaje = (TextView)findViewById(R.id.tvCel);
        tvMensaje.setText(resGr + " °F " );*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
