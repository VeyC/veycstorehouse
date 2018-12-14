package com.hotel.entity;

public class User {
    private String phonenum;

    private String psw;

    private String nickname;

    private String email;

    private String sex;

    private String identity;

    
    
    public User() {
		super();
	}

	public User(String phonenum, String psw, String nickname, String email, String sex, String identity) {
		super();
		this.phonenum = phonenum;
		this.psw = psw;
		this.nickname = nickname;
		this.email = email;
		this.sex = sex;
		this.identity = identity;
	}

	public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw == null ? null : psw.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

	@Override
	public String toString() {
		return "User [phonenum=" + phonenum + ", psw=" + psw + ", nickname=" + nickname + ", email=" + email + ", sex="
				+ sex + ", identity=" + identity + "]";
	}
    
    
}