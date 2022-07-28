package com.example.android_app_umc.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "BakeryTable")
data class Bakery(
    @PrimaryKey(autoGenerate = false) var id: Int = 0, // album의 pk는 임의로 지정해주기 위해 autogenerate 안씁니다.
    var name: String? = "",
    var star_rating: String? = "",
    var coverImg: Int? = null
)
