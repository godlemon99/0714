public class Main {
    public static void main(String[] args) {
        GrandParent ga=new Child();
        Parent pa=new Child();
        ga.print();
    }
}

abstract class GrandParent{

    protected String name="";
    protected int age=0;

    GrandParent(){
        System.out.println("GrandParent생성자");
    }
    public abstract void print();
}

abstract class Parent extends GrandParent{

    Parent(){
        System.out.println("Parent생성자");
    }
    public void print(){
        System.out.println("33");
    }
}

class Child extends Parent{

    Child(){
        System.out.println("Child생성자");
    }

    public void print(){
        System.out.println("44");
    }

    public void parentPrint(){
        print();
    }
}