package com.example.fundcalculator

import android.util.Log

/**
 * Created by YiLei 2022/5/5 17:19
 *
 */
object LogUtil {
    private const val VERBOSE = 1
    private const val DEBUG = 2
    private const val INFO = 3
    private const val WARN = 4
    private const val ERROR = 5
    private var level= VERBOSE
    fun v(tag:String,msg:String){
        if(level<=VERBOSE){
            Log.v(tag,msg)
        }
    }
    fun d(tag:String,msg:String){
        if(level<=VERBOSE){
            Log.d(tag,msg)
        }
    }
    fun i(tag:String,msg:String){
        if(level<=VERBOSE){
            Log.i(tag,msg)
        }
    }
    fun w(tag:String,msg:String){
        if(level<=VERBOSE){
            Log.w(tag,msg)
        }
    }
    fun e(tag:String,msg:String){
        if(level<=VERBOSE){
            Log.e(tag,msg)
        }
    }
}