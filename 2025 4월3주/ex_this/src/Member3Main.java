public class Member3Main {
    public static void main(String[] args) {
        Member3 m1=new Member3("악동클럽","010-2222-3333","음악동");
        Member3 m2=new Member3();
        m1.print();
        m2.setName("가나다");
        m2.setTel("010-3332-6664");
        m2.setAddress("한동");
        m2.print();
        Member3 m3=new Member3();
        //m3.Name("1"); 오류
        m3.print();

    }
}

class Test{
    int no1;
    int no2;
    int result;

    Test(){
        this(1,2);
    }
    Test(int no1,int no2){
        this.no1=no1;
        this.no2=no2;
    }
}

