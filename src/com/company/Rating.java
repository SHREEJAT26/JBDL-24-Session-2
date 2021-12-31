package com.company;

public class Rating implements Comparable<Rating>{
    private Integer userRating;
    private Integer criticRating;

    public Rating(Integer userRating, Integer criticRating) {
        this.userRating = userRating;
        this.criticRating = criticRating;
    }

    public Integer getUserRating() {
        return userRating;
    }

    public void setUserRating(Integer userRating) {
        this.userRating = userRating;
    }

    public Integer getCriticRating() {
        return criticRating;
    }

    public void setCriticRating(Integer criticRating) {
        this.criticRating = criticRating;
    }

    @Override
    public int compareTo(final Rating o) {
        return this.userRating-o.getUserRating();
    }

}

