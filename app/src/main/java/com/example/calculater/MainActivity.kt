package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numnull = Toast.makeText(applicationContext, "ใส่ตัวเลขทั้งnum1เเละnum2", Toast.LENGTH_LONG)
        val num2null = Toast.makeText(applicationContext, "num2ต้องไม่เท่ากับ0เเละไม่เป็นค่าว่าง", Toast.LENGTH_LONG)
        plus.setOnClickListener() {
            val numm1 = num1.text.toString().toInt()
            val numm2 = num2.text.toString().toInt()
            var anser = 0
            if (num1.text.toString() == null) {
                numnull.show()
                icon.setText("+")
            } else if (num2.text.toString() == null) {
                numnull.show()
                icon.setText("+")
            } else {
                anser = numm1 + numm2
                ans.setText("$anser")
                icon.setText("+")
            }
        }
        minus.setOnClickListener() {
            val numm1 = num1.text.toString().toInt()
            val numm2 = num2.text.toString().toInt()
            var anser = 0

            if (num1.text.toString() != null) {
                anser = numm1 - numm2
                ans.setText("$anser")
                icon.setText("-")
            } else if (num2.text.toString() == null) {
                numnull.show()
                icon.setText("-")
            } else {
                numnull.show()
                icon.setText("-")
            }
        }
        Multiply.setOnClickListener() {
            val numm1 = num1.text.toString().toInt()
            val numm2 = num2.text.toString().toInt()
            var anser = 0

            if (num1.text.toString() != null) {
                anser = numm1 * numm2
                ans.setText("$anser")
                icon.setText("*")
            } else if (num2.text.toString() == null) {
                numnull.show()
                icon.setText("*")
            } else {
                numnull.show()
                icon.setText("*")
            }
        }
        divider.setOnClickListener() {
            val numm1 = num1.text.toString().toInt()
            val numm2 = num2.text.toString().toInt()
            var anser = 0

            if (num1.text.toString() != null) {
                anser = numm1 / numm2
                ans.setText("$anser")
                icon.setText("/")
            } else if (num2.text.toString() == null) {
                numnull.show()
                icon.setText("/")
            } else {
                numnull.show()
                icon.setText("/")
            }
        }
        modolo.setOnClickListener() {
            val numm1 = num1.text.toString().toInt()
            val numm2 = num2.text.toString().toInt()
            var anser = 0

            if (num1.text.toString() != null) {
                anser = numm1 % numm2
                ans.setText("$anser")
                icon.setText("%")
            }
            else if (num2.text.toString() == null) {
                numnull.show()
                icon.setText("%")
            }
            else if (num2.text.toString().toInt() == 0) {
                num2null.show()
                icon.setText("%")
            }else {
                numnull.show()
                icon.setText("%")

            }

        }
        clear.setOnClickListener(){
            num1.setText(null)
            num2.setText(null)
            ans.setText(null)
        }
    }
}




