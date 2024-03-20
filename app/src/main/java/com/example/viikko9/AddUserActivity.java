package com.example.viikko9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddUserActivity extends AppCompatActivity {
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rvUserView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        context = this;
    }

    public void addUser(View view){
        //Log.d("test", "addUser: 1");
        EditText tvfirstName = findViewById(R.id.editFirstName);
        EditText tvlastName = findViewById(R.id.editLastName);
        EditText tvemail = findViewById(R.id.editEmail);

        String firstName = String.valueOf(tvfirstName.getText());
        String lastName = String.valueOf(tvlastName.getText());
        String email = String.valueOf(tvemail.getText());

        RadioGroup degreeOption = findViewById(R.id.radioDegreeProgram);

        RadioButton choice = findViewById(degreeOption.getCheckedRadioButtonId());

        String degree = String.valueOf(choice.getText());
        Log.d("test", firstName);
        Log.d("test", lastName);
        Log.d("test", email);
        Log.d("test", degree);
        UserStorage.getInstance().addUser(context, new User(firstName, lastName, email, degree));
        Log.d("test", String.valueOf(UserStorage.getInstance().getUsers().size()));


    }


}