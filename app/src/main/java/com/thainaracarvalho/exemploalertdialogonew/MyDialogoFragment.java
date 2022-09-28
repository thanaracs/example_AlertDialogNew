package com.thainaracarvalho.exemploalertdialogonew;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogoFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
            AlertDialog.Builder builder =
                    new AlertDialog.Builder(getActivity());
            builder.setTitle("Olá")
                    .setIcon(R.mipmap.ic_launcher)
                    .setMessage("Como está o clima hoje?")
                    .setPositiveButton("Quente pra carai", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getActivity(),
                                    "Beba muita agua!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("Frio", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getActivity(), "Coloque uma jaqueta", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNeutralButton("Ameno", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getActivity(), "Aproveite", Toast.LENGTH_SHORT).show();
                        }
                    });
        return builder.create();
    }
}


