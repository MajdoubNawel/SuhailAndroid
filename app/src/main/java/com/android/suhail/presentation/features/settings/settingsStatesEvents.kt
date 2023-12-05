package com.android.suhail.presentation.features.settings

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

sealed class settingsStates {
    object State1 : settingsStates()
}

sealed class settingsEvents {
    object Event1 : settingsEvents()
}