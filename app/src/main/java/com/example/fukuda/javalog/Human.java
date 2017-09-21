package com.example.fukuda.javalog;

/**
 * Created by fukuda on 2017/09/20.
 */

import android.util.Log;

//humanへ抽象Animal継承、interface thinkableの挿入　
class Human extends Animal implements Thinkable{


 //コンストラクタ
 public Human(String name, int age){
     this.name = name;
     this.age = age;
 }
 //メンバ変数
 String  hobby;

    // メンバ関数
    //私の名前は～～です。年は～～歳です。
    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です。年は" + this.age +"歳です。");
    }
    @Override
    public void think(){
        Log.d("javatest", "私は" + hobby + "について考える");
        }
        }

