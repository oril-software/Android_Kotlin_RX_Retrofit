package com.orilinc.kotlin_rx_retrofit.model.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repo {

    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("full_name")
    @Expose
    var fullName: String? = null

    @SerializedName("owner")
    @Expose
    var owner: Owner? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("language")
    @Expose
    var language: String? = null

}
