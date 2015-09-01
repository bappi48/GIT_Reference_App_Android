package com.bappi.gitreference;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListView extends BaseAdapter {
	Context mContext;
	LayoutInflater mLayoutInflater;
	String[] list_data;
	
	CustomListView(Context context){
		mContext = context;
		mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		list_data = mContext.getResources().getStringArray(R.array.git_full_list);	
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list_data.length/2;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	public class Holder{
		TextView txtCommand;
		TextView txtCommandExplanation;
	}
	
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		Holder mHolder = new Holder();
		View mView = mLayoutInflater.inflate(R.layout.git_each_item_view, null);
		
		mHolder.txtCommand = (TextView) mView.findViewById(R.id.git_command);
		mHolder.txtCommandExplanation = (TextView) mView.findViewById(R.id.git_command_explanation);
		
		mHolder.txtCommand.setText(list_data[position]);
		mHolder.txtCommandExplanation.setText(list_data[position+1]);
		
		return mView;
	}

}
