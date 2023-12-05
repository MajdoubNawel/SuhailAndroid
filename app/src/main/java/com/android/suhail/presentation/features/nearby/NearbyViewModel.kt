package com.android.suhail.presentation.features.nearby

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class NearbyViewModel : MVIViewModel<NearbyStates, NearbyEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: NearbyEvents) {
        when (viewEvent) {
            NearbyEvents.Event1 -> {}
        }
    }
}