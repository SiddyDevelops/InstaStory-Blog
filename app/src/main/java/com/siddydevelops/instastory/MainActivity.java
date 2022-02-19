package com.siddydevelops.instastory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.siddydevelops.instastory.RVAdapters.StoryViewAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView storyViewRV;
    String[] usernameList = {"Siddharth","Siddy","Mia","Nikki","Emma"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyViewRV = findViewById(R.id.storyViewRV);
        storyViewRV.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        storyViewRV.setAdapter(new StoryViewAdapter(usernameList));

    }
}