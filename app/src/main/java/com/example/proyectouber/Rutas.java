package com.example.proyectouber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Rutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        Window w=getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView  recyclerView=findViewById(R.id.rv_lista);

        List<Items> mlist =new ArrayList<>();
        mlist.add(new Items(R.drawable.bus1,"Carlos Marcelo",R.drawable.photo,2500));
        mlist.add(new Items(R.drawable.bus3,"Carlos Marcelo",R.drawable.usertwo,2500));
        mlist.add(new Items(R.drawable.bus4,"Carlos Marcelo",R.drawable.uservoyager,2500));
        mlist.add(new Items(R.drawable.bus2,"Carlos Marcelo",R.drawable.photo,2500));
        mlist.add(new Items(R.drawable.bus5,"Carlos Marcelo",R.drawable.usertwo,2500));
        mlist.add(new Items(R.drawable.bus6,"Carlos Miranda",R.drawable.uservoyager,2500));
        mlist.add(new Items(R.drawable.bus1,"Carlos Alvarez",R.drawable.uservoyager,2500));
        mlist.add(new Items(R.drawable.bus3,"Carlos Quipe",R.drawable.usertwo,2500));
        mlist.add(new Items(R.drawable.bus4,"Carlos Campos",R.drawable.photo,2500));
        mlist.add(new Items(R.drawable.bus2,"Pedro Meza",R.drawable.usertwo,2500));
        mlist.add(new Items(R.drawable.bus5,"Alfonzo Contreras",R.drawable.usertwo,2500));
        Adapter adapter =new Adapter(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
