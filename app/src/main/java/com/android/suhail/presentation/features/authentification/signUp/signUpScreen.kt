package com.android.suhail.presentation.features.authentification.signUp

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

var bindingModel: signUpBindingModel = signUpBindingModel()

@Composable
fun signUpScreen(navController: NavController) {
    val viewModel: SignUpViewModel = hiltViewModel()
    val signUpState = viewModel.viewStates

    signUpState.value?.let { state ->
        when (state) {
            is SignUpStates.SignUpInProgress -> {

            }
            is SignUpStates.SignUpFailure -> {}
            SignUpStates.SignUpSuccess -> {}
        }
    }

}