package test2;

public class ExceptionMain {

    static void method2(){


        int a=4/0;
    }
    static void method1(){

        method2();
    }
    public static void main(String[] args){


        method1();
    }

}

