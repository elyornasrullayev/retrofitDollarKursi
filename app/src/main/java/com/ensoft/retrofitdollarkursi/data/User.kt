package com.ensoft.retrofitdollarkursi.data

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("CcyNm_EN")
    val ccyNmEN: String? = null,

    @field:SerializedName("CcyNm_UZC")
    val ccyNmUZC: String? = null,

    @field:SerializedName("Diff")
    val diff: String? = null,

    @field:SerializedName("Rate")
    val rate: String? = null,

    @field:SerializedName("Ccy")
    val ccy: String? = null,

    @field:SerializedName("CcyNm_RU")
    val ccyNmRU: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("CcyNm_UZ")
    val ccyNmUZ: String? = null,

    @field:SerializedName("Code")
    val code: String? = null,

    @field:SerializedName("Nominal")
    val nominal: String? = null,

    @field:SerializedName("Date")
    val date: String? = null
)
