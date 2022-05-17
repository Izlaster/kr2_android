package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    GameView rec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(new GameView(this));
        setContentView(R.layout.activity_main);
        this.rec = findViewById(R.id.rec);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        rec.draw(event.getX(), event.getY() - 295);
//        return super.onTouchEvent(event);
//    }
}