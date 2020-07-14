package com.nujnay.rxjavatext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val disposable = Flowable
            .interval(2, TimeUnit.SECONDS)
            .map {
                Log.d("timetime:11::", formateDataStandard(Date(System.currentTimeMillis())))
            }
            .flatMap {
                return@flatMap Flowable.just("1").delay(2,TimeUnit.SECONDS)
            }
            .subscribeOn(Schedulers.io())
            .subscribe({
                Log.d("timetime:22::",it+"||"+ formateDataStandard(Date(System.currentTimeMillis())))
            }, {

            })

    }
}

fun formateDataStandard(startTime: Date): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(startTime)
}