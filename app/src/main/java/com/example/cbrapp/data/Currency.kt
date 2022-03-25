package com.example.cbrapp.data

import com.google.gson.annotations.SerializedName

data class Currency (

    @SerializedName("Id"       ) var Id       : String? = null,
    @SerializedName("NumCode"  ) var NumCode  : String? = null,
    @SerializedName("CharCode" ) var CharCode : String? = null,
    @SerializedName("Nominal"  ) var Nominal  : Int?    = null,
    @SerializedName("Name"     ) var Name     : String? = null,
    @SerializedName("Value"    ) var Value    : Double? = null,
    @SerializedName("Previous" ) var Previous : Double? = null

)