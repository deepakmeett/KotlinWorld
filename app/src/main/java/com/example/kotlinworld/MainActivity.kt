package com.example.kotlinworld

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


class
MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var textView: TextView
    private var seconds = 11
    private lateinit var handler: Handler
    private var stopTimer = false
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener {
            val isFutureDate = "16-03-2023 09:30:00 +0530";

//            if (isFutureDate != null && !isFutureDate.equals("", ignoreCase = true)) {
//
//                if (isFutureDate.equals("isComingSoonIsNullOrFalse", ignoreCase = true)) {
//                    Log.d("Deepak", "GO TO Series 1")
//
//                } else if (isFutureDate.equals("dateIsNotFormatted", ignoreCase = true)) {
//                    Log.d("Deepak", "GO TO Series 2")
//
//                } else if (isFutureDate.contains("true")) {
//                    Log.d("Deepak", "GO TO Series 3")
//                } else {
//                    Log.d("Deepak", "GO TO Episode 4")
//                }
//            } else {
//                Log.d("Deepak", "GO TO Episode")
//            }


//            Log.d("ifItIsFutureDate", "onCreate: " + checkDateFormats("16-03-2023 09"))

            fun <T> List<T>.secondLast(): T {
                return this[size - 2]
            }

            fun calculateSize(list: List<Int>): Int{
                var size = 0

                size = list.size - 1

                return size
            }

            val list = listOf(1, 2, 3, 4, 5)
            val secondLast = list.secondLast() // returns 4
            val thirdList = calculateSize(list)
            Log.d("SecondList", "secondLast: $secondLast")
            Log.d("SecondList", "thirdList: $thirdList")

        }
        val timeZone = getTimeZone()

    }

    private fun getTimeZone(): String {
        val calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault())
        val currentLocalTime = calendar.time
        val date: DateFormat = SimpleDateFormat("ZZZZZ", Locale.getDefault())
        val localTime: String = date.format(currentLocalTime)
        println("$localTime  TimeZone   ")
        return localTime.replace(":", "")
    }

    private fun timer() {
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                seconds--
                if (seconds < 0) {
                    stopTimer = true
                } else {
                    textView.text = seconds.toString()
                }
                if (!stopTimer) {
                    handler.postDelayed(this, 1000)
                }
            }
        })
    }

    private fun convertDateToUTC(providedDate: String, isThisBangkokTime: Boolean): String? {
        println("Reminder = providedDate: -> $providedDate")
        var utcDate = ""
        @SuppressLint("SimpleDateFormat") val format = SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z")
        val date: Date
        try {
            date = format.parse(providedDate)
            @SuppressLint("SimpleDateFormat") val sdf = SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z")
            sdf.timeZone = TimeZone.getTimeZone("UTC")
//            sdf.setTimeZone(TimeZone.getDefault())

            if (date != null) {
                utcDate = sdf.format(date)
                println("Reminder = UTC date -> $utcDate")
//                if (isThisBangkokTime) {
//                    minusHours(date, sdf)
//                }
            }
        } catch (e: ParseException) {
            e.printStackTrace()
        }


        return utcDate
    }


    private fun checkDateFormats(dateString: String): Boolean {
        var date: Date? = null
        val checkFormat: Boolean
        try {
            @SuppressLint("SimpleDateFormat") val dateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm")
            dateFormat.isLenient = false
            date = dateFormat.parse(dateString)
        } catch (ex: ParseException) {
            ex.printStackTrace()
        }
        checkFormat = date != null
        println(checkFormat)
        return checkFormat
    }
    private fun checkCurrentDate(): String? {
        val dtf: DateTimeFormatter
        var date: String? = ""
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            val now = LocalDateTime.now()
            date = dtf.format(now)
        }
        return date
    }

    private fun minusHours(date: Date, format: SimpleDateFormat) {
        val cal = Calendar.getInstance()
        cal.time = date
        cal.add(Calendar.HOUR, -7)
        val formatted = format.format(cal.time)
        println("Reminder = seven hours minus time: -> $formatted")
//        sevenHoursMinusUTCDate = formatted
    }

    private fun checkIfFutureDate(comingSoonDate: String, currentDate: String): Boolean {
        @SuppressLint("SimpleDateFormat") val sdFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss Z")
        val comingSoonDate1: Date?
        var futureDate = false
        try {
            comingSoonDate1 = sdFormat.parse(comingSoonDate)
            val currentDate1 = sdFormat.parse(currentDate)
            if (comingSoonDate1 != null) {
                println("The comingSoonDate1 is: " + sdFormat.format(comingSoonDate1))
            }
            if (currentDate1 != null) {
                println("The currentDate1 is: " + sdFormat.format(currentDate1))
            }
            if (comingSoonDate1 != null) {
                if (comingSoonDate1.compareTo(currentDate1) > 0) {
                    println("comingSoonDate1 occurs after currentDate1")
                } else if (comingSoonDate1.compareTo(currentDate1) < 0) {
                    futureDate = true
                    println("comingSoonDate1 occurs before currentDate1")
                } else if (comingSoonDate1.compareTo(currentDate1) == 0) {
                    println("Both dates are equal")
                }
            }
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return futureDate
    }

}