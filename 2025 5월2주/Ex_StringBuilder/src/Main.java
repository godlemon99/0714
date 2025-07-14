import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("하나아아아");
        sb.append(2);
        System.out.println(sb);
        sb.append("삼");
        System.out.println(sb);
        sb.append('四');
        System.out.println(sb);
        sb.insert(3,"침입");
        System.out.println(sb);
        sb.delete(4,7);
        System.out.println(sb);
        System.out.println(sb.reverse());

        String result="111,222,333,444,555";
        String[] str2=result.split(",");
        for(String i : str2){
            System.out.println(i);
        }

        Scanner sc=new Scanner(System.in);

//        System.out.println("문자열 입력");
//        StringBuilder str= new StringBuilder(sc.next());
//        System.out.println("a가 들어갈 자리 입력");
//        int a=sc.nextInt();
//        str.insert(a,"a");
//        System.out.println(str);

        System.out.println("파일명을 입력하세요");
        StringBuilder str3= new StringBuilder(sc.next());
        int idx=str3.indexOf(".");
        System.out.println("파일이름 : "+str3.substring(0,idx));
        System.out.println("확장자 : "+str3.substring(idx+1));

        System.out.println("파일명을 입력하세요");
        String str4=sc.next();
        String[] _str4=str4.split("\\.");
        System.out.println("파일이름 : "+_str4[0]);
        System.out.println("확장자 : "+_str4[1]);

    }
}