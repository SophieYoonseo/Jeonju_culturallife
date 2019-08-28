package com.example.testapi_16;

import java.net.MalformedURLException;
import java.net.URL;


public class Image implements Comparable<Image> {
    static final String CHANNEL = "channel";
    static final String ITEM = "item";
    static final String TITLE = "title";
    static final String LINK = "link";
    static final String THUNMNAIL = "thumbnail";
    static final String SIZE_HEIGHT = "sizeheight";
    static final String SIZE_WIDTH = "sizewidth";

    private String title;
    private URL link;
    private String thumbnail;
    private int sizeheight;
    private int sizewidth;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(String link) {
        try {
            if (link != null  && link.trim().length() > 0) {
                this.link = new URL("link);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getSizeheight() {
        return sizeheight;
    }

    public void setSizeheight(int sizeheight) {
        this.sizeheight = sizeheight;
    }

    public int getSizewidth() {
        return sizewidth;
    }

    public void setSizewidth(int sizewidth) {
        this.sizewidth = sizewidth;
    }

    public int compareTo(Image another) {
        if (another == null) {
            return 1;
        }
        return another.thumbnail.compareTo(thumbnail);
    }
}
