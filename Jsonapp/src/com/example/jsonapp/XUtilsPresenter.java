package com.example.jsonapp;

import org.xutils.x;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;

import android.content.Context;

public class XUtilsPresenter {
	Context context;
	String url = "http://192.168.43.184:8080/JsonService/data";

	IXUtilsPresenter ixUtilsPresenter;
public 	XUtilsPresenter(Context context,IXUtilsPresenter ixUtilsPresenter){
		this.context=context;
		this.ixUtilsPresenter=ixUtilsPresenter;
	}
	public void xUtilsOrdinary() {

		RequestParams params = new RequestParams(url);
		x.http().get(params, new Callback.CommonCallback<String>() {

			@Override
			public void onSuccess(String result) {
				ixUtilsPresenter.XUtilsSuccess(result);
			}

			@Override
			public void onError(Throwable ex, boolean isOnCallback) {
				ixUtilsPresenter.XUtilsError(ex.getMessage());
			}
			

			@Override
			public void onCancelled(CancelledException cex) {

			}

			@Override
			public void onFinished() {

			}
		});

	}
	/*public void xUtilsBitmap() {
		// TODO 自动生成的方法存根
		x.image().bind(imageview, url,optons);

	}*/

}
