package com.example.android.quakereport;

/**
 * Created by g50 on 16-01-2017.
 */

public class Earthquake {

 //   private String mMagnitude;
    private String mLocation;
  //  private String mDate;
    private long mTimeInMilliseconds;
    private double mMagnitude;
    private String mUrl;



    public Earthquake (double magnitude,String location,long timeInMilliseconds,String url){
        mMagnitude=magnitude;
        mLocation=location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl=url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}
