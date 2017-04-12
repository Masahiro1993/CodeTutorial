package com.mikesh.hp.codetutorial.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikesh.hp.codetutorial.R;
import com.mikesh.hp.codetutorial.models.MainViewModel;

import java.util.ArrayList;

/**
 * Created by HP on 08-Apr-17.
 */

public class CustomAdapter<M> extends ArrayAdapter<MainViewModel> {

    Context context;
    ArrayList<MainViewModel> mainViewModel;
    LayoutInflater inflater;



    public CustomAdapter(Context context, int resources, ArrayList<MainViewModel> mainViewModel){
        super(context, resources, mainViewModel);
        this.context= context;
        this.mainViewModel= mainViewModel;



    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.singlelayout, parent, false);

        ImageView image= (ImageView)v.findViewById(R.id.gridimageview);
        TextView gridText= (TextView)v.findViewById(R.id.gridtext);
        MainViewModel mainViewModel1 = this.mainViewModel.get(position);
        image.setImageResource(((mainViewModel1.getGridimage())));
        gridText.setText(mainViewModel1.getCourses());
        return v;}
}
