package com.st10444326.expensetrackerapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExpenseScreen : AppCompatActivity() {
    private lateinit var etDescription: EditText
    private lateinit var etAmount: EditText
    private lateinit var btnAdd: Button
    private lateinit var tvTotalExpenses: TextView
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense_screen)

        etDescription = findViewById(R.id.editTextNumberSigned2)
        etAmount = findViewById(R.id.editTextNumberSigned4)
        btnAdd = findViewById(R.id.btnAdd)
        tvTotalExpenses = findViewById(R.id.tvTotalIncome)
        recyclerView = findViewById(R.id.recyclerView)

        btnAdd.setOnClickListener {
            // Add expense logic here
        }
    }
}
