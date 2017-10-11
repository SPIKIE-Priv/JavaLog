package jp.techacademy.rie.kawagoe.javalog;

/**
 * Created by Rie on 2017-10-11.
 */

abstract class Animal {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String hobby;

    abstract public void say();
}