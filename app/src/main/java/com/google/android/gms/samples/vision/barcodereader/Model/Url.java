package com.google.android.gms.samples.vision.barcodereader.Model;

public enum Url {

    COUNTRIES("countries.json");

    public static final String BASE_URL = "https://dl.dropbox.com/s/j1wh4xvf8zcc3uu/";
    private final String url;

    Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
