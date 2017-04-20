package com.mikesh.hp.codetutorial.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.mikesh.hp.codetutorial.R;
import com.mikesh.hp.codetutorial.adapters.CustomAdapter;
import com.mikesh.hp.codetutorial.models.MainViewModel;

import java.util.ArrayList;


public class CourseFragment extends Fragment {


    String Courses[];
    int gridimages[];
    public CourseFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_course, container, false);

        Courses = getResources().getStringArray(R.array.courses);
        gridimages = getResources().getIntArray(R.array.Gridimage);

        ArrayList<MainViewModel> arrayModel = new ArrayList<MainViewModel>();

        for(int i=0; i<Courses.length;i++) {
            MainViewModel mainviewmodel = new MainViewModel();
            mainviewmodel.setCourses(Courses[i]);
            mainviewmodel.setGridimage(gridimages[i]);
            arrayModel.add(mainviewmodel);
        }



        GridView gridView = (GridView)v.findViewById(R.id.gridview1);
        CustomAdapter cad = new CustomAdapter(getActivity().getApplicationContext(),R.layout.singlelayout,arrayModel);
        gridView.setAdapter(cad);

        return v;
    }
}
