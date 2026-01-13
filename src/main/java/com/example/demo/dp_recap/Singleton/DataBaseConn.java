package com.example.demo.dp_recap.Singleton;

public class DataBaseConn {
    private DataBaseConn() {}

    private String url;
    private static DataBaseConn instance;

    public static synchronized DataBaseConn getInstance() {
        if (instance == null) {
            return new DataBaseConn();
        } else {
            return instance;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
