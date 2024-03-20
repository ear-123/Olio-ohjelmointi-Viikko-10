package com.example.viikko9;


import android.view.View;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView textFirstName, textLastName, textEmail, textDegreeProgram;


    public UserViewHolder(@NonNull View itemview){
        super(itemview);
        textFirstName = itemview.findViewById(R.id.textFirstName);
        textLastName = itemview.findViewById(R.id.textLastName);
        textEmail = itemview.findViewById(R.id.textEmail);
        textDegreeProgram = itemview.findViewById(R.id.textDegreeProgram);
    }


}