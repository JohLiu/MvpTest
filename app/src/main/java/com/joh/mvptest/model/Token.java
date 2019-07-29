package com.joh.mvptest.model;

import com.joh.mvptest.BuildConfig;

/**
 * @author Joh_hz
 * @date 2018/7/4
 * @Description
 */

public class Token {
    /**
     * 包名
     */
    private static final String PACKAGE_NAME = BuildConfig.APPLICATION_ID;
    /**
     * mvpmodel
     */
    public static final String API_MVP_DATA = PACKAGE_NAME + ".home.MvpModel";
    /**
     * ermodel
     */
    public static final String API_ER_DATA = PACKAGE_NAME + ".er.ErModel";

}
