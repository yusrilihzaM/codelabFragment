package com.yusril.codelabfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mfragmentManager=supportFragmentManager// untuk operasi add, comit, replace .beginTransaction()
        val mHomeFragment=HomeFragment()// buat objek dari home fragment
        val fragment=mfragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
        if(fragment!is HomeFragment){
            Log.d("My Fragment", "Fragment name"+HomeFragment::class.java.simpleName)

            mfragmentManager
                .beginTransaction()// mulai
                    //fragment manager masukan ke id frame container, yang dimasukan objek dr homefragment, class dari Homefragment
                .add(R.id.frame_container,mHomeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}