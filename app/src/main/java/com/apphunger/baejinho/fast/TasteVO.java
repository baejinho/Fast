package com.apphunger.baejinho.fast;

import android.location.Location;

/**
 * Created by baejinho on 2016. 2. 15..
 */
public class TasteVO {
    private String category;
    private Location mapXY;
    private int publicprice;
    private String name;
    private String id;
    private int like;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Location getMapXY() {
        return mapXY;
    }

    public void setMapXY(Location mapXY) {
        this.mapXY = mapXY;
    }

    public int getPublicprice() {
        return publicprice;
    }

    public void setPublicprice(int publicprice) {
        this.publicprice = publicprice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
