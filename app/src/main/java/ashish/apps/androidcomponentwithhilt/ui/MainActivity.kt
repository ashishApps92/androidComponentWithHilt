package ashish.apps.androidcomponentwithhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ashish.apps.androidcomponentwithhilt.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}