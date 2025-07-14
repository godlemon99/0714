public class Main {
    public static void main(String[] args) {
        IOT iot=new IOT();
        iot.test1();
        iot.test2();
        System.out.println(A.x+ B.y);
        A iot2=new IOT();
        int data=iot2.x;
        B iot3=new IOT();
        System.out.println(iot2.x+iot3.y);
        iot2.print("ㅇㅇㅇ");
        iot3.print("ㅁㅁㅁ");
    }
}

interface A extends C{
    int x=10;       //public static final int x=10; 상수
                    //메소드에 final 오버라이딩 안됨.
                    //클래스에 final 상속 안됨.
    void test1();   //public abstract void test1();
}
interface B extends C {
    int y=20;       //public static final int y=20;
    void test2();   //public abstract void test2();

}

interface C{
    int data=12314345;
    void print(String str);
}

class IOT implements A, B {
    int iot;
    public void test1(){
        System.out.println("IOT1");
    }
    public void test2(){
        System.out.println("IOT2");
    }
    public void print(String str){
        System.out.println("print "+str);
    }

}