package com.anil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anil.recyclerviewradiobuttonandroidtutorial.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview_demo)
    RecyclerView recyclerviewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadStudentInformation();
    }

    private void loadStudentInformation() {
        StudentAdapter studentAdapter = new StudentAdapter(MainActivity.this, Utils.loadStudentData());
        recyclerviewDemo.setLayoutManager(new LinearLayoutManager(this));
        recyclerviewDemo.setAdapter(studentAdapter);
    }
}
