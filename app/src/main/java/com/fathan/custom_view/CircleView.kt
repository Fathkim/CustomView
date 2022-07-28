package com.fathan.custom_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CircleView(ctx: Context, attr: AttributeSet) : View(ctx, attr) {

    //radius untuk view
    private var radius = 100f

    //untuk memberi warna pada tampilan view
    private var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    //untuk menggambar view ke tampilan
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = Color.RED
        canvas?.drawCircle(radius, radius, radius, paint)
    }

    //onFinishedInflate() -> Dipanggil setelah view dan semua turunannya
    //                       Berhasil di inflate dari XML
    //onMeasure() -> Dipanggil untuk menentukan
    //               ukuran view dan semua turunannya
    //onLayout() -> Dipanggil ketika view harus menetapkan ukuran dan posisi
    //              untuk semua turunannya
    //onSizedChanged() -> Dipanggil ketika ukuran view telah berubah
    //onDraw() -> Dipanggil ketika tampilan harus melakukan render kontennya
    //onKeyDown() -> Dipanggil ketika ada event key down baru terjadi
    //onKeyUp() -> Dipanggil ketika ada event key up baru terjadi
    //onTrackballEvent() -> Dipanggil ketika terjadi gerakan pada trackball
    //onTouchEvent() -> Dipanggil ketika terjadi sentuhan pada layar
}