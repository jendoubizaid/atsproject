package com.ats.zaid.entities;


/**
 * Created by zaid jendoubi on 06/11/2017.
 */

public class Review {
    private int rating;
    private String content;

    public Review(int rating, String content) {
        this.rating = rating;
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
