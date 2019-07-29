package com.joh.mvptest.er;

import com.joh.mvptest.base.BaseView;

/**
 * @author Joh_hz
 * @date 2018/7/4
 * @Description
 */

public interface ErView extends BaseView {
    /**
     * 当数据请求成功后，调用此接口显示数据
     *
     * @param data 数据源
     */
    void showData(String data);
}
