package com.example.asiagibson.midtermapp.Retrofit;

import com.example.asiagibson.midtermapp.Pojos.Records;
import com.example.asiagibson.midtermapp.Pojos.User;

import java.util.List;

/**
 * Created by asiagibson on 12/10/16.
 */

public class Json {

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



//    private String error;
//
//    private Data data;
//
//    private String code;
//
//    private String success;
//
//    public String getError ()
//    {
//        return error;
//    }
//
//    public void setError (String error)
//    {
//        this.error = error;
//    }
//
//    public Data getData ()
//    {
//        return data;
//    }
//
//    public void setData (Data data)
//    {
//        this.data = data;
//    }
//
//    public String getCode ()
//    {
//        return code;
//    }
//
//    public void setCode (String code)
//    {
//        this.code = code;
//    }
//
//    public String getSuccess ()
//    {
//        return success;
//    }
//
//    public void setSuccess (String success)
//    {
//        this.success = success;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "ClassPojo [error = "+error+", data = "+data+", code = "+code+", success = "+success+"]";
//    }
//}
//
