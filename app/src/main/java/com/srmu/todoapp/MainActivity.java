package com.srmu.todoapp;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //declare the fields for ui widgets
    Button btn_AddTask,btn_EditTask,btn_ViewTask,btn_DeleteTask;
    EditText et_TaskName,et_TaskDesc;
    TextView tv_todo;

    SQLiteDatabase sd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //To Create or Open the database
        sd = openOrCreateDatabase("srmu",0,null);
        //To Open or create table in database
        String createQuery = "CREATE TABLE IF NOT EXISTS todo (TaskName text,TaskDesc text)";
        //To execute the SQL query
        sd.execSQL(createQuery);

        //remove view compact to remove padding restriction
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/


        //initialize the fields from UI widgets
        btn_AddTask = findViewById(R.id.btn_AddTask);
        btn_EditTask = findViewById(R.id.btn_EditTask);
        btn_ViewTask = findViewById(R.id.btn_ViewTask);
        btn_DeleteTask = findViewById(R.id.btn_DeleteTask);
        et_TaskName = findViewById(R.id.et_TaskName);
        et_TaskDesc = findViewById(R.id.et_TaskDesc);
        tv_todo = findViewById(R.id.tv_todo);

        //to click on the add, view, delete, button
        btn_AddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the todo table data into string object
                String TaskName = et_TaskName.getText().toString();
                String TaskDesc = et_TaskDesc.getText().toString();
                //insert add task
                String insertTask = "INSERT INTO todo VALUES ('"+TaskName+"','"+TaskDesc+"')";
                //to execute SQL query
                sd.execSQL(insertTask);
                Toast.makeText(MainActivity.this,
                        "Task Added", Toast.LENGTH_SHORT).show();
                //To clear form
                et_TaskName.setText("");
                et_TaskDesc.setText(""); //empty string == cleared data


            }
        });
        btn_EditTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edit task
                Intent play = new Intent(
                        MainActivity.this,MyService.class
                );
                startService(play);
            }
        });
        btn_DeleteTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //delete task
                
            }
        });
        btn_ViewTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //view task
                //view the data
                Cursor cursor = sd.rawQuery("SELECT * FROM todo",null);
                //To pass the data into TextView
                //Since data length is unknown hence while loop is used
                while (cursor.moveToNext())
                {
                    //to append the todo data into text view
                    tv_todo.append(cursor.getString(0)+'\n'+cursor.getString(1)+'\n');
                }
            }
        });
    }
}