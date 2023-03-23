package ca.qc.bdeb.demo06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import ca.qc.bdeb.demo06.adapter.FilmsAdapter;

public class RecyclerViewActivity extends AppCompatActivity {

    List<Film> films;
    FilmsAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.demo_recyclerview_films);

        //la source de données
        films = new ArrayList<>();
        films.add(new Film(1, "Avengers", 2013));
        films.add(new Film(2, "Men in black", 2011));
        films.add(new Film(3, "titanic", 1998));
        films.add(new Film(4, "Avengers 2", 2015));

        //
        adapter = new FilmsAdapter(films);

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }

    public void AjouterNouveauFilm(View view) {
        int newID = films.size() + 1;
        films.add(new Film(newID, "Fast and Farious " + newID, 2015));
        //notifier le recyclerView du changement dans la source de données
        adapter.notifyDataSetChanged();
    }
}