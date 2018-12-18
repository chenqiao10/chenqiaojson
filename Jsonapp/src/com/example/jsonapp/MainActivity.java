package com.example.jsonapp;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.x;
import org.xutils.image.ImageOptions;
import org.xutils.view.annotation.ViewInject;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements IXUtilsPresenter {
	@ViewInject(R.id.mListView)
	ListView ListView;
	ImageOptions imageoptions;
	public ArrayList<Product> list = new ArrayList<Product>();
	public JSONObject object;
	IXUtilsPresenter ixUtilsPresenter;
	String url = "http://192.168.43.184:8080/JsonService/data";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ListView = (ListView) findViewById(R.id.mListView);
		XUtilsPresenter xUtilsPresenter = new XUtilsPresenter(this, this);
		xUtilsPresenter.xUtilsOrdinary();
		ListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				Toast.makeText(MainActivity.this, list.get(position).getDesc(), Toast.LENGTH_SHORT).show();

			}
		});

	}

	

	@Override
	public void XUtilsError(String msg) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void XUtilsSuccess(String msg) {
		// TODO 自动生成的方法存根
		jsonJX(msg);
		MyAdapter myAdapter = new MyAdapter();
		ListView.setAdapter(myAdapter);
	}

	@Override
	public void XUtilsBitmap(Drawable bitmap) {
		// TODO 自动生成的方法存根

	}

	class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(final int position, View view, ViewGroup arg2) {
			View cellView;
			final ViewHolader holder;
			if (view == null) {
				cellView = LayoutInflater.from(MainActivity.this).inflate(R.layout.cell_listview, null);
				holder = new ViewHolader();
				holder.tv_title = (TextView) cellView.findViewById(R.id.cell_title);
				holder.tv_desc = (TextView) cellView.findViewById(R.id.cell_desc);
				holder.tv_pride = (TextView) cellView.findViewById(R.id.cell_pride);
				holder.btn_buy = (Button) cellView.findViewById(R.id.btn_buy);
				holder.image = (ImageView) cellView.findViewById(R.id.cell_image);
				cellView.setTag(holder);
			} else {
				cellView = view;
				holder = (ViewHolader) cellView.getTag();
			}
			holder.tv_title.setText(list.get(position).getTitle().toString());
			holder.tv_desc.setText(list.get(position).getDesc().toString());
			holder.tv_pride.setText("$" + list.get(position).getPrice() + "");
			holder.btn_buy.setTag(position);
			holder.btn_buy.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View view) {
					Toast.makeText(MainActivity.this, list.get(position).getImage() + "", Toast.LENGTH_LONG).show();
				}
			});
			/*
			 * int size=list.size(); String[] pic=new String[size]; for (int
			 * i=0;i<list.size();i++) { pic[i]=list.get(i); }
			 */
			imageoptions = new ImageOptions.Builder().setFailureDrawableId(R.drawable.ic_launcher).build();
			x.image().bind(holder.image, list.get(position).getImage().toString(), imageoptions);

			return cellView;
		}

		class ViewHolader {
			TextView tv_pride;
			TextView tv_title;
			TextView tv_desc;
			Button btn_buy;
			ImageView image;
		}
	}

	private void jsonJX(String date) {
		// 判断数据是空
		if (date != null) {
			try {
				// 将字符串转换成jsonObject对象
				JSONObject jsonObject = new JSONObject(date);
				// 获取返回数据中flag的值
				String resultCode = "success"; /* jsonObject.getString("flag"); */
				// 如果返回的值是success则正确
				if (resultCode.equals("success")) {
					JSONArray resultJsonArray = jsonObject.getJSONArray("pro");
					// 遍历
					for (int i = 0; i < resultJsonArray.length(); i++) {
						object = resultJsonArray.getJSONObject(i);

						Product pro = new Product();

						try {
							String title = object.getString("title");
							String desc = object.getString("desc");
							double price = object.getDouble("price");
							// 存入map
							String image = object.getString("image");
							pro.setTitle(title);
							pro.setPrice(price);
							pro.setDesc(desc);
							pro.setImage(image);
							// ArrayList集合
							list.add(pro);

						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

					/*
					 * Message message = new Message(); message.what = 1;
					 * handler.sendMessage(message);
					 */
				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

		} else {
			Toast.makeText(MainActivity.this, "wanglv", Toast.LENGTH_SHORT).show();
		}

	}
}
