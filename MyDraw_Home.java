package com.example.drawable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class MyDraw extends View{

    private Context context;

    public MyDraw(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint_1 = new Paint();
        Paint paint_2 = new Paint();
        Paint paint_3 = new Paint();
        Paint paint_4 = new Paint();
        Paint paint_5 = new Paint();
        Paint paint_6 = new Paint();
        Paint paint_7 = new Paint();

        paint_1.setColor(Color.parseColor("#90EE90"));
        paint_2.setColor(Color.parseColor("#00FFFF"));
        paint_3.setColor(Color.parseColor("#FAF0E6"));
        paint_4.setColor(Color.parseColor("#ADD8E6"));
        paint_5.setColor(Color.parseColor("#708090"));
        paint_6.setColor(Color.parseColor("#808000"));
        paint_7.setColor(Color.parseColor("#8B4513"));

        canvas.drawPaint(paint_2);
        float rotate_center_x = 0;
        float rotate_center_y = 0;
        float rotate_angle = 45;
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        int i = -490;
        int j = 920;

        canvas.drawRect(i, j, i+282,j-282, paint_5);

        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        canvas.drawRect(0, 1100, getWidth(),2200, paint_1);

        canvas.drawRect(100, 1150, 500,800, paint_3);

        canvas.drawRect(130, 1010, 280,900, paint_4);

        canvas.drawRect(330, 1150, 460,900, paint_5);

        canvas.drawRect(330, 1150, 460,900, paint_5);

        for(int n = 0; n<130; n+=20){
            canvas.drawRect(330+n, 1150, 340+n,900, paint_4);
        }

        for(int n = 0; n<251; n+=20){
            canvas.drawRect(330, 910+n, 460,900+n, paint_5);
        }

        canvas.drawCircle(305, 710, 40, paint_4);


        for(int k = 0; k<201; k+=200){
            canvas.drawRect(715+k, 1150, 745+k,900, paint_7);
            canvas.drawOval(650+k, 700, 800+k, 1000, paint_6);
        }

    }
}
