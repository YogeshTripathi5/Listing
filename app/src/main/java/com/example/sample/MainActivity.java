package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
RecyclerView sampleRV;
GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        sampleRV  = findViewById(R.id.sampleRV);
        gridLayoutManager = new GridLayoutManager(this,2);
        GalleryAdapter galleryAdapter = new GalleryAdapter(this);
        sampleRV.setLayoutManager(gridLayoutManager);
        sampleRV.setAdapter(galleryAdapter);

    }
}
