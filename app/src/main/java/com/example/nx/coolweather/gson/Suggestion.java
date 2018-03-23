package com.example.nx.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nx on 2018/3/23.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public Carwash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;

    }
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
