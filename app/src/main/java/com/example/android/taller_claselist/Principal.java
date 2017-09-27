package com.example.android.taller_claselist;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

public class Principal extends AppCompatActivity {
    private ListView lv;
    private Resources res;
    private String op[];
    private Intent i;
    private Resources resources;
    private Spinner color;
    private Spinner marca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        resources = this.getResources();
        lv=(ListView)findViewById(R.id.listView);
        res=this.getResources();
        op=res.getStringArray(R.array.Listar);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,op);
        lv.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, (List<String>) color);
        color.setAdapter(adapter1);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i = new Intent(Principal.this,crear_celular.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Principal.this,listar_celular.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

