package id.febry.androidketiga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.rv_items);

        ArrayList<String> list = new ArrayList<>();

        list.add("Pertama");
        list.add("Kedua");
        list.add("Ketiga");
        list.add("Pertama");
        list.add("Kedua");
        list.add("Ketiga");
        list.add("Pertama");
        list.add("Kedua");
        list.add("Ketiga");
        list.add("Pertama");
        list.add("Kedua");
        list.add("Ketiga");
        list.add("Pertama");
        list.add("Kedua");
        list.add("Ketiga");

        ListAdapter adapter = new ListAdapter(list);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
    }
}