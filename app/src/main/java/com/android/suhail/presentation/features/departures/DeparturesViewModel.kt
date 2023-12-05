package com.android.suhail.presentation.features.departures

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class DeparturesViewModel : MVIViewModel<DeparturesStates, DeparturesEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: DeparturesEvents) {
        when (viewEvent) {
            DeparturesEvents.Event1 -> {}
        }
    }
}