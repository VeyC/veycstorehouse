package com.hotel.entity;

public class Preplot {
    private Integer booknum;

    private String phonenum;

    private String roomnum;

    private String startstaytime;

    private String endstaytime;

    private String booktime;

    private String atimearrival;

    private String atimeleave;

    private Integer finish;

    private Integer breakfast;

    private Integer park;
    
    
    

    public Preplot() {
		super();
	}

	public Preplot(Integer booknum, String phonenum, String roomnum, String startstaytime, String endstaytime,
			String booktime, String atimearrival, String atimeleave, Integer finish, Integer breakfast, Integer park) {
		super();
		this.booknum = booknum;
		this.phonenum = phonenum;
		this.roomnum = roomnum;
		this.startstaytime = startstaytime;
		this.endstaytime = endstaytime;
		this.booktime = booktime;
		this.atimearrival = atimearrival;
		this.atimeleave = atimeleave;
		this.finish = finish;
		this.breakfast = breakfast;
		this.park = park;
	}

	public Integer getBooknum() {
        return booknum;
    }

    public void setBooknum(Integer booknum) {
        this.booknum = booknum;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum == null ? null : roomnum.trim();
    }

    public String getStartstaytime() {
        return startstaytime;
    }

    public void setStartstaytime(String startstaytime) {
        this.startstaytime = startstaytime == null ? null : startstaytime.trim();
    }

    public String getEndstaytime() {
        return endstaytime;
    }

    public void setEndstaytime(String endstaytime) {
        this.endstaytime = endstaytime == null ? null : endstaytime.trim();
    }

    public String getBooktime() {
        return booktime;
    }

    public void setBooktime(String booktime) {
        this.booktime = booktime == null ? null : booktime.trim();
    }

    public String getAtimearrival() {
        return atimearrival;
    }

    public void setAtimearrival(String atimearrival) {
        this.atimearrival = atimearrival == null ? null : atimearrival.trim();
    }

    public String getAtimeleave() {
        return atimeleave;
    }

    public void setAtimeleave(String atimeleave) {
        this.atimeleave = atimeleave == null ? null : atimeleave.trim();
    }

    public Integer getFinish() {
        return finish;
    }

    public void setFinish(Integer finish) {
        this.finish = finish;
    }

    public Integer getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    public Integer getPark() {
        return park;
    }

    public void setPark(Integer park) {
        this.park = park;
    }

	@Override
	public String toString() {
		return "Preplot [booknum=" + booknum + ", phonenum=" + phonenum + ", roomnum=" + roomnum + ", startstaytime="
				+ startstaytime + ", endstaytime=" + endstaytime + ", booktime=" + booktime + ", atimearrival="
				+ atimearrival + ", atimeleave=" + atimeleave + ", finish=" + finish + ", breakfast=" + breakfast
				+ ", park=" + park + "]";
	}
    
    
}