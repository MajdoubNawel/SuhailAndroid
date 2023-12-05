package com.android.suhail.presentation.features.happiness

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class HappinessViewModel : MVIViewModel<HappinessStates, HappinessEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: HappinessEvents) {
        when (viewEvent) {
            HappinessEvents.Event1 -> {}
        }
    }
}