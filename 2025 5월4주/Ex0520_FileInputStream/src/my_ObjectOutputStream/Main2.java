package my_ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args){
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person(1,"고길동","도봉구"));
        list.add(new Person(1,"고철수","도봉구"));
        list.add(new Person(1,"고영희","도봉구"));
        try{
            FileOutputStream fos = new FileOutputStream("src/my_ObjectOutputStream/result.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            oos.close();
            fos.close();
        }
        catch(IOException | SecurityException e)
        {
            System.out.println(e.getMessage());
        }

        String path="src/my_ObjectOutputStream/result.dat";

        try{
            FileInputStream fis= new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Person> result=(ArrayList<Person>)ois.readObject();

            for(Person p: result){
                System.out.println(p.name);
            }
            ois.close();
            fis.close();

        }catch(FileNotFoundException e){
            throw new RuntimeException();
        }
        catch(ClassNotFoundException e){
            throw new RuntimeException();
        }catch(IOException e){
            throw new RuntimeException();
        }

    }
}

class Person implements Serializable{
    int no;
    String name;
    String addr;
    Person(){}

    Person(int no, String name,String addr){
        this.no=no;
        this.name=name;
        this.addr=addr;
    }
}