package com.stimednp.show_data_with_retrofit.api

import com.google.gson.annotations.SerializedName

/**
 * Created by rivaldy on 11/8/2019.
 */

class ResponseThesportDB {
    @SerializedName("leagues")
    var leagues = ArrayList<Leagues>()
}
class Leagues {
    @SerializedName("idLeague")
    lateinit var idLeague: String
    @SerializedName("strSport")
    lateinit var strSport: String
    @SerializedName("strLeague")
    lateinit var strLeague: String
    @SerializedName("intFormedYear")
    var intFormedYear: Int? = null
    @SerializedName("dateFirstEvent")
    lateinit var dateFirstEvent: String
    @SerializedName("strWebsite")
    lateinit var strWebsite: String
    @SerializedName("strFacebook")
    lateinit var strFacebook: String
    @SerializedName("strTwitter")
    lateinit var strTwitter: String
    @SerializedName("strYoutube")
    lateinit var strYoutube: String
    @SerializedName("strDescriptionEN")
    lateinit var strDescriptionEN: String
    @SerializedName("strBadge")
    lateinit var strBadge: String
    @SerializedName("strLogo")
    lateinit var strLogo: String
    @SerializedName("strComplete")
    lateinit var strComplete: String
}

