package com.bilkentazure.evenu.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bilkentazure.evenu.R;


public class ListFragment extends Fragment {


	public ListFragment() {
		// Required empty public constructor
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_list, container, false);
		return view;
	}
	

}