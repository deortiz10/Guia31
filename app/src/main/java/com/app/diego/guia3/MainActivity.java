package com.app.diego.guia3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList platos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview= (ListView) findViewById(R.id.platos_listview);
        platos= new ArrayList();
        platos.add("hamburguesa");
        platos.add("pizza");
        platos.add("perro");
        platos.add("gaseosa");

        ArrayAdapter<String> itemsAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, platos);
        listview.setAdapter(itemsAdapter);
    }
}
