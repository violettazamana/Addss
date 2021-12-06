package com.example.task_14_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlin.collections.ArrayList
import java.util.Random

class MainActivity : AppCompatActivity() {

    var numberOfClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.text = numberOfClicks.toString()
    }

    fun createDataClass(): RandomNumbers {
        val rand = Random()
        return RandomNumbers(
            rand.nextInt(100),
            rand.nextInt(100),
            rand.nextInt(100),
            rand.nextInt(100),                             // task_2
            rand.nextInt(100),
            rand.nextInt(100),
            rand.nextInt(100)
        )
    }

    fun findFibonacciNumbers(): ArrayList<Int> {
        var arr = ArrayList<Int>()
        arr.add(1)
        arr.add(1)
        var i = 1;
        do {
            i++
            arr.add(arr[i - 1] + arr[i - 2])
        } while (i < 19)
        return arr                                                                                       //task_1
    }

    fun findFibonacciNumbersRec(i: Int, arr: ArrayList<Int>): ArrayList<Int> {
        arr.add(arr[i - 1] + arr[i - 2])
        if (i < 19) {
            return findFibonacciNumbersRec(i + 1, arr)
        } else {
            return arr
        }
    }

    fun findNumbers(view: View) {
        val arr = ArrayList<Int>()
        val i = 2
        arr.add(1)
        arr.add(1)
        val text1 = findViewById<EditText>(R.id.editTextTextMultiLine2)
        val text2 = findViewById<EditText>(R.id.editTextTextMultiLine5)
        text1.setText(findFibonacciNumbers().toString())
        text2.setText(findFibonacciNumbersRec(i, arr).toString())
        numberOfClicks++                                                                  //task_6
        val button = findViewById<Button>(R.id.button)
        button.text = numberOfClicks.toString()
        val text3 = findViewById<EditText>(R.id.editTextTextMultiLine)         //task_7
        text3.setText(createDataClass().toString())
    }
}