package com.example.lenovo.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ListView list;
    CustomAdapter adapter;
    public MainActivity customlistview;


    public ArrayList<TaskClass> listArr = new ArrayList<TaskClass>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customlistview = this;
        TaskClass t1 = new TaskClass("yoga","vv");
        listArr.add(t1);
        TaskClass t2 = new TaskClass("Medicine","vv");
        listArr.add(t2);
        Resources res = getResources();
        list = (ListView)findViewById(R.id.list);
        adapter = new CustomAdapter(this,listArr,res);
        list.setAdapter(adapter);
       /* button = (Button)findViewById(R.id.fab);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               newTask();
            }
        });*/


    }

    public void newTask(View view){

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.fragment);
        dialog.setTitle("Hello");
        dialog.show();
    }
}
