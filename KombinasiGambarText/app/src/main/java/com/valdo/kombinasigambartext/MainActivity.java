package com.valdo.kombinasigambartext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.valdo.kombinasigambartext.Models.WayangFigure;
import com.valdo.kombinasigambartext.adapters.WayangFigureAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvWayang;
    List<WayangFigure> listWayangFigure = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvWayang = findViewById(R.id.rvWayang);
        WayangFigure wayangan = new WayangFigure("Kresno", R.drawable.kresna);
        WayangFigure abimayu = new WayangFigure("Abimayu", R.drawable.abimanyu);
        WayangFigure anoman = new WayangFigure("Anoman", R.drawable.anoman);
        WayangFigure bimasena = new WayangFigure("Bimasena", R.drawable.bimasena1);
        WayangFigure brotoseno = new WayangFigure("Brotoseno", R.drawable.brotoseno);
        WayangFigure dewi_sukesi = new WayangFigure("Dewi Sukesi", R.drawable.dewi_sukesi);
        WayangFigure nakulo = new WayangFigure("Nakulo", R.drawable.nakula);
        WayangFigure pandawa = new WayangFigure("Pandawa", R.drawable.pandawa);
        WayangFigure petruk = new WayangFigure("Petruk", R.drawable.petruk);
        WayangFigure puntadewa = new WayangFigure("Puntadewa", R.drawable.puntadewa_2);
        WayangFigure punakawan = new WayangFigure("Punakawan", R.drawable.wayang_punakawan);
        WayangFigure werkudara = new WayangFigure("werkudara", R.drawable.werkudara);

        listWayangFigure.add(wayangan);
        listWayangFigure.add(abimayu);
        listWayangFigure.add(anoman);
        listWayangFigure.add(bimasena);
        listWayangFigure.add(brotoseno);
        listWayangFigure.add(dewi_sukesi);
        listWayangFigure.add(nakulo);
        listWayangFigure.add(pandawa);
        listWayangFigure.add(petruk);
        listWayangFigure.add(punakawan);
        listWayangFigure.add(puntadewa);
        listWayangFigure.add(werkudara);
        WayangFigureAdapter wayangFigureAdapter = new WayangFigureAdapter(listWayangFigure);
        //set adapter dan layputmanager
        rvWayang.setAdapter(wayangFigureAdapter);
        //instansiasi
        rvWayang.setLayoutManager(new LinearLayoutManager(this));

        // set a GridLayoutManager with default vertical orientation and 2 number of columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        rvWayang.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView


    }
}
