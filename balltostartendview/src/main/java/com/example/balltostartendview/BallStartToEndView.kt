package com.example.balltostartendview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.content.Context
import android.app.Activity

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#00C853",
    "#1A237E",
    "#FF6D00",
    "#0091EA"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val strokeFactor : Float = 90f
val scGap : Float = 0.02f / parts
val delay : Long = 20
val sizeFactor : Float = 3.9f
val backColor : Int = Color.parseColor("#BDBDBD")
