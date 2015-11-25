package com.tz.viewpagedemo;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 
 * @author TianZhao
 * Time 2015Äê11ÔÂ26ÈÕ
 * xiyouMobile
 */
public class MainActivity extends Activity {

	private CustomerViewPage viewPage;
	private List<View> views;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewPage = (CustomerViewPage) findViewById(R.id.vp);
		initViews();
		viewPage.setViewPageViews(views);
	}

	private void initViews() {
		views = new ArrayList<>();
		ImageView imageView1 = new ImageView(this);
		ImageView imageView2 = new ImageView(this);
		ImageView imageView3 = new ImageView(this);
		ImageView imageView4 = new ImageView(this);
		ImageView imageView5 = new ImageView(this);
		imageView1.setBackgroundColor(Color.parseColor("#123456"));
		views.add(imageView1);
		imageView2.setBackgroundColor(Color.parseColor("#145826"));
		views.add(imageView2);
		imageView3.setBackgroundColor(Color.parseColor("#874592"));
		views.add(imageView3);
		imageView4.setBackgroundColor(Color.parseColor("#658415"));
		views.add(imageView4);
		imageView5.setBackgroundColor(Color.parseColor("#845163"));
		views.add(imageView5);
	}
}
