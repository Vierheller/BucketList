package de.vierheller.bucketlist.main

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import de.vierheller.bucketlist.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val menuFragment = MenuFragment.newInstance()
        fragmentTransaction.add(R.id.main_layout, menuFragment)
        fragmentTransaction.commit()
    }
}
