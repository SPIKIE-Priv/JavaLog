package jp.techacademy.rie.kawagoe.javalog;

/**
 * Created by Rie on 2017-10-11.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "犬";

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}