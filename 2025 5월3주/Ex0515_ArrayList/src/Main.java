import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("수박");
        list.add("바나나");
        list.add("사과");
        list.add("오렌지");
        list.add("5");
        System.out.println(list);
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("---------");

        ArrayList<Object> list2=new ArrayList<>();
        list2.add("고길동");
        list2.add(10);
        list2.add("010-2311-1311");
        list2.add("01772");
        for (Object o : list2) {
            System.out.println(o);
        }
        System.out.println("---------");

        ArrayList<Float> list3=new ArrayList<>();
        list3.add(3.14f);
        list3.add(2.71f);
        Iterator<Float> iter3=list3.iterator();
        while(iter3.hasNext()){
            float f=iter3.next();
            System.out.println(f);
        }
        System.out.println("---------");

        ArrayList<Integer> list4=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list4.add(5*i);
        }
        Iterator<Integer> iter4=list4.iterator();
        for(int i=0;i<list4.size();i++){
            System.out.println(iter4.next());
        }

        ArrayList<Person> al = new ArrayList<>();
        Person p=new Person();
        al.add(p);
        Person p10=new Person(1,"홍길동",35,"노원구 중계동");
        al.add(p10);

        for (Person person : al) {
            System.out.println("no : " + person.getNo());
            System.out.println("name : " + person.getName());
            System.out.println("age : " + person.getAge());
            System.out.println("address : " + person.getAddress());
            System.out.println("----------------------");
        }
    }
}

class Person{
    int no;
    String name;
    int age;
    String address;

    Person(){}

    Person(int no, String name,int age, String address){
        this.no=no;
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void setNo(int no){
        this.no=no;
    }
    int getNo(){
        return no;
    }

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }

    void setAge(int age){
        this.age=age;
    }

    int getAge(){
        return age;
    }

    void setAddress(String address){
        this.address=address;
    }

    String getAddress(){
        return address;
    }

}