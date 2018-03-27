package com.bilkentazure.evenu;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bilkentazure.evenu.adapters.SliderAdapter;


/**
 * Created by azizutku on 20.03.2018.
 */
public class MainActivity extends AppCompatActivity {

	private ViewPager mViewPager;
	private LinearLayout mLinear;
	private SliderAdapter mSliderAdapter;
	private TextView[] mTxtDots;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mViewPager = findViewById(R.id.main_slide_viewpager);
		mLinear = findViewById(R.id.main_linear);

		mSliderAdapter = new SliderAdapter(this);
		mViewPager.setAdapter(mSliderAdapter);

		addDotsIndicator(0);

		mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {
				addDotsIndicator(position);
			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});

	}

	public void addDotsIndicator(int position){

		mTxtDots = new TextView[mSliderAdapter.getCount()];
		mLinear.removeAllViews();

		for( int i = 0; i < mTxtDots.length; i++){

			mTxtDots[i] = new TextView( this);
			mTxtDots[i].setText("•");
			mTxtDots[i].setTextSize(35);

			if(i == position){
				mTxtDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
				mTxtDots[position].setTextSize(45);
			} else {
				mTxtDots[i].setTextColor(getResources().getColor(R.color.colorUnselectedDot));
			}

			mLinear.addView(mTxtDots[i]);

		}

	}


}
