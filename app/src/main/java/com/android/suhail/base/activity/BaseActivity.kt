package com.android.suhail.base.activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023. All rights reserved.
 */
abstract class BaseActivity : ComponentActivity() {

 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   ActivityLayout()
  }
 }

 @Composable
 abstract fun ActivityLayout()

}