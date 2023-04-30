package ashish.apps.androidcomponentwithhilt.utils

import android.content.Context
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import java.lang.Exception

class Helper {
    companion object {
        fun isValidEmail(email: String): Boolean {
            return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        fun hideKeyboard(view: View){
            try {
                val imm = view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(view.windowToken, 0)
            }catch (e: Exception){

            }
        }
    }
    class WeekDay(var b: String) {
        val a = print("Monday")
        init {
            print("Saturday")
        }
        constructor() : this("Tuesday") {
            print("Sunday")
        }
    }
}
fun main() {
    var a = Helper.WeekDay()
    println()
    var b = Helper.WeekDay("aaaa")
}