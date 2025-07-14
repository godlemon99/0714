public class Main {
    public static void main(String[] args) {
        Student s=new Student();
    }
}

class Animal{
    private int no;


    public Animal(int no){
        this.no=no;
    }

    public Animal(){

    }
}

class Person extends Animal{
    private String num1;
    private String num2;
    private String name;
    private String dept;
    private String address;

    public Person(String num1,String num2,String name,String dept,String address){
        this.num1=num1;
        this.num2=num2;
        this.name=name;
        this.dept=dept;
        this.address=address;
    }

    public Person(){

    }

}

class Student extends Person{
    private String[] subjects;
    void setSubjects(String[] subjects){
        this.subjects=subjects;
    }

    String getSubjects() {
        return subjects[0];
    }
}

class Professor extends Person{
    private String[] subjects;
}

class Staff extends Person{
    private String job;
}