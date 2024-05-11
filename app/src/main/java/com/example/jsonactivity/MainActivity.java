package com.example.jsonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonConsumer(MainActivity.this,(ListView)findViewById(R.id.ListView))
                .execute("http://jsonplaceholder.typicode.com/posts");

        ((ListView)findViewById(R.id.ListView)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openView((Post)parent.getItemAtPosition(position));
            }
        });


    }
    private void openView(Post post){
        Intent intent = new Intent(getApplicationContext(), PostActivity.class);
        intent.putExtra("post", post);
        startActivity(intent);
    }

}

