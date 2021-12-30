package com.skillfactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

/*
        long l = 9_123_123_123_123_123L;
        char c1 = '\u2622';
        char c2 = 'c';
        char c3 = 42;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        float f = 123.2f;
        double d = 123.2;
        int a = 100;
        int b = 3;
        if(a<b){
            int c=22;
        }else if(a==b){
            int c = 242;
        } else {
            int c = 212;
        }
        */
        int a = 34;
        int b = 34;

        while (a<b)
            System.out.println("a= " + a++);


        do
            System.out.println("a= " + a++);
        while (a<b);
        int l = switch (a){
            case 1:
                yield 22;
            case 2:
                yield 23;
            default:
                yield 0;

        };
        System.out.println(b);
        int[] arr = {1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};
        int[] arr3 = new int[20];


        switch (a){
            case 1:
            case 20:
                System.out.println("20");
                System.out.println("20");
                System.out.println("20");
                System.out.println("20");
                break;
            default:
                System.out.println("default");
                System.out.println("default");
                System.out.println("default");
                System.out.println("default");
                break;
        }
      System.out.println(a);

        boolean b2 = ((a > 0) && (a < 100));
        a*=20;
        System.out.println(a);
        b = 3;
        if(a>100){
            System.out.println("Bigger");
        } else if(a==100){
            System.out.println("Equal");
        } else {
            System.out.println("Lower");
        }
        int c = a%b;
        System.out.println(b++);
        System.out.println(++b);


        System.out.println(Arrays.toString(arr));
        arr = new int[2];
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));
        ArrayList<String> k = new ArrayList<>();
        k.add("ssss");
        for (String s : k){

        }

        System.out.println(arr.length);

        arr[0] =2;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }

        for (int j: arr) {
            System.out.println(j);
        }

        byte b1 = 22;

        byte b3 = (byte)127;

        System.out.println(b1);

        System.out.println(b3);

        int[] arr1 = {1,2,3,4,5};
        for (int i = arr1.length-1; i >=0 ; i--) {

            if (arr1[i]==3)
                continue;

            System.out.println(arr1[i]);
        }

        for (int j : arr1) {
            System.out.println(j);
        }



        String str = "dsfsdf";
        String str2 = new String("dsfsdf");
        System.out.println(str);
        System.out.println(str2);

        str2 = str2.intern();


        if(str == str2)
            System.out.println("==");
        if(str.equals(str2))
            System.out.println("equals");
        if(str == "dsfsdf")
            System.out.println("==\"dsfsdf\"");


    }
}
