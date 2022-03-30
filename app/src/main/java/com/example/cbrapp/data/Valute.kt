package com.example.cbrapp.data

import com.google.gson.annotations.SerializedName

data class Valute (
    @SerializedName("AUD" ) var AUD : Currency? = Currency(),
    @SerializedName("AZN" ) var AZN : Currency? = Currency(),
    @SerializedName("GBP" ) var GBP : Currency? = Currency(),
    @SerializedName("AMD" ) var AMD : Currency? = Currency(),
    @SerializedName("BYN" ) var BYN : Currency? = Currency(),
    @SerializedName("BGN" ) var BGN : Currency? = Currency(),
    @SerializedName("BRL" ) var BRL : Currency? = Currency(),
    @SerializedName("HUF" ) var HUF : Currency? = Currency(),
    @SerializedName("HKD" ) var HKD : Currency? = Currency(),
    @SerializedName("DKK" ) var DKK : Currency? = Currency(),
    @SerializedName("USD" ) var USD : Currency? = Currency(),
    @SerializedName("EUR" ) var EUR : Currency? = Currency(),
    @SerializedName("INR" ) var INR : Currency? = Currency(),
    @SerializedName("KZT" ) var KZT : Currency? = Currency(),
    @SerializedName("CAD" ) var CAD : Currency? = Currency(),
    @SerializedName("KGS" ) var KGS : Currency? = Currency(),
    @SerializedName("CNY" ) var CNY : Currency? = Currency(),
    @SerializedName("MDL" ) var MDL : Currency? = Currency(),
    @SerializedName("NOK" ) var NOK : Currency? = Currency(),
    @SerializedName("PLN" ) var PLN : Currency? = Currency(),
    @SerializedName("RON" ) var RON : Currency? = Currency(),
    @SerializedName("XDR" ) var XDR : Currency? = Currency(),
    @SerializedName("SGD" ) var SGD : Currency? = Currency(),
    @SerializedName("TJS" ) var TJS : Currency? = Currency(),
    @SerializedName("TRY" ) var TRY : Currency? = Currency(),
    @SerializedName("TMT" ) var TMT : Currency? = Currency(),
    @SerializedName("UZS" ) var UZS : Currency? = Currency(),
    @SerializedName("UAH" ) var UAH : Currency? = Currency(),
    @SerializedName("CZK" ) var CZK : Currency? = Currency(),
    @SerializedName("SEK" ) var SEK : Currency? = Currency(),
    @SerializedName("CHF" ) var CHF : Currency? = Currency(),
    @SerializedName("ZAR" ) var ZAR : Currency? = Currency(),
    @SerializedName("KRW" ) var KRW : Currency? = Currency(),
    @SerializedName("JPY" ) var JPY : Currency? = Currency()
){
    fun getListCurrency():List<Currency>{
        var listCurrency = mutableListOf<Currency>()
        AUD?.let { listCurrency.add(it) }
        AZN?.let { listCurrency.add(it) }
        GBP?.let { listCurrency.add(it) }
        AMD?.let { listCurrency.add(it) }
        BYN?.let { listCurrency.add(it) }
        BGN?.let { listCurrency.add(it) }
        BRL?.let { listCurrency.add(it) }
        HUF?.let { listCurrency.add(it) }
        HKD?.let { listCurrency.add(it) }
        DKK?.let { listCurrency.add(it) }
        USD?.let { listCurrency.add(it) }
        EUR?.let { listCurrency.add(it) }
        INR?.let { listCurrency.add(it) }
        KZT?.let { listCurrency.add(it) }
        CAD?.let { listCurrency.add(it) }
        KGS?.let { listCurrency.add(it) }
        CNY?.let { listCurrency.add(it) }
        MDL?.let { listCurrency.add(it) }
        NOK?.let { listCurrency.add(it) }
        PLN?.let { listCurrency.add(it) }
        RON?.let { listCurrency.add(it) }
        XDR?.let { listCurrency.add(it) }
        SGD?.let { listCurrency.add(it) }
        TJS?.let { listCurrency.add(it) }
        TRY?.let { listCurrency.add(it) }
        TMT?.let { listCurrency.add(it) }
        UZS?.let { listCurrency.add(it) }
        UAH?.let { listCurrency.add(it) }
        CZK?.let { listCurrency.add(it) }
        SEK?.let { listCurrency.add(it) }
        CHF?.let { listCurrency.add(it) }
        ZAR?.let { listCurrency.add(it) }
        KRW?.let { listCurrency.add(it) }
        JPY?.let { listCurrency.add(it) }

        return listCurrency
    }
}