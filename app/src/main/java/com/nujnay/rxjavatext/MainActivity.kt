package com.nujnay.rxjavatext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.*
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val hashmap = HashMap<String, String>()
        hashmap["1"] = "1"
        hashmap["2"] = "2"


//        var a = 1
//
//        setContentView(R.layout.activity_main)
//        val disposable = Flowable
//            .interval(3, TimeUnit.SECONDS)
//            .map {
//                Log.d("timetime:11::", formateDataStandard(Date(System.currentTimeMillis())))
//            }
//            .flatMap {
//                return@flatMap Flowable.create(
//                    { e: FlowableEmitter<Int> ->
//                        Log.d(
//                            "timetime:22::",
//                            formateDataStandard(Date(System.currentTimeMillis()))
//                        )
//                        e.onNext(a++)
//                    },
//                    BackpressureStrategy.BUFFER
//                ).delay(3, TimeUnit.SECONDS)
//            }
//            .subscribeOn(Schedulers.io())
//            .takeWhile {
//                if (it > 4) {
//                    return@takeWhile false
//                }
//                Log.d("timetime:33::", formateDataStandard(Date(System.currentTimeMillis())))
//                return@takeWhile true
//            }
//            .subscribe({
//                Log.d(
//                    "timetime:44::",
//                    it.toString() + "||" + formateDataStandard(Date(System.currentTimeMillis()))
//                )
//                Thread.sleep(4000)
//                Log.d(
//                    "timetime:55::",
//                    it.toString() + "||" + formateDataStandard(Date(System.currentTimeMillis()))
//                )
//            }, {
//
//            }, {
//                Log.d(
//                    "timetime:66::", formateDataStandard(Date(System.currentTimeMillis()))
//                )
//            })

    }
}

fun formateDataStandard(startTime: Date): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    return sdf.format(startTime)
}