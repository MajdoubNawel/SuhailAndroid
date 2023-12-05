package com.android.suhail.presentation.features.authentification.forgotpassword

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class ForgotPasswordViewModel : MVIViewModel<ForgotPasswordStates, ForgotPasswordEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: ForgotPasswordEvents) {
        when (viewEvent) {
            ForgotPasswordEvents.Event1 -> {}
        }
    }
}