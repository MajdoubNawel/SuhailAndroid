package com.android.suhail.presentation.features.settings

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by taieb.slama@zeta-box.com on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class settingsViewModel : MVIViewModel<settingsStates, settingsEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: settingsEvents) {
        when (viewEvent) {
            settingsEvents.Event1 -> {}
        }
    }
}