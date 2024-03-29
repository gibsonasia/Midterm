package com.example.asiagibson.midtermapp.Pojos;

import com.example.asiagibson.midtermapp.Retrofit.Data;

/**
 * Created by asiagibson on 12/10/16.
 */

public class MyPojo {
    private String error;

    private Data data;

    private String code;

    private String success;

    public String getError ()
    {
        return error;
    }

    public void setError (String error)
    {
        this.error = error;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [error = "+error+", data = "+data+", code = "+code+", success = "+success+"]";
    }
}

