package com.example.chyesy.snegovik;

import android.content.Context;
import android.graphics.*;
import android.provider.CalendarContract;
import android.view.View;

public class MyDraw extends View {

    //конструктор – обсуждается в курсе позднее
    MyDraw(Context context) {
        super(context);
    }

    //запоминание времени
    long lastTime = System.currentTimeMillis();

    @Override

    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Path path = new Path();
        canvas.drawARGB(245, 42, 172, 231);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1);
        canvas.drawCircle(this.getWidth() * 3 / 4, getHeight()-110, 100, paint);
        canvas.drawCircle(this.getWidth() * 3 / 4, getHeight()-265, 75, paint);
        canvas.drawCircle(this.getWidth() * 3 / 4, getHeight()-370, 50, paint);
        canvas.drawRect(0, this.getHeight() - 10, this.getWidth(), this.getHeight(), paint);
        paint.setColor(0x85FF0012);
        canvas.drawCircle(this.getWidth() * 3 / 4 - 20, getHeight()-370, 7, paint);
        canvas.drawCircle(this.getWidth() * 3 / 4 + 20, getHeight()-370, 7, paint);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(this.getWidth() * 3 / 4 - 20, getHeight()-370, 2, paint);
        canvas.drawCircle(this.getWidth() * 3 / 4 + 20, getHeight()-370, 2, paint);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        final RectF oval = new RectF();
        oval.set(this.getWidth() * 3 / 4 - 30, getHeight()-379, this.getWidth() * 3 / 4 + 30, getHeight()-359);
        canvas.drawArc(oval, 230, 80, false, paint);
        oval.set(this.getWidth() * 3 / 4 - 30, getHeight()-345, this.getWidth() * 3 / 4 + 30, getHeight()-325);
        canvas.drawArc(oval, 230, 80, false, paint);
        //
        paint.setColor(Color.RED);
        canvas.drawRect(this.getWidth() * 3 / 4 -40, getHeight()-450, this.getWidth() * 3 / 4 +40, this.getHeight()-400, paint);
       //
        //ножка от елки
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(this.getWidth() ,0, 150, paint);
        paint.setColor(0xFF762D00);
        canvas.drawRect(230, this.getHeight() - 55, 270, this.getHeight() - 10, paint);
        //елка
        paint.setColor(0xFF005E2E);
        // path.reset();
        path.moveTo(250, this.getHeight() - 175);
        path.lineTo(350, this.getHeight() - 55);
        path.lineTo(150, this.getHeight() - 55);
        path.close();
        canvas.drawPath(path, paint);
        path.moveTo(250, this.getHeight() - 295);
        path.lineTo(350, this.getHeight() - 145);
        path.lineTo(150, this.getHeight() - 145);
        path.close();
        canvas.drawPath(path, paint);
        path.moveTo(250, this.getHeight() - 415);
        path.lineTo(350, this.getHeight() - 265);
        path.lineTo(150, this.getHeight() - 265);
        path.close();
        canvas.drawPath(path, paint);
        //Шары
        //Шары нижний пандус
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(193, this.getHeight() - 75, 15, paint);//1
        canvas.drawCircle(307, this.getHeight() - 75, 15, paint);//2
        //Шары 2 пандус
        canvas.drawCircle(193, this.getHeight() - 165, 15, paint);//3
        canvas.drawCircle(307, this.getHeight() - 165, 15, paint);//4
        //Шары 3 пандус
        canvas.drawCircle(193, this.getHeight() - 285, 15, paint);//5
        canvas.drawCircle(307, this.getHeight() - 285, 15, paint);//6
        long nowTime = System.currentTimeMillis();
        while (nowTime - lastTime > 1200) {
            paint.setColor(Color.RED);
            canvas.drawCircle(193, this.getHeight() - 75, 15, paint);
            canvas.drawCircle(307, this.getHeight() - 165, 15, paint);
            canvas.drawCircle(193, this.getHeight() - 285, 15, paint);
            paint.setColor(Color.BLUE);
            canvas.drawCircle(307, this.getHeight() - 75, 15, paint);//2
            canvas.drawCircle(193, this.getHeight() - 165, 15, paint);//3
            canvas.drawCircle(307, this.getHeight() - 285, 15, paint);//6
            lastTime=nowTime ;
        }
        for (int i = 0; i < 1; i++) {
            invalidate();
        }
        if (nowTime - lastTime > 10000) {
            invalidate();
        }
    }
}

