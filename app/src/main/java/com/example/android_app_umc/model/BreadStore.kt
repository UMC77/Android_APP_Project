package com.example.android_app_umc.model

import java.io.Serializable

data class BreadStore(
    var img : Int,
    var StoreName : String,
    var StoreStar : String,
    var StoreLocate : String
) : Serializable