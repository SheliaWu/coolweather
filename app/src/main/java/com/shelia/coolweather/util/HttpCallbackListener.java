package com.shelia.coolweather.util;

/**
 * Created by Administrator on 2016/4/6.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
