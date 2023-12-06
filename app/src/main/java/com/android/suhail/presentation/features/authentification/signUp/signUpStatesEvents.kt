package com.android.suhail.presentation.features.authentification.signUp

import com.android.suhail.data.model.User

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class SignUpStates {
    data object SignUpSuccess : SignUpStates()
    data object SignUpInProgress : SignUpStates()
    data class SignUpFailure(var error: String) : SignUpStates()
}

sealed class SignUpEvents {
    data class SignUp(var user: User) : SignUpEvents()
}