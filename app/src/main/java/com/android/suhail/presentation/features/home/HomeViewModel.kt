package com.android.suhail.presentation.features.home

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class HomeViewModel : MVIViewModel<HomeStates, HomeEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: HomeEvents) {
        when (viewEvent) {
            HomeEvents.Event1 -> {}
        }
    }
}