package com.example.fukuda.javalog;

/**
 * Created by fukuda on 2017/09/19.
 */

import android.util.Log;

class BigDog extends Dog {
    //クラス変数
    static String to_jp  = "大型犬";

    public BigDog(String name, int age){
        super(name,age);
    }
    //クラス関数
    public static void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
