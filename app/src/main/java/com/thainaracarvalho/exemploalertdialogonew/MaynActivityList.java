package com.thainaracarvalho.exemploalertdialogonew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaynActivityList extends AppCompatActivity {
    private Button buttonHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHello = findViewById(R.id.btnHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
    }

    private void open() {
        MayDialogoFragmentList my = new MayDialogoFragmentList();
        my.show(getSupportFragmentManager(),"lista");
    }
}