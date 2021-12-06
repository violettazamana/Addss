package com.example.task_14_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import java.util.*

var i = 0
var k = 0
var isCorrect = true


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main2)
        super.onCreate(savedInstanceState)
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.im)

    }

    fun createNewOrder(view: View) {
        val nameOfOrder = findViewById<EditText>(R.id.orderNameEditText)
        val newOrder: Any
        val randomNumber = Random().nextInt(9)
        when (randomNumber) {
            1 -> {

                newOrder = Sneakers()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            2 -> {
                newOrder = Nike()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            3 -> {
                newOrder = Adidas()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            4 -> {
                newOrder = Trousers()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            5 -> {
                newOrder = Jeans()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            6 -> {
                newOrder = Breeches()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            7 -> {
                newOrder = Sweatshirts()
                newOrder.name = newOrder.print()

                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            8 -> {
                newOrder = Hoodies()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
            9 -> {
                newOrder = Longsleeves()
                newOrder.name = newOrder.print()
                nameOfOrder.setText(newOrder.print())
                Singleton.collection.add(newOrder)
            }
        }
        i = Singleton.collection.size - 1
        isCorrect = true
    }

    fun showPrevOrder(view: View) {
        val nameOfOrder = findViewById<EditText>(R.id.orderNameEditText)

        if (Singleton.collection.isEmpty()) {
            return
        }
        if (i == 0) {
            isCorrect = true
        }
        if (isCorrect) {
            i = Singleton.collection.size - 1
            nameOfOrder.setText(Singleton.collection.elementAt(i).name)
            isCorrect = false
            return
        }
        i--
        nameOfOrder.setText(Singleton.collection.elementAt(i).name)

    }


    fun showNextOrder(view: View) {

        val nameOfOrder = findViewById<EditText>(R.id.orderNameEditText)

        if (Singleton.collection.isEmpty()) {
            return
        }
        if (i == Singleton.collection.size - 1) {
            isCorrect = true
        }
        if (isCorrect) {
            i = 0
            nameOfOrder.setText(Singleton.collection.elementAt(i).name)
            isCorrect = false
            return
        }
        i++
        nameOfOrder.setText(Singleton.collection.elementAt(i).name)
    }

    fun deleteElem(view: View) {
        val nameOfOrder = findViewById<EditText>(R.id.orderNameEditText)
        if (Singleton.collection.isEmpty()) {
            nameOfOrder.setText("")
            return
        }
        showNextOrder(view);
        Singleton.collection.removeAt(i)


    }
}
