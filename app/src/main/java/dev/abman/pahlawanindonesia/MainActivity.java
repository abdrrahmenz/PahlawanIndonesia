package dev.abman.pahlawanindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import dev.abman.pahlawanindonesia.adapter.PahlawanAdapter;
import dev.abman.pahlawanindonesia.data.PahlawanData;
import dev.abman.pahlawanindonesia.data.entity.Pahlawan;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<Pahlawan> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = (RecyclerView) findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();

        list.addAll(PahlawanData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(this);
        pahlawanAdapter.setListPahlawan(list);
        rvCategory.setAdapter(pahlawanAdapter);
    }

}
