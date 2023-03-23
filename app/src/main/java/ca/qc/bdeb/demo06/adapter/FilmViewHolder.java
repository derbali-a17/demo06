package ca.qc.bdeb.demo06.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ca.qc.bdeb.demo06.R;

public class FilmViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView lblTitre, lblAnnee;

    View container;

    public FilmViewHolder(@NonNull View itemView) {  //itemView représente la ligne XML
        super(itemView);
        imageView = itemView.findViewById(R.id.demo_image_film);
        lblTitre  = itemView.findViewById(R.id.demo_titre_film);
        lblAnnee = itemView.findViewById(R.id.demo_annee_film);
        container = itemView;
    }
}
