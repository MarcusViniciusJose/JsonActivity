package com.example.jsonactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        Post post = (Post)getIntent().getSerializableExtra("post");
        ((TextView)findViewById(R.id.edId)).setText(String.valueOf(post.getId()));
        ((TextView)findViewById(R.id.edUserId)).setText(String.valueOf(post.getUserId()));
        ((TextView)findViewById(R.id.edTitle)).setText(String.valueOf(post.getTitle()));
        ((TextView)findViewById(R.id.edBody)).setText(String.valueOf(post.getBody()));
    }
}