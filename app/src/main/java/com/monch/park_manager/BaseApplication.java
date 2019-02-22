package com.monch.park_manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.support.multidex.MultiDexApplication;
import com.bumptech.glide.Glide;
import com.monch.park_manager.utils.CacheData;
import com.monch.park_manager.utils.LoginUtil;
import com.monch.park_manager.utils.SpUtils;
import com.squareup.leakcanary.LeakCanary;

import java.util.Stack;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2018/2/1.
 */

public class BaseApplication extends MultiDexApplication {
    public static Context appContext;
    private static BaseApplication instance;

    public static BaseApplication getInstance() {
        return instance;
    }

    private Stack<Activity> activityList = new Stack<>();

    /**
     * 添加一个activity
     *
     * @param act
     */
    public void addActivity(Activity act) {
        activityList.add(act);
    }

    /**
     * 去掉一个activity
     *
     * @param act
     */
    public void removeActivity(Activity act) {
        activityList.remove(act);
    }

    /**
     * 获取栈顶Activity
     *
     * @return
     */
    public Activity getTopActivity() {
        if (activityList.size() > 0) {
            return activityList.peek();
        }
        return null;
    }

    /**
     * 退出应用程序
     */
    public void exitApp() {
        //获取栈中的activity，遍历退出所有activity
        int size = activityList.size();
        for (int i = 0; i < size; i++) {
            Activity activity = activityList.get(i);
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (instance == null) {
            instance = this;
        }
        //内存泄漏检测库：检测内存是否泄漏
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        appContext = this;//获取上下文
        JPushInterface.init(this);//初始化极光推送
        //判断是否登录
        if (LoginUtil.isLogin()) {
            //判断用户信息
            if (CacheData.getIsManager() == 1) {
                JPushInterface.setAlias(this, 0, String.valueOf(CacheData.getInfoBean().getUser_id()));
            } else {
                JPushInterface.setAlias(this, 0, CacheData.getInfoBean().getMobile());
            }
        }
        //获取设备号
        String did = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        SpUtils.set(SpUtils.DID, did);
        //获取软件版本号与版本名
        PackageManager manager = this.getPackageManager();
        try {
            PackageInfo info = manager.getPackageInfo(this.getPackageName(), 0);
            int versionCode = info.versionCode;
            String versionName = info.versionName;
            SpUtils.set(SpUtils.VERSION_CODE, versionCode);
            SpUtils.set(SpUtils.VERSION_NAME, versionName);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        if (level == ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN) {
            Glide.get(this).clearMemory();
        }
        Glide.get(this).trimMemory(level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Glide.get(this).clearMemory();
    }
}
