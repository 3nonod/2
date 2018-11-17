package com.github.ppartisan.simplealarms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.ppartisan.simplealarms.ui.MainActivity;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ImageView calendar = (ImageView) findViewById(R.id.bubble7);
        calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent itt = new Intent(getApplicationContext(), MainActivity.class );
                startActivity(itt);
            }
        });
        ImageView Faces= (ImageView) findViewById(R.id.bubble2);
        Faces.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent itt = new Intent(getApplicationContext(), Faces.class);
                startActivity(itt);
            }
        });
    }
}
