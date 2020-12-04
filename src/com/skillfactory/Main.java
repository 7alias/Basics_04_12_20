package com.skillfactory;

public class Main {

    public static void main(String[] args) {
	// write your code here

        long l = 9_123_123_123_123_123L;
        char c1 = '\u2622';
        char c2 = 'c';
        char c3 = 42;
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
        float f = 123.2f;
        double d = 123.2;
//        int a = 100;
//        int b = 3;
//        if(a<b){
//            int c=22;
//        }else if(a==b){
//            int c = 242;
//        } else {
//            int c = 212;
//        }
        int a = 1;
        int b = switch (a){
            case 1:
                yield 22;
            case 2:
                yield 23;
            default:
                yield 0;

        };
        System.out.println(b);

//        switch (a){
//            case 1:
//            case 20:
//                System.out.println("20");
//                System.out.println("20");
//                System.out.println("20");
//                System.out.println("20");
//                break;
//            default:
//                System.out.println("default");
//                System.out.println("default");
//                System.out.println("default");
//                System.out.println("default");
//                break;
//        }
//      System.out.println(c);

//        boolean b2 = ((a > 0) && (a < 100));
//        a*=20;
//        System.out.println(a);
//        int b = 3;
//        if(a>100){
//            System.out.println("Bigger");
//        } else if(a==100){
//            System.out.println("Equal");
//        } else {
//            System.out.println("Lower");
//        }
//        int c = a%b;
//        System.out.println(b++);
//        System.out.println(++b);


//        byte b1 = 22;
//        byte b2 = 129;
//        byte b3 = (byte)127;

//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(b3);

    }
}
