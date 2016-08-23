package com.hfad.recycleviewer.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.recycleviewer.R;
import com.hfad.recycleviewer.Student.Student;
import com.hfad.recycleviewer.interfaces.OnItemCliclListner;

import java.util.ArrayList;

/**
 * Created by user on 8/21/2016.
 */
public class StudentRVAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    Context context;
    ArrayList<Student> studentArrayList;

    OnItemCliclListner onItemCliclListner;

    public StudentRVAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.studentArrayList = students;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.rv_student_item, null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, final int position) {
        final Student student = studentArrayList.get(position);
        holder.txtName.setText(student.getName());
        holder.txtAge.setText(student.getAge() + "");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemCliclListner.onRVItemClick(student, position);
            }
        });
        holder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemCliclListner.onCheckBOxClick();
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }


    public void setItemClickListner(OnItemCliclListner onItemCliclListner) {
        this.onItemCliclListner = onItemCliclListner;
    }
}
