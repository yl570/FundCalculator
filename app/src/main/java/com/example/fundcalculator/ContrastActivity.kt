package com.example.fundcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contrast.*
import kotlinx.android.synthetic.main.activity_main.*

class ContrastActivity : AppCompatActivity() {
     var loan_total= 0.0
     var loan_rate_now=0.0
     var fund_m=0.0
     var fund_balance=0.0
     var hasRepay_y=0.0
     var loan_rate=0.0
     var fund_rate=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contrast)
        RB_NO.text = "<89"
        Btn_calculator.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
    private fun loadData(){
         loan_total= Ed_loan_total.text.toString().toDouble()
         loan_rate_now=Ed_contrast_rate.text.toString().toDouble()
         fund_m=0.0
         fund_balance=0.0
         hasRepay_y=0.0
         loan_rate=0.0
         fund_rate=0.0
    }
    private fun getFun(){

    }
}