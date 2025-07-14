package db.object;

class test3 {
    void print(){
        test2 t2=new test2();
        t2.a=10;
        t2.b=30; //같은 패키지이므로 사용가능, 다른 패키지라면 상속관계가 있어야함
        t2.c=50; //같은 패키지이므로 사용가능
        //t2.d=70; 같은 패키지여도 사용불가능

        test2_sub t2_sub=new test2_sub();
    }
}
