package com.example.android.taller_claselist;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class crear_celular extends AppCompatActivity {

    private Spinner   Spinersistema;
    private Spinner   SpinerMarca;
    private EditText cajaPrecio,cajaCapacidad;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular2);
        cajaPrecio=(EditText) findViewById(R.id.txtPrecio);
        cajaCapacidad=(EditText) findViewById(R.id.txtCapacidad);
        SpinerMarca=(Spinner) findViewById(R.id.Marca);
        Spinersistema=(Spinner) findViewById(R.id.sistema);
        res=this.getResources();

    }

    public void guardar(View v){

        String  precio,Marca,capacidad,sistema);
        precio=cajaPrecio.getText().toString().trim();
        capacidad=cajaCapacidad.getText().toString().trim();
        Marca=(SpinerMarca.getSelectedItem().toString().trim());

        Celular p = new Celular(precio,capacidad,Marca,sistema);
        p.guardar;
        Toast.makeText(this,res.getString(R.string.confirmacion), Toast.LENGTH_SHORT).show();

    }
}
