package com.example.myapplication1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.RotateAnimation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.LinkedList;

public class GameView extends View {

    float x = 0;
    float y = 0;
    float deg = 0;

    CountDownTimer timer = new CountDownTimer(100000, 100) {
        @Override
        public void onTick(long l) {
            invalidate();
        }

        @Override
        public void onFinish() {
        }
    };

    public GameView(Context context, @Nullable AttributeSet attr) {
        super(context, attr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        canvas.save();
        deg += 10;
        if (deg > 360)
            deg = 0;
        canvas.rotate(deg, x, y);
        canvas.drawRect(x - 50, y - 50, x + 50, y + 50, p);
        canvas.restore();
    }

    public void draw(float x, float y) {
        this.x = x;
        this.y = y;
        timer.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        x = event.getX();
        y = event.getY();
        timer.start();
        System.out.println(x);
        System.out.println(y);
        return true;
    }
}
