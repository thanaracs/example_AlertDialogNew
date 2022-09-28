package com.thainaracarvalho.exemploalertdialogonew;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

public class MayDialogoFragmentList extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder =
                    new AlertDialog.Builder(getActivity());
        builder.setTitle("escolha um dia da semana")
//                .setItems(R.array.array_semana, new DialogInterface.OnClickListener() {  //apresenta a lista sem os radius
                .setSingleChoiceItems(R.array.array_semana, 0, new DialogInterface.OnClickListener() {
                   @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Resources resources = getResources(); //pegando a posição do array para apresentar na tela
                        Toast.makeText(getActivity(), "Você clicou em: "+ resources.getStringArray(R.array.array_semana)[i], Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }//oncreate



}//close