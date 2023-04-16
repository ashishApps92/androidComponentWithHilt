package ashish.apps.androidcomponentwithhilt.utils

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class TokenManager @Inject constructor(@ApplicationContext context: Context) {
    private var prefs: SharedPreferences =
        context.getSharedPreferences(Constant.PREFS_TOKEN_FILE, Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        val editor = prefs.edit()
        editor.putString(Constant.USER_TOKEN, token)
        editor.apply()
    }

    fun getToken(): String? {
        return prefs.getString(Constant.USER_TOKEN, null)
    }
}