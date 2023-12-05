package com.android.suhail.presentation.features.plan

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class PlanViewModel : MVIViewModel<PlanStates, PlanEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: PlanEvents) {
        when (viewEvent) {
            PlanEvents.Event1 -> {}
        }
    }
}