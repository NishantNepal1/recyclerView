package com.hfad.recycleviewer;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.hfad.recycleviewer.Student.Student;
import com.hfad.recycleviewer.adapter.DividerItemDecoration;
import com.hfad.recycleviewer.adapter.StudentRVAdapter;
import com.hfad.recycleviewer.interfaces.OnItemCliclListner;

import java.util.ArrayList;

public class RecycleViewExampleActivity extends AppCompatActivity implements OnItemCliclListner {

    RecyclerView rvListview;
    StudentRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_);
        init();


    }

    private void init() {
        rvListview = (RecyclerView) findViewById(R.id.rvStudent);
        rvListview.setLayoutManager(new LinearLayoutManager(this));
        rvListview.addItemDecoration(new DividerItemDecoration(ContextCompat.getDrawable(this, R.drawable.dividerlist)));
        ArrayList<Student> list = getDummyData();
        adapter = new StudentRVAdapter(this, list);
        adapter.setItemClickListner(this);
        rvListview.setAdapter(adapter);

    }


    private ArrayList<Student> getDummyData() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("A", 13));
        list.add(new Student("B", 14));
        list.add(new Student("C", 15));

        return list;
    }

    @Override
    public void onRVItemClick(Student student, int pos) {

        Toast.makeText(RecycleViewExampleActivity.this, student.getName(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCheckBOxClick() {
        Toast.makeText(RecycleViewExampleActivity.this, "CheckBox clicked", Toast.LENGTH_SHORT).show();

    }
}
