package com.orilinc.kotlin_rx_retrofit.model.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Permissions {

    @SerializedName("admin")
    @Expose
    var admin: Boolean? = null

    @SerializedName("push")
    @Expose
    var push: Boolean? = null

    @SerializedName("pull")
    @Expose
    var pull: Boolean? = null

}
