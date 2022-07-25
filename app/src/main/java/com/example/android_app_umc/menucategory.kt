package com.example.android_app_umc

import androidx.annotation.StringRes

enum class menucatagory(
    @StringRes val categoryNameId: Int,
    @StringRes val categoryTypeId: Int
) {
    MAIN(R.string.main, R.string.main_type),
    BREAD1(R.string.bread1, R.string.bread1_type),
    BREAD2(R.string.bread2, R.string.bread2_type),
    BREAD3(R.string.bread3, R.string.bread3_type),
    BREAD4(R.string.bread4, R.string.bread4_type),
    BREAD5(R.string.bread5, R.string.bread5_type),
    BREAD6(R.string.bread6, R.string.bread6_type),
    BREAD7(R.string.bread7, R.string.bread7_type),
    BREAD8(R.string.bread8, R.string.bread8_type),
    BREAD9(R.string.bread9, R.string.bread9_type),
    BREAD10(R.string.bread10, R.string.bread10_type),
    BREAD11(R.string.bread11, R.string.bread11_type),
    BREAD12(R.string.bread12, R.string.bread12_type),
    BREAD13(R.string.bread13, R.string.bread13_type),
    BREAD14(R.string.bread14, R.string.bread14_type)

}