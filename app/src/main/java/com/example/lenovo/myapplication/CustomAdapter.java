package com.example.lenovo.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 08-Dec-17.
 */

public class CustomAdapter extends BaseAdapter implements View.OnClickListener {
    private Activity activity;
    private ArrayList data;
    private TaskClass tempValues;
    private static LayoutInflater layoutInflater =null;
    public Resources res;

        public CustomAdapter(Activity a, ArrayList d, Resources r){
            this.activity =a;
            this.data =d;
            this.res =r;
            layoutInflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        }


    @Override
    public int getCount() {
        if(data.size()<=0)
            return 1;
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public void onClick(View v) {
        Log.v("HHH","hahaH");

    }

    public static class ViewHolder{
        public TextView title;
        public TextView time;

    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;
        if(convertView==null){
            vi = layoutInflater.inflate(R.layout.row,null);
            holder = new ViewHolder();
            holder.title = (TextView)vi.findViewById(R.id.text1);
            holder.time = (TextView)vi.findViewById(R.id.text2);
            vi.setTag(holder);

        }
        else
            holder = (ViewHolder)vi.getTag();
        if(data.size()<=0){
            holder.title.setText("No Data");
        }
        else {
            tempValues = null;
            tempValues = ( TaskClass ) data.get( position );

            /************  Set Model values in Holder elements ***********/

            holder.title.setText(tempValues.getTitle());
            holder.time.setText( tempValues.getTime() );
            vi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.v("Here","hrhr");
                }
            });
        }

        return vi;
    }
}
