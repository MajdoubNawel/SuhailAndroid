package com.android.suhail.presentation.features.authentification.signUp

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class signUpViewModel : MVIViewModel<signUpStates, signUpEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: signUpEvents) {
        when (viewEvent) {
            signUpEvents.Event1 -> {}
        }
    }
}