package com.nearur.allnews;

import java.io.Serializable;

/**
 * Created by mrdis on 7/11/2017.
 */

public class Paper {
    int icon;
    String name;
    String url;

   public Paper() {

    }

    public Paper(int icon, String name, String url) {
        this.icon = icon;
        this.name = name;
        this.url = url;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
