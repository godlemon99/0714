import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 값을 입력하세요. ex)5, 0, -2");
        int a=sc.nextInt();

        String name = (a<0)?"내이름":"iot";
        System.out.println(name);

        String name2;
        if(a<0){
            name2="내이름";
        }else{
            name2="iot";
        }
        System.out.println(name2);

        String name3;
        if(a>=10 || a==0){
            name3="고길동";
            System.out.println(name3);
        }else{
            name3="둘리";
            System.out.println(name3);
        }

    }
}