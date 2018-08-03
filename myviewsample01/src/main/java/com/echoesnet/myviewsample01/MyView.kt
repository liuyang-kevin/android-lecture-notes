package com.echoesnet.myviewsample01

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View


class MyView internal constructor(context: Context) : View(context) {
    protected override fun onDraw(canvas: Canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas)

        // 首先定义一个paint
        val paint = Paint()

        // 绘制矩形区域-实心矩形
        // 设置颜色
        paint.setColor(Color.BLUE)
        // 设置样式-填充
        paint.setStyle(Paint.Style.FILL)
        // 绘制一个矩形
        canvas.drawRect(Rect(0, 0, getWidth(), getHeight()), paint)

        // 绘空心矩形
        // 设置颜色
        paint.setColor(Color.RED)
        paint.color = Color.BLACK
        // 设置样式-空心矩形
        paint.setStyle(Paint.Style.STROKE)
        // 绘制一个矩形
        canvas.drawRect(Rect(10, 10, 100, 30), paint)

        // 绘文字
        // 设置颜色
        paint.setColor(Color.GREEN)
        // 绘文字
        canvas.drawText("Hello", 10.0f, 50.0f, paint)

//        // 绘图
//        // 从资源文件中生成位图
//        val bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)
//        // 绘图
//        canvas.drawBitmap(bitmap, 10.0f, 60.0f, paint)
    }

}