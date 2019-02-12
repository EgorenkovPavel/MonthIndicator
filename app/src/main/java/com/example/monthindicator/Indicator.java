package com.example.monthindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.annotation.Nullable;

public class Indicator extends View {

    private int width;
    private int heigth;

    private Paint paint;

    public Indicator(Context context) {
        super(context);
        init();
    }

    public Indicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        paint = new Paint();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        width = MeasureSpec.getSize(widthMeasureSpec);
        heigth = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {

       paint.setColor(Color.BLACK);
       paint.setStrokeWidth(2);

       canvas.drawLine(0, heigth-10, width, heigth-10, paint);

//        canvas.drawLine(0, heigth-2, width, heigth-2, paint);
        canvas.drawLine(2, 0, 2, heigth, paint);

//        float shadowRadius = width/60f;
//        float shadowX = cx/30;
//        float shadowY = cy/30;
//
//        paint.setColor(Color.WHITE);
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint.setStrokeWidth(width/60f);
//
//        paint.setShadowLayer(shadowRadius, shadowX, shadowY, Color.GRAY);
//        setLayerType(LAYER_TYPE_SOFTWARE, paint);
//
//        oval.set(cx - borderRadius, cy - borderRadius, cx + borderRadius, cy + borderRadius);
//        canvas.drawArc(oval, START_BORDER_ANGEL, SWEEP_BORDER_ANGEL, false, paint);
//
//        paint.setShadowLayer(0.0f, shadowX, shadowY, Color.GRAY);
//
//        paint.setStyle(Paint.Style.STROKE);
//        //paint.setColor(Color.GREEN);
//        paint.setStrokeWidth(borderRadius/10);
//
//        oval.set(cx - scaleRadius, cy - scaleRadius, cx + scaleRadius, cy + scaleRadius);
//        float a = SWEEP_SCALE_ANGEL/(maxValue - minValue);
//        float b = START_SCALE_ANGEL - SWEEP_SCALE_ANGEL*minValue/(maxValue - minValue);
//
//        float a1 = SWEEP_SCALE_ANGEL/(maxValue-minValue);
//
//        for (Sector sector:sectors){
//          paint.setColor(sector.getColor());
//          canvas.drawArc(oval, a*sector.getStart() + b, a1*(sector.getEnd()-sector.getStart()), false, paint);
//        }
//        //canvas.drawArc(oval, START_SCALE_ANGEL, SWEEP_SCALE_ANGEL, false, paint);
//
//        paint.setStyle(Paint.Style.FILL);
//        paint.setColor(Color.BLACK);
//
//        arrow.moveTo(cx-centerRadius, cy);
//        arrow.lineTo(cx, cy - arrowLength);
//        arrow.lineTo(cx+centerRadius, cy);
//        arrow.close();
//
//        float angel = SWEEP_SCALE_ANGEL * value/(maxValue - minValue) - 90 - (180 - START_SCALE_ANGEL);
//
//        float x1 = Math.round(Math.cos(angel*Math.PI/180) * shadowX);
//        float y1 = Math.round(Math.sin(angel*Math.PI/180) * shadowY + shadowY/2);
//
//        // выводим результат
//        paint.setShadowLayer(shadowRadius, y1, x1, Color.GRAY);
//        canvas.rotate(angel, cx,cy);
//        canvas.drawPath(arrow, paint);
//        canvas.rotate(-angel, cx,cy);
//        paint.setShadowLayer(0.0f, shadowX, shadowY, Color.GRAY);
//
//        paint.setTextSize(borderRadius/5);
//        paint.setColor(Color.BLACK);
//        String text = String.format(Locale.getDefault(), "%d%%", value*100/(maxValue - minValue));
//
//        paint.getTextBounds(text, 0, text.length(), textBoundRect);
//        float mTextWidth = paint.measureText(text);
//        float mTextHeight = textBoundRect.height();
//
//        canvas.drawText(text,
//                cx - (mTextWidth / 2f),
//                cy + (mTextHeight /2f) + borderRadius*0.7f,
//                paint
//        );
    }
}