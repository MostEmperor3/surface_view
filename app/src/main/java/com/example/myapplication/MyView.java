package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.util.Random;
import android.view.MotionEvent;



public class MyView extends View {
    final Random random = new Random();
    int radius = 70;
    float touchX = 0;
    float touchY = 0;

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawCircle(touchX, touchY, radius,paint);
        this.invalidate();
    }
    public boolean onTouchEvent(MotionEvent event)
    {
        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            touchX = event.getX();
            touchY = event.getY();
            invalidate();
        }
        return true;
    }
}

