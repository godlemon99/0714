package db.object;

public class test2 {
    public int a; // 다른 패키지에서도 사용가능
    protected int b; // 상속 패키지에서 사용가능
    int c; // 같은 패키지에서만 사용가능
    private int d; // 이 클래스에서만 사용가능
    {d=2;}

    public void print1(){}
    private void print2(){}
    void print3(){}
    private void print4(){}
}

class test2_sub{ // 같은 패키지인 test3에서도 사용가능

}
