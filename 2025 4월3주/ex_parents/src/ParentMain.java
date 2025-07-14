public class ParentMain {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.name="부모";
        p.age=50;
        p.setMoney(1000000);
        p.printParentInfo();
        System.out.println(p.getMoney());
        System.out.println("---------------");

        Child c=new Child();
        c.name="자식";
        c.age=200;
        c.setHobby("기타");
        c.printParentInfo();
        c.printInfo();

        Professor pf=new Professor("iot과");

    }
}

class Parent{
    public String name;
    protected int age;
    private int money;

    Parent(){
        System.out.println("Parent 생성자");
    }

    void printParentInfo(){
        System.out.println("printParentInfo()호출");
        System.out.println(name);
        System.out.println(age);
    }

    void setMoney(int money){
        this.money=money;
    }
    int getMoney(){
        return money;
    }

}

class Child extends Parent{
    private String hobby;

    Child(){
        System.out.println("Child 생성자");
    }
    void printInfo(){
        System.out.println("printInfo()호출");
        System.out.println(name);
        System.out.println(age);
        System.out.println(getMoney());
        System.out.println(hobby);
    }

    void setHobby(String hobby){
        this.hobby=hobby;
    }
    String getHobby(){
        return hobby;
    }

}

class Person{
    String name;
    int no;
    Person(){

    }
    Person(String name){
        this.name=name;
    }
}

class Professor extends Person{
    String dept;
    int no;
    Professor(String dept){
        super();
        this.dept=dept;
        super.no=10;
    }
}