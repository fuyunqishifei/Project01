package com.atguigu.bean;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: LHF
 * Date: 2020/4/25 0025
 * Time: 下午 9:33
 * Description: No Description
 */
public class Customer extends Person {

    public static void main(String[] args) {
        soutttt();
    }

    public static void soutttt() {
        System.out.println("helloworld!!!");
    }

    public void eat() {
        System.out.println("客户吃饭");
    }

    public static void method1(){
        try {
            System.out.println("helloworld!!!");
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




}
