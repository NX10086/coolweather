package com.example.nx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nx on 2018/3/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
