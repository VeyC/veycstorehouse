package com.hotel.entity;

public class Room {
    private String roomnum;

    private String roomdescprit;

    private String roomtype;

    private Integer roomprice;

    private Integer day0;

    private Integer day1;

    private Integer day2;

    private Integer day3;

    private Integer day4;

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public String getRoomdescprit() {
        return roomdescprit;
    }

    public void setRoomdescprit(String roomdescprit) {
        this.roomdescprit = roomdescprit == null ? null : roomdescprit.trim();
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public Integer getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Integer roomprice) {
        this.roomprice = roomprice;
    }

    public Integer getDay0() {
        return day0;
    }

    public void setDay0(Integer day0) {
        this.day0 = day0;
    }

    public Integer getDay1() {
        return day1;
    }

    public void setDay1(Integer day1) {
        this.day1 = day1;
    }

    public Integer getDay2() {
        return day2;
    }

    public void setDay2(Integer day2) {
        this.day2 = day2;
    }

    public Integer getDay3() {
        return day3;
    }

    public void setDay3(Integer day3) {
        this.day3 = day3;
    }

    public Integer getDay4() {
        return day4;
    }

    public void setDay4(Integer day4) {
        this.day4 = day4;
    }
}