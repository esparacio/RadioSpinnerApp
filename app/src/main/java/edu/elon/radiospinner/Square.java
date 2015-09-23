package edu.elon.radiospinner;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by Elena on 9/22/15.
 */
public class Square {
    private float x,y;
    private int red, blue, green;
    private Paint paint;

    public Square(float x, float y, int red, int green, int blue){
        this.x = x;
        this.y = y;
        this.red=red;
        this.green=green;
        this.blue=blue;

        paint = new Paint();
        paint.setARGB(255,red,green,blue);

    }

    public void draw(Canvas canvas){
        canvas.drawRect(x,y,x,y,paint);

    }

}
