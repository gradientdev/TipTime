package com.gradient.tiptime

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener{ calculateTip() }
    }

    @SuppressLint("StringFormatMatches")
    fun calculateTip() {
        var mealCost: Double = cost_of_service.text.toString().toDouble()
        mealCost += 0
        val selectedId = tip_options.checkedRadioButtonId
        val tipPercentage = when(selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        var splitnum = 0.0
        var tip = tipPercentage * mealCost
        val switch: Switch = findViewById(R.id.round_up_switch)
        val result: TextView = findViewById(R.id.tip_result)
        val total: TextView = findViewById(R.id.total_cost)
//        val split: TextView = findViewById(R.id.split_cost)
//        val splitDouble: Double = split.toString().toDouble()
//        val splitVal: Double = (splitnum / splitDouble)
        val roundUp = switch.isChecked

        if (roundUp) {
            tip = kotlin.math.ceil(tip)}

        val addedCost = tip + mealCost
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        val formattedCost = NumberFormat.getCurrencyInstance().format(addedCost)

        result.text = getString(R.string.tip_amount, formattedTip)
        total.text = getString(R.string.total_amount, formattedCost)
//        split.text = getString(R.string.split_cost, splitVal)
    }
}