public class PersonMain {
    public static void main(String[] args) {

        Person Hong=new Person();
        Hong.input("홍길동",20,"서울");
        Person.countPerson++;

        Person Lee=new Person();
        Lee.input("이몽룡",30,"제천");
        Person.countPerson++;

        Person Sung=new Person();
        Sung.input("성춘향",40,"인천");
        Person.countPerson++;

        Hong.printInstance();

        Person.print();
        Hong.print();
    }
}

class Person{
    static int countPerson;
    static String name;
    static int age;
    static String address;

    Person(){

    }

    void input(String _name, int _age, String _address){
        name=_name;
        age=_age;
        address=_address;
    }

    static void print(){
        System.out.println(countPerson+"\t"+name+"\t"+age+"\t"+address);
        printInstance();
    }

    static void printInstance(){
        System.out.println(name);
    }

}