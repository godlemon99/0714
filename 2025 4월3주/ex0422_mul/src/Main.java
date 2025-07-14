public class Main {
    public static void main(String[] args) {
        Parent P=new Parent();
        P.age=10;
        a A=new a();
        A.age=44;
    }
}

class GrandParent
{
    String name;
    int age;
    GrandParent(){

    }

}

class Parent extends GrandParent
{
    String job;
    int age;
    Parent(){
        //super();
    }
}

class a extends GrandParent{

    a(){
        //super();
    }
}