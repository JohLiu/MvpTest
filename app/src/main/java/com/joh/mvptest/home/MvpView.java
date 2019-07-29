package com.joh.mvptest.home;

import com.joh.mvptest.base.BaseView;

/**
 * Created by liuheng on 2018/5/22.
 */

public interface MvpView extends BaseView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     *
     * @param data 数据源
     */
    void showData(String data);


}
