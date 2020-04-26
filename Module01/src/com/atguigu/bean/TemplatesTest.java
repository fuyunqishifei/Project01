package com.atguigu.bean;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: LHF
 * Date: 2020/4/26 0026
 * Time: 上午 8:46
 *
 * 1、IDEA中代码模板所处的的位置：settings - Editor - Live Templates / Postfix Completion
 * 2、常用模板
 */
public class TemplatesTest {

    //模板六：prsf：可生成 private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";


    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv /xxx.sout
        System.out.println("args = [" + args + "]");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);

        System.out.println(num1);

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(345);
        integers.add(456);
        for (Integer integer : integers) {

        }
        //变形：list.fori
        for (int i = 0; i < integers.size(); i++) {

        }
        //变形：list.forr 倒序遍历
        for (int i = integers.size() - 1; i >= 0; i--) {

        }
    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模板五：ifn
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(345);
        integers.add(456);
        if (integers == null) {

        }
        //变形：inn
        if (integers != null) {

        }
        //变形：xxx.nn / xxx.null
        if (integers == null) {

        }
        if (integers != null) {

        }
    }
}
