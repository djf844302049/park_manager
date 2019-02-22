package com.monch.park_manager.utils;


import com.monch.park_manager.BaseApplication;
import com.monch.park_manager.moduel.LoginRegisterBean;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2018/2/26.
 * 记录数据缓存类
 */

public class CacheData {
    private static LoginRegisterBean infoBean = null;

    public static LoginRegisterBean getInfoBean() {
        return infoBean;
    }

    public static void setInfoBean(LoginRegisterBean newInfoBean) {
        infoBean = newInfoBean;
        SpUtils.setObject(SpUtils.USERINFO, infoBean);

        if (newInfoBean == null) {
            //删除极光推送别名
            JPushInterface.deleteAlias(BaseApplication.appContext, 0);
            return;
        }
        //设置极光推送别名
        if (newInfoBean.getIs_manager() == 1) {//判断是否为管理员1是
            JPushInterface.setAlias(BaseApplication.appContext, 0, String.valueOf(CacheData.getInfoBean().getUser_id()));//把账号设为别名
        } else {
            JPushInterface.setAlias(BaseApplication.appContext, 0, String.valueOf(CacheData.getInfoBean().getMobile()));//把手机号设为别名
        }
    }

    public static int getUser_id() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return -1;
        }
        return infoBean.getUser_id();
    }

    public static String getUserName() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return "";
        }
        return infoBean.getUsername();
    }

    public static String getHeader_img() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return "";
        }
        return infoBean.getHeader_img();
    }

    public static int getSex() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return -1;
        }
        return infoBean.getSex();
    }

    /**
     * 获取是否设置支付密码
     * 0->未设置 1->已设置
     *
     * @return
     */
    public static int getSurplusPassword() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return -1;
        }
        return infoBean.getSurplus_password();
    }

    /*
    * 登录信息
    * */
    public static String getToken() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return "";
        }
        return infoBean.getToken();
    }

    /**
     * 是否开启小额免密
     * 0->未开启  1->开启
     *
     * @return
     */
    public static int isFreePay() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return -1;
        }
        return infoBean.getFree_password();
    }

    /*
    * 是否为管理员界面
    * 1是，其他不是
    * */
    public static int getIsManager() {
        if (infoBean == null) {
            infoBean = SpUtils.getObject(SpUtils.USERINFO, LoginRegisterBean.class);
        }
        if (infoBean == null) {
            return -1;
        }
        return infoBean.getIs_manager();
    }

}
