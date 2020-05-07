package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView LocTv;
    private Location currentBestLocation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);
        LocTv=(TextView)findViewById(R.id.viewLocation);


    }

    public void showLocation(View view){
        startActivity(new Intent(MainActivity.this,LocationActivity.class));
    }
}
