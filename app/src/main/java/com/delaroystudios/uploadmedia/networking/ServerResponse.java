package com.delaroystudios.uploadmedia.networking;

/**
 * Created by delaroystudios on 10/5/2016.
 */

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

import java.util.List;

public class ServerResponse {

    @SerializedName("message")
    @Expose
    private Message message;
    @SerializedName("data")
    @Expose
    private Data data;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}