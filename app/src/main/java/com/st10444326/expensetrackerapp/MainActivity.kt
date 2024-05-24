package com.st10444326.expensetrackerapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvBalance: TextView
    private lateinit var tvExpenses: TextView
    private lateinit var tvIncome: TextView
    private lateinit var btnIncome: Button
    private lateinit var btnExpense: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvBalance = findViewById(R.id.tvBalance)
        tvExpenses = findViewById(R.id.tvExpenses)
        tvIncome = findViewById(R.id.tvIncome)
        btnIncome = findViewById(R.id.btnIncome)
        btnExpense = findViewById(R.id.btnExpense)

        // Initialize balance, expenses, and income with sample values
        val balance = 1500
        val expenses = 500.0
        val income = 1500

        // Display the values
        tvBalance.text = "Current Balance: $expenses + $income"
        tvExpenses.text = "Accumulated Expenses: $expenses"
        tvIncome.text = "Accumulated Income: $income"

        // Set on-click listeners for the buttons
        btnIncome.setOnClickListener { openIncomeScreen() }
        btnExpense.setOnClickListener { openExpenseActivity() }
    }

    fun openIncomeScreen() {
        startActivity(Intent(this, IncomeScreen::class.java))
    }

    fun openExpenseActivity() {
        startActivity(Intent(this, ExpenseScreen::class.java))
    }
}