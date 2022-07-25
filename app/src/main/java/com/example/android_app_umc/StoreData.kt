package com.example.android_app_umc

import android.graphics.drawable.Drawable

data class StoreData(
    var img : Drawable,
    var StoreName : String,
    var StoreLocate : String
    //var StoreStar : int? -> 별점을 뭐로 받아와야 함...?
)
