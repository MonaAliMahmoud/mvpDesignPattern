package com.example.mona.mvpdesignpattern;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements Counter{

    TextView counter;
    Button btncount;

    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);

        counter=findViewById(R.id.counter);
        btncount=findViewById(R.id.btncount);
        btncount.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                presenter.increment();
            }
        });
    }

    @Override
    public void incrementCounter(int count) {
        counter.setText(""+count);
    }
}
