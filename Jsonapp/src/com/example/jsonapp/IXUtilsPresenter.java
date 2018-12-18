package com.example.jsonapp;

import android.graphics.drawable.Drawable;

public interface IXUtilsPresenter {
	

    /**
     * 网络请求错误
     * @param msg
     */
    void XUtilsError(String msg);

    /**
     * 网络请求成功
     * @param msg
     */
    void XUtilsSuccess(String msg);

    /**
     * 返回图片数据
     * @param bitmap
     */
    void XUtilsBitmap(Drawable bitmap);
}
