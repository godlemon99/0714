public class Main {
    public static void main(String[] args) {
        String str1="iot";

        String str2=new String("iot");
        char[] arr={'i','o','t'};
        String str3=new String(arr);
        System.out.println(str3);

        String str4=new String();
        System.out.println("--"+str4+"--");
        String str5=" program";

        int strlen=str1.length();
        System.out.println(strlen);
        String str6=str2.concat(str5); // "iot program"
        System.out.println(str6);
        String str7=str6.substring(7);
        System.out.println(str7);
        String str8=" "+str6.concat(" ");
        System.out.println(str8);
        String str9=str8.trim();
        System.out.println(str9);

        System.out.println("---------------");
        String str10=" iot proooogram";
        String str11=str10;
        int idx=0;
        int base=0;
        while(idx!=-1){
            idx=str10.indexOf('o');
            if(idx!=-1){
                base=base+idx;
                System.out.println(idx+" "+base);
                str10=str10.substring(idx+1);
                base++;
                System.out.println(str11);
                System.out.println(str10);
            }
        }
//        char[] str12={' ','i','o','t',' ','p','r','o','o','o','o','g','r','a','m'};
//        for(int i=0;i<str12.length;i++){
//            System.out.println("str10["+i+"]= '"+str12[i]+"'");
//        }






//        Integer obj_k=Integer.valueOf(100);
//        int k=obj_k.intValue();
//        Integer k100=Integer.valueOf(k);
//        obj_k.getClass();
    }
}