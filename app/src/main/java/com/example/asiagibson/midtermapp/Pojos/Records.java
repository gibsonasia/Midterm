package com.example.asiagibson.midtermapp.Pojos;

/**
 * Created by asiagibson on 12/10/16.
 */

public class Records {

    private String username;

    private String created;

    private String verified;

    private String userId;

    private String[] vanityUrls;

    private User user;

    private String likeId;

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
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

    public String[] getVanityUrls ()
    {
        return vanityUrls;
    }

    public void setVanityUrls (String[] vanityUrls)
    {
        this.vanityUrls = vanityUrls;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public String getLikeId ()
    {
        return likeId;
    }

    public void setLikeId (String likeId)
    {
        this.likeId = likeId;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [username = "+username+", created = "+created+", verified = "+verified+", userId = "+userId+", vanityUrls = "+vanityUrls+", user = "+user+", likeId = "+likeId+"]";
    }
}
