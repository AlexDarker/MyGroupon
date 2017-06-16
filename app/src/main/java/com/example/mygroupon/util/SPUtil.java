package com.example.mygroupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.mygroupon.config.Constant;

/**
 * 对偏好设置的文件
 *
 * 1.Context的getSharedPreferences(文件名,模式);
 * 2.Activity的getPrsferences(模式);获取以preference_activity名的偏好设置文件
 * 3.PreferenceManager的getDefaultSharedPreferences
 *   获取preference_包名 偏好设置文件
 *   模式 Context_MODE_PRIVATE
 *
 * Created by tarena on 2017/6/15.
 */

public class SPUtil {

    SharedPreferences sp;
    //通过构造器重载，以不同的方式来获得偏好设置文件
    public SPUtil(Context context,String name){
        sp=context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    public SPUtil(Context context){
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public boolean isFirst(){

        return sp.getBoolean(Constant.FIRST,true);
    }

    public void setSpFirst(boolean flag){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Constant.FIRST,flag);
        editor.commit();
    }
}
