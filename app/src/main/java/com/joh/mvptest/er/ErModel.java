package com.joh.mvptest.er;

import android.os.Handler;

import com.joh.mvptest.base.BaseModel;
import com.joh.mvptest.base.Callback;

/**
 * Created by liuheng on 2018/5/22.
 */

public class ErModel extends BaseModel<String> {
    /**
     * 获取网络接口数据
     *
     * @param callback 数据回调接口
     */
    @Override
    public void execute(final Callback<String> callback) {
        // 利用postDelayed方法模拟网络请求数据的耗时操作
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (mParams[0]) {
                    case "0":
                        callback.onSuccess("根据参数" + mParams[0] + "的请求网络数据成功");
                        break;
                    case "1":
                        callback.onFailure("请求失败：参数有误");
                        break;
                    case "2":
                        callback.onError();
                        break;
                    default:
                        break;
                }
                callback.onComplete();
            }
        }, 5000);
    }
}
