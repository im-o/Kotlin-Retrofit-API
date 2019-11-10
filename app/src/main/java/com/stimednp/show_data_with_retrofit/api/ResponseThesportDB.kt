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
    @SerializedName("strLeague")
    lateinit var strLeague: String
}

