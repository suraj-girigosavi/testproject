package com.technoheaven.mytestgitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private  TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();

    }

    private void initViews() {

        text = (TextView) findViewById(R.id.txtHelloWorld);
        text.setText("Demo Testing");
    }
}
