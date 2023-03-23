package ca.qc.bdeb.demo06.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ca.qc.bdeb.demo06.Film;
import ca.qc.bdeb.demo06.R;

public class FilmsAdapter extends RecyclerView.Adapter<FilmViewHolder> {

    //la source de données;
    List<Film> films;

    public FilmsAdapter(List<Film> films) {
        this.films = films;
    }

    @NonNull
    @Override
    public FilmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.ligne_film, parent, false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmViewHolder holder, int position) {
            holder.lblTitre.setText(films.get(position).getTitre());
            holder.lblAnnee.setText("" + films.get(position).getAnneeRealisation());
            String filmEnMAJ = films.get(position).getTitre().toUpperCase();
            holder.container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    holder.lblTitre.setText(filmEnMAJ);
                }
            });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }
}
