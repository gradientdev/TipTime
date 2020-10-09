//imports
package com.gradient.tiptime
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

//main activity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateButton: Button = findViewById(R.id.calculate_button)
        calculateButton.setOnClickListener{ calculateTip() }
    }

    //calculates tip and other values. Is called when calculate button is tapped
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    fun calculateTip() {
        var mealCost: Double = cost_of_service.text.toString().toDouble()
        var splitNum: Double = split_num.text.toString().toDouble()

        val selectedId = tip_options.checkedRadioButtonId
        val tipPercentage = when(selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15}

        //original values
        var tip: Double = tipPercentage * mealCost
        var addedCost: Double = tip + mealCost
        var split: Double = addedCost / splitNum

        //finds some views
        val switch: Switch = findViewById(R.id.round_up_switch)
        val result: TextView = findViewById(R.id.tip_result)
        val total: TextView = findViewById(R.id.total_cost)
        val splitResult: TextView = findViewById(R.id.split_cost)
        val roundUp = switch.isChecked
        var splitString: String = split.toString()

        //if roundup switch is checked, rounds tip up
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
            addedCost = kotlin.math.ceil(addedCost)
            split = kotlin.math.ceil(split)}

        //formats the tip to $
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        val formattedCost = NumberFormat.getCurrencyInstance().format(addedCost)
        val formattedSplit = NumberFormat.getCurrencyInstance().format(split)

        //changes the textViews in the app
        result.text = getString(R.string.tip_amount, formattedTip)
        total.text = getString(R.string.total_amount, formattedCost)
        splitResult.text = getString(R.string.split_cost, formattedSplit)
    }
}
