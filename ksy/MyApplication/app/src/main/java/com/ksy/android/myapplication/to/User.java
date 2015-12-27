package com.ksy.android.myapplication.to;

import java.io.Serializable;

/**
 * Created by KSY on 2015-12-26.
 */
public class User implements Serializable {
    private static User userInstance;

    private String userId;
    private String userPw;

    public static User getInstance()
    {
        if(userInstance == null)
            userInstance = new User();

        return userInstance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public boolean accessLogin()
    {
        return (userId != null && userId.equals(userPw)) ? true : false;
    }
}
