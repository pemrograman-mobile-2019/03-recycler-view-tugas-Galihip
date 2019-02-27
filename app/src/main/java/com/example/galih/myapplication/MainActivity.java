package com.example.galih.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.galih.myapplication.adapter.ContactsAdapter;
import com.example.galih.myapplication.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rvContacts);
        contacts = Contact.createContactsList(10);
        ContactsAdapter contactsAdapter= new ContactsAdapter(contacts);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager( this);
        rv.setAdapter(contactsAdapter);
        rv.setLayoutManager(layoutManager);



    }
}
