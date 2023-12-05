package com.android.suhail.presentation.features.authentification.forgotpassword

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class ForgotPasswordStates {
    object State1 : ForgotPasswordStates()
}

sealed class ForgotPasswordEvents {
    object Event1 : ForgotPasswordEvents()
}