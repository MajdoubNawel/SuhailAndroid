package com.android.suhail.presentation.features.authentification.signIn

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class signInViewModel : MVIViewModel<signInStates, signInEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: signInEvents) {
        when (viewEvent) {
            signInEvents.Event1 -> {}
        }
    }
}