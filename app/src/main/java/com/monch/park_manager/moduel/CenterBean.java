package com.monch.park_manager.moduel;

/**
 * Created by Administrator on 2018/2/24.
 */

public class CenterBean {

    /**
     * header_img : http://p2xsrupxn.bkt.clouddn.com/2018/03/74e02201803221728109019.png
     * user_money : 430.01
     * username : 哇哈哈
     * isAuth : 1
     * deposit_flag : 0
     * car_auth : 0
     * deposit_money:300
     * unRead : 0
     */

    private String header_img;
    private String user_money;
    private String username;
    private int isAuth;
    private int deposit_flag;
    private int car_auth;
    private float deposit_money;
    private int unRead;

    public int getUnRead() {
        return unRead;
    }

    public void setUnRead(int unRead) {
        this.unRead = unRead;
    }

    public String getHeader_img() {
        return header_img;
    }

    public void setHeader_img(String header_img) {
        this.header_img = header_img;
    }

    public String getUser_money() {
        return user_money;
    }

    public void setUser_money(String user_money) {
        this.user_money = user_money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(int isAuth) {
        this.isAuth = isAuth;
    }

    public int getDeposit_flag() {
        return deposit_flag;
    }

    public void setDeposit_flag(int deposit_flag) {
        this.deposit_flag = deposit_flag;
    }

    public int getCar_auth() {
        return car_auth;
    }

    public void setCar_auth(int car_auth) {
        this.car_auth = car_auth;
    }

    public float getDeposit_money() {
        return deposit_money;
    }

    public void setDeposit_money(float deposit_money) {
        this.deposit_money = deposit_money;
    }
}
