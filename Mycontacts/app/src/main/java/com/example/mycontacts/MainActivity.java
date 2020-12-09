package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements ContactAdapter.onItemClickListener {
    FloatingActionButton fab;
    RecyclerView recyclerView;
    ContactAdapter adapter;

     Contacts[] contacts= new Contacts[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, AddContactActivity.class);
                startActivity(intent);
            }
        });



        setContactsArray();


         initRecyclerView();
        }

    private void setContactsArray() {
        contacts[0]=new Contacts(1,"Kora","avatar");
        contacts[1]=new Contacts(2,"Anna","avatar");
        contacts[2]=new Contacts(3,"Tom","avatar");
        contacts[3]=new Contacts(4,"Juddy","Hops");
        contacts[4]=new Contacts(5,"Jerry","avatar");
        contacts[5]=new Contacts(6,"Elza","avatar");
        contacts[6]=new Contacts(7,"Bart","Simpson");
        contacts[7]=new Contacts(8,"Liza","Simpson");
        contacts[8]=new Contacts(9,"Anng","avatar");
        contacts[9]=new Contacts(10,"Kora","avatar");
        contacts[10]=new Contacts(11,"Kora","avatar");
        contacts[11]=new Contacts(12,"Kora","avatar");

    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        DividerItemDecoration itemDecoration=new DividerItemDecoration(this,linearLayoutManager.getOrientation());
        adapter=new ContactAdapter(contacts,this );
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void onItemCick(int position) {
        Intent intent=new Intent(MainActivity.this, InformationActivity.class);
        startActivity(intent);
    }
}
