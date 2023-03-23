package ca.qc.bdeb.demo06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    List<String> names;
    ListView listView;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        //source de données
        names = new ArrayList<String>();
        names.add("Test1");names.add("Test2");names.add("Test3");names.add("Test4");

        //initialiser le composant UI
        listView =findViewById(R.id.demo_listview);


        //initialiser un adapter
        adapter  =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);

    }

    public void AllerVersRecyclerView(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}