package com.example.nx.coolweather.gson;

/**
 * Created by nx on 2018/3/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
