package com.example.fukuda.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; //追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Human human = new Human("福田", 3);


        human.say();
        //Log.d("javatest","私の名前は" + human.name + "です。年は" + human.age +"歳です。");

        human.hobby = "java";

        human.think();
        //Log.d("javatest", "私は" + human.hobby + "について考える");
    }
    }