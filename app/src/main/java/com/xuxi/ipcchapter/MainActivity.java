package com.xuxi.ipcchapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.xuxi.ipcchapter.model.User;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "sUserId: " + UserManager.sUserId);
        UserManager.sUserId = 2;
        Log.d(TAG, "sUserId: " + UserManager.sUserId);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1 = new Intent(this,ThirdActivity.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                break;

                default:
                    break;
        }
    }


}
