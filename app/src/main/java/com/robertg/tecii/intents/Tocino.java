package com.robertg.tecii.intents;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class Tocino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tocino);

        Bundle InfoManzanas = getIntent().getExtras();
        if (InfoManzanas==null)
        {
            return;
        }

        String MensajeManzana = InfoManzanas.getString("MensajeManzana");

        final TextView txtTocino = (TextView) findViewById(R.id.txtTocino);
        txtTocino.setText(MensajeManzana);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });
    }

    public void onClick(View view){

        Intent i = new Intent(this, Manzana.class);
        startActivity(i);
    }
}
