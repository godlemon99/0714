import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet setA=new HashSet();
        setA.add("aaaa");
        setA.add("bbb");
        setA.add("cc");
        setA.add("dddd");
        setA.add("eeeeee");
        setA.add("fffff");
        setA.add("g");
        setA.add("hh");
        System.out.println(setA.toString());
        System.out.println("---");
        Iterator data=setA.iterator();
        while(data.hasNext()){
            String str=(String)data.next();
            System.out.println(str);
        }
        System.out.println("---");

        HashSet setB=new HashSet();
        setB.add("aaaa");
        setB.add("bbbb");
        setB.add("cc");
        setB.add("ddd");
        setB.add("eeeee");
        setB.add("f");
        setB.add("gggg");
        System.out.println(setB);

        //합집합
        //setA.addAll(setB);

        //교집합
        //setA.retainAll(setB);

        //차집합
        //setA.removeAll(setB);
        //System.out.println(setA);

        System.out.println("---");
        Object[] str=setB.toArray();
        for (Object o : str) {
            System.out.println(o);
        }
        System.out.println("---");

        TreeSet lotto=new TreeSet();
        while(lotto.size()<6){
            int num=(int)(Math.random()*45)+1;
            lotto.add(num);
            System.out.println(num);
        }

        System.out.println(lotto);


    }


}