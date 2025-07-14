public class Sample4 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2=new A(10);
    }
}

class A{
    int q=0;
    A()
    {
        System.out.println("인수 0의 생성자입니다.");
    }
    A(int a){
        this();
        System.out.println("인수 1의 생성자입니다.");
    }
    void qq(int q){
        this.q=q;
    }
}