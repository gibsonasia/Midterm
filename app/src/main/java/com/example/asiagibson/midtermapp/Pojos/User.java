package com.example.asiagibson.midtermapp.Pojos;

/**
 * Created by asiagibson on 12/10/16.
 */

public class User {
    private String username;

    private String location;

    private String verified;

    private String userId;

    private String avatarUrl;

    private String[] vanityUrls;

   // private String private:

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getLocation ()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public String getVerified ()
    {
        return verified;
    }

    public void setVerified (String verified)
    {
        this.verified = verified;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public String getAvatarUrl ()
    {
        return avatarUrl;
    }

    public void setAvatarUrl (String avatarUrl)
    {
        this.avatarUrl = avatarUrl;
    }

    public String[] getVanityUrls ()
    {
        return vanityUrls;
    }

    public void setVanityUrls (String[] vanityUrls)
    {
        this.vanityUrls = vanityUrls;
    }

//    public String getPrivate ()
//    {
//        return private;
//    }
//
//    public void setPrivate (String private)
//    {
//        this.private = private;
//    }

    @Override
    public String toString()
    {
        return "ClassPojo [username = "+username+", location = "+location+", verified = "+verified+", userId = "+userId+", avatarUrl = "+avatarUrl+", vanityUrls = "+vanityUrls+",]";
    }                                                                                                                                                              //private = "+private+
}
