package com.example.nx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nx on 2018/3/23.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
