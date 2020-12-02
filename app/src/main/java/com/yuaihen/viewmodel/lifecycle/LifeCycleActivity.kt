package com.yuaihen.viewmodel.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yuaihen.viewmodel.R
import kotlinx.android.synthetic.main.activity_life_cycle.*

/**
 * 使用lifecycle 替代OnPause等管理状态
 */
class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        lifecycle.addObserver(chronometer)
    }

}