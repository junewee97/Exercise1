package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.TextViewCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btoCalculate: Button =findViewById(R.id.buttonCalculate)
        btoCalculate.setOnClickListener {calculateLoan()}


    }

    private fun calculateLoan() {

        val loanText: TextView = findViewById(R.id.textViewLoan)
        val interestText: TextView=findViewById(R.id.textViewInterest)
        val monthlyRepaymentText : TextView=findViewById(R.id.textViewMonthlyRepayment)

        val carPrice=editTextCarPrice.text.toString().toInt()
        val downPayment=editTextDownPayment.text.toString().toInt()
        val interestRate=editTextInterestRate.text.toString().toDouble()
        val loanPeriod=editTextLoanPeriod.text.toString().toInt()


        val carLoan=carPrice-downPayment
        val interest=carLoan*interestRate*loanPeriod
        val monthlyRepayment=(carLoan+interest)/loanPeriod/12

        loanText.text=carLoan.toString()
        interestText.text=interest.toString()
        monthlyRepaymentText.text=monthlyRepayment.toString()

    }
}
