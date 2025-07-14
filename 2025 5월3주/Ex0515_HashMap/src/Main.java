import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        HashMap<String,Object> map=new HashMap<>();
//        map.put("id",1);
//        map.put("name","도우너");
//        map.put("address","노원구");
//        map.put("address","성북구");
//        System.out.println(map);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.get("name"));
//
//        Object[] o=map.keySet().toArray();
//        System.out.println("---------------");

        HashMap<String,String> map2=new HashMap<>();
        map2.put("학과명","IOT");
        map2.put("학년","3학년");
        map2.put("이름","홍길동");

        Iterator<String> iter=map2.keySet().iterator();
        while(iter.hasNext()){
            System.out.println(map2.get(iter.next()));
        }

        String key,value;
        System.out.println("iterator를 key에 연결");
        Iterator<String> keyIterator=map2.keySet().iterator();
        while(keyIterator.hasNext()){
            key=keyIterator.next();
            value=map2.get(key);
            System.out.println(key+" : "+value);
        }

//        System.out.println("iterator를 value에 연결");
//        Iterator<String> valueIterator=map2.values().iterator();
//        while(valueIterator.hasNext()){
//            System.out.println(valueIterator.next());
//        }

        System.out.println("---------------");

        Object[] a=map2.keySet().toArray();
        Object[] b=map2.values().toArray();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" : "+b[i]);
        }

        System.out.println("---------------");

        HashMap[] map3 = new HashMap[2];
//        map3[0]=new HashMap<String,String>();
        map3[0].put("학과명","IOT");
        map3[0].put("학년","3학년");
        map3[0].put("이름","고길동");
        System.out.println("---------------");
//        map3[1]=new HashMap<String,String>();
        map3[1].put("학과명","IOT");
        map3[1].put("학년","2학년");
        map3[1].put("이름","박길동");
//        b=map3[0].values().toArray();
        System.out.println(map3.length);
        for(int i=0;i<map3.length;i++){
//            System.out.println(map3[i].keySet()+" : ");
            Object[] s=map3[i].keySet().toArray();

            for(int j=0;j<s.length;j++){
                Object value2=map3[i].get(s[j]);
                System.out.println(s[j]+" : "+value2);
            }
        }
//        map3[0].get("학과명");
//        map3[0].get("학년");
//        map3[0].get("이름");
//
//        System.out.println("---------------");

    }
}