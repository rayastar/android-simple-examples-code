package android.anil.com.recyclerviewwithanimations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<Employee> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        createemplist();
        recyclerAdapter=new RecyclerAdapter(list,MainActivity.this);
        recyclerView.setAdapter(recyclerAdapter);



    }
    private void createemplist(){
        list=new ArrayList<>();
        list.add(new Employee("Anil","Tadipatri"));
        list.add(new Employee("Jayachandra","Srikalahasti"));
        list.add(new Employee("Aswartha","Jammalamadugu"));
        list.add(new Employee("Ashraff","Rayachoti"));
        list.add(new Employee("Mohan","Pileru"));
        list.add(new Employee("Kishore","Rajampeta"));
        list.add(new Employee("TulasiRam","Pulivendula"));
        list.add(new Employee("Mahendra","Kadapa"));
        list.add(new Employee("Venkatesh","Kurnool"));
        list.add(new Employee("Veera","Tadipatri"));
        list.add(new Employee("Sudhakar","Ananthapur"));
        list.add(new Employee("SurendraBabu","Ananthapur"));
    }
}

