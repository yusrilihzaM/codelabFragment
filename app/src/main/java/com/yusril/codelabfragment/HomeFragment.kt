package com.yusril.codelabfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment(), View.OnClickListener {


    // hapus semua kecuali onCreate View kemudian buat onViewCrate
    override fun onCreateView(

//Pada HomeFragment terdapat metode onCreateView() di mana layout interface didefinisikan dan ditransformasikan dari layout berupa file xml ke dalam objek view dengan menggunakan metode inflate().
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnCategory: Button = view.findViewById(R.id.btn_category)
        btnCategory.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == R.id.btn_category) {
                val mCategoryFragment = CategoryFragment()
                val mFragmentManager = fragmentManager
                mFragmentManager?.beginTransaction()?.apply {
                    replace(// replace untuk menempelkan sebuah fragment baru
                        R.id.frame_container,
                        mCategoryFragment,
                        CategoryFragment::class.java.simpleName
                    )
                    addToBackStack(null)
                    commit()
                }
            }
        }
    }
}