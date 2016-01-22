package com.xuexian.coolweather.util;

/**
 * Created by sxxseu on 2016/1/21.
 */
public interface HttpCallbackListener {
    void onError(Exception e);
    void onFinish(String response);
}
