package com.example.fundcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    val TAG="CalculatorActivity"
    var total=0.0
    var fund=0.0
    //var fund_total=0.0
    var fund_v=0.0
    var loan=0.0
    var loan_v=0.0
    var fund_y=0.0
    var loan_y=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Ed_fund.doAfterTextChanged { it->
            if(Ed_total.text.toString()!=""){
                calculator()
                Ed_loan.setText((total-fund).toString())
            }
        }
        Btn_commit.setOnClickListener {
            calculator()
            LogUtil.v(TAG,fund.toString())
            val fv=fund_v/12/100
            val fund_m=(fund*fv*(1+fv).pow(fund_y*12))/((1+fv).pow(fund_y*12)-1)
            Ed_fund_total.setText("${fund_m*fund_y*12}w")
            val lv=loan_v/12/100
            val loan_m=(loan*lv*(1+lv).pow(loan_y*12))/((1+lv).pow(loan_y*12)-1)
            Ed_loan_total.setText("${loan_m*loan_y*12}w")
            Tv_repay.text="${(fund_m+loan_m)*10000}\n公积金：${fund_m*10000}￥+\n商贷:${loan_m*10000}￥"
            Tv_repay_total.text="${fund_m*fund_y*12+loan_m*loan_y*12}w"
        }
    }
    private fun calculator(){
        if(Ed_total.text.toString()!=""){
            total=Ed_total.text.toString().toDouble()
        }
        if(Ed_fund.text.toString()!=""){
            fund=Ed_fund.text.toString().toDouble()
        }
//        if(Ed_fund_total.text.toString()!=""){
//             fund_total=Ed_fund_total.text.toString().toDouble()
//        }
        if(Ed_fund_v.text.toString()!=""){
            fund_v=Ed_fund_v.text.toString().toDouble()
        }
        if(Ed_loan.text.toString()!=""){
            loan=Ed_loan.text.toString().toDouble()
        }
        if(Ed_loan_v.text.toString()!=""){
            loan_v=Ed_loan_v.text.toString().toDouble()
        }
        if(Ed_fund_y.text.toString()!=""){
            fund_y=Ed_fund_y.text.toString().toDouble()
        }
        if(Ed_loan_y.text.toString()!=""){
            loan_y=Ed_loan_y.text.toString().toDouble()
        }
//        if(Ed_loan_total.text.toString()!=""){
//             loan_total=Ed_loan_total.text.toString().toDouble()
//        }

    }
    //方案计算
    private fun getFun(){

    }
}