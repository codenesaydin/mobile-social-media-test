package com.appium.client.parameter;

public enum AppActivity
{
    SNAPCHAT_APP_ACTIVITY("com.snapchat.android.LandingPageActivity"),
    INSTAGRAM_APP_ACTIVITY("com.instagram.android.activity.MainTabActivity"),
    TWITTER_APP_ACTIVITY("com.twitter.android.ProfileActivity"),
    LINE_APP_ACTIVITY("jp.naver.line.android.activity.SplashActivity"),
    WHATSAPP_APP_ACTIVITY("com.whatsapp.Main");

    public final String appActivity;

    AppActivity(String appActivity)
    {
        this.appActivity = appActivity;
    }
}
