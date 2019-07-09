package com.delaroystudios.uploadmedia.networking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("ETag")
    @Expose
    private String eTag;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("Bucket")
    @Expose
    private String bucket;

    public String getETag() {
        return eTag;
    }

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

}
