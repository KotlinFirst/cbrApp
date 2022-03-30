package com.example.cbrapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_info")
data class Currency (

    @SerializedName("Id"       ) var Id       : String? = null,
    @SerializedName("NumCode"  ) var NumCode  : String? = null,
    @PrimaryKey
    @SerializedName("CharCode" ) var CharCode : String="No name",// при primarykey нельзя null
    @SerializedName("Nominal"  ) var Nominal  : Int?    = null,
    @SerializedName("Name"     ) var Name     : String? = null,
    @SerializedName("Value"    ) var Value    : Double? = null,
    @SerializedName("Previous" ) var Previous : Double? = null
)