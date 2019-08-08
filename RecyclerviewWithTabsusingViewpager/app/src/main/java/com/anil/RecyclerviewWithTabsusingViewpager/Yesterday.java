package com.anil.RecyclerviewWithTabsusingViewpager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.anil.RecyclerviewWithTabsusingViewpager.R;

import java.util.ArrayList;
import java.util.List;

public class Yesterday extends Fragment {
    RecyclerView student_rview;
    List<Student> list_student;
    RVAdapter rvAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_yesterday, container, false);
        loadStudent();
        student_rview = (RecyclerView) view.findViewById(R.id.recyclerview);

        rvAdapter = new RVAdapter(getActivity(), list_student);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        student_rview.setLayoutManager(layoutManager);
        student_rview.setAdapter(rvAdapter);

        return view;
    }

    void loadStudent() {
        list_student = new ArrayList<>();
        list_student.add(new Student("Adi Reddy", "S.G.Palli"));
        list_student.add(new Student("N.Swamy", "S.G.Palli"));
        list_student.add(new Student("Sriram", "S.G.Palli"));
        list_student.add(new Student("Ram", "S.G.Palli"));

//        rvAdapter.notifyDataSetChanged();

    }
}

