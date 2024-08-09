package com.example.field_injection_compose

import dagger.Component

@Component
interface ConsumerComponent {

    //consumer
    fun injectmain_ac(mainActivity: MainActivity)
}