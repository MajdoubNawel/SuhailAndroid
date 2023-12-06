package com.android.suhail.presentation.features.authentification.signUp

import com.android.suhail.base.viewmodel.MVIViewModel
import com.android.suhail.domain.UseCases.ApiResult
import com.android.suhail.domain.UseCases.AuthentificationUseCases
import com.android.suhail.domain.managers.AuthentificationManager

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class SignUpViewModel : MVIViewModel<SignUpStates, SignUpEvents>() {
    var authenticationManager: AuthentificationUseCases = AuthentificationManager()
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: SignUpEvents) {
        when (viewEvent) {
           is SignUpEvents.SignUp ->{
               val result= authenticationManager.signUp(viewEvent.user)
               when(result){
                   is ApiResult.Success->{

                   }
                   is ApiResult.Failure->{

                   }
               }
           }
        }
    }
}