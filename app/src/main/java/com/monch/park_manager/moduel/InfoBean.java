package com.monch.park_manager.moduel;

/**
 * Created by Administrator on 2018/2/22.
 */

public class InfoBean {


    /**
     * user_id : 3
     * username : 哈哈
     * header_img : http://p2xsrupxn.bkt.clouddn.com/2018/02/47a3420180222142319233.JPG
     * sex : 1
     */

    private int user_id;
    private String username;
    private String header_img;
    private int sex;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHeader_img() {
        return header_img;
    }

    public void setHeader_img(String header_img) {
        this.header_img = header_img;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
