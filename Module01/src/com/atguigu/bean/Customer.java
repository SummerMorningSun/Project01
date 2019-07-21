package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;

/**
 * 你好这这是多行注释
 */
public class Customer {

    public static final String NAME = "asdf";

    public static final Customer c = new Customer();

    private static final int KKKKK = 9;

    private static final int IIIIIIII = 10;

    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList list = new ArrayList();
 
        ArrayList arr1 = new ArrayList();

        list.add(2);

        Date date = new Date();

        ArrayList<Object> objects = new ArrayList<>();

        System.out.println(""+args);

        System.out.println("Customer.main");
        System.out.println("args = [" + args + "]");
        System.out.println("objects = " + objects);

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }
        //iter
        for (Object object : objects) {

        }
        //itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr  逆序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //ifn
        if (objects == null) {

        }

        //inn
        if (objects != null) {

        }

        //inst
        if (objects instanceof Object) {
            Object o = (Object) objects;

        }

        //xxx.null
        if (arr1 == null) {

        }

    }



    public void method() {

    }

    /**
     *
     */
    public void hello() {

    }

}
