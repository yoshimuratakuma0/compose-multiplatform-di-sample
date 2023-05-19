package com.myapplication

import MainView
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import domain.usecases.GetSampleTextUseCase
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val getSampleTextUseCase: GetSampleTextUseCase by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainView(getSampleTextUseCase)
        }
    }
}