package com.monch.park_manager.utils;

/**
 * Created by Administrator on 2018/2/24.
 * 登录工具类
 */

public class LoginUtil {
    //判断是否登录
    public static boolean isLogin() {
        return CacheData.getInfoBean()!=null;
    }

    //退出登录：清空登录信息
    public static void logout() {
        CacheData.setInfoBean(null);
    }
}
