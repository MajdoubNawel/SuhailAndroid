package com.android.suhail.presentation.features.authentification.connectwithpass

import com.android.suhail.base.viewmodel.MVIViewModel

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */

class ConnectWithUAEPassViewModel :
    MVIViewModel<ConnectWithUAEPassStates, ConnectWithUAEPassEvents>() {
    override suspend fun initStates() {}

    override fun handleEvents(viewEvent: ConnectWithUAEPassEvents) {
        when (viewEvent) {
            ConnectWithUAEPassEvents.Event1 -> {}
        }
    }
}