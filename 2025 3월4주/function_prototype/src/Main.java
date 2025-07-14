class Main {
    public static void main(String[] args) {
        myPrint("고길동");
        myPrint("홍길동");
        int age=33;
        System.out.println("당신의 나이 : "+yourPrint(age));
        int num1=10;
        int num2=5;
        System.out.println(add(num1,num2));
        System.out.println(minus(num1,num2));
        System.out.println(mul(num1,num2));
        System.out.println(divide(num1,num2));
    }

     static void myPrint(String name){ //myPrint 정의
         for(int i=0;i<5;i++){
             System.out.println(name+i);
         }
    }

    static int yourPrint(int age){
        return age;
    }

    static int add(int num1, int num2){
        return num1+num2;
    }

    static int minus(int num1,int num2){
        return num1-num2;
    }

    static int mul(int num1,int num2){
        return num1*num2;
    }

    static int divide(int num1, int num2){
        return num1/num2;
    }
}