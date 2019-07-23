package com.han.domain;

public class Blog {
    private int id;
    private String title;
    private String auth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "Blog [id=" + id + ", title=" + title + ", auth=" + auth + "]";
    }

}
