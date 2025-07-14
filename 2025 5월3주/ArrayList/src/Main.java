import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> family=new ArrayList<>();
        family.add("Kim");
        family.add("Lee");
        family.add("Kang");
        family.add("Kyu");

        family.add("6");
        for(int i=0;i<family.size();i++){
            String str3=family.get(i);
            System.out.println(str3);
        }
        String str=family.get(3);
        System.out.println(str);

    }
}