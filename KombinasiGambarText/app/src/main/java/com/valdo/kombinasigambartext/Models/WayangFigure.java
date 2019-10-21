package com.valdo.kombinasigambartext.Models;

public class WayangFigure {
    public  String wayangName;
    public  int wayangImage;

    public WayangFigure(String wayangName, int wayangImage) {
        this.wayangName = wayangName;
        this.wayangImage = wayangImage;
    }

    public String getWayangName() {
        return wayangName;
    }

    public void setWayangName(String wayangName) {
        this.wayangName = wayangName;
    }

    public int getWayangImage() {
        return wayangImage;
    }

    public void setWayangImage(int wayangImage) {
        this.wayangImage = wayangImage;
    }
}
