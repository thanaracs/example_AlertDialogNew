package com.thainaracarvalho.exemploalertdialogonew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHello = findViewById(R.id.btnHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogPersolanizado();
            }
        });
    }

    private void openAlertDialog() {
        MyDialogoFragment myDialogFragment = new MyDialogoFragment();
        myDialogFragment.show(getSupportFragmentManager(), "clima");
    }

    private void openDialogPersolanizado() {
        MyDialogFragmentPersonalizado myDialogFragment = new MyDialogFragmentPersonalizado();
        myDialogFragment.show(getSupportFragmentManager(), "clima");
    }
}