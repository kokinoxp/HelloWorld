package com.orporsoft.orpor.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.Random;

public class MainActivity extends Activity implements Dots.OnDotsChangeListener {
    private static final int MAX_COORD_X = 300;
    private static final int MAX_COORD_Y = 300;
    private Dots mDots=new Dots();
    private Random mGenrator=new Random();
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView=(ListView)findViewById(R.id.listView);
        mListView.setAdapter(null);

        mDots.setOnDotsChangeListener(this);

    }
    public void randomDot(View view){
        int coordX=mGenrator.nextInt(MAX_COORD_X);
        int coordY=mGenrator.nextInt(MAX_COORD_Y);

       Dot dot=new Dot(coordY,coordX);
        mDots.insert(dot);
    }

    @Override
    public void onDotsChange(Dots dots) {

    }
}
