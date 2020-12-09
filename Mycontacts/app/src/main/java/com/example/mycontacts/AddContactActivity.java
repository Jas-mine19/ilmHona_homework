package com.example.mycontacts;

import android.os.Bundle;
import android.os.PersistableBundle;


import androidx.appcompat.app.AppCompatActivity;

public class AddContactActivity extends AppCompatActivity {
    @Override
    public void onCreate( Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_addcontact);
    }
}
