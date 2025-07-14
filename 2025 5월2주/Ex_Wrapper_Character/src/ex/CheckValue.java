package ex;
import java.util.Scanner;

public class CheckValue {
    public static void main(String[] args){
        boolean bflag=true;


        while(bflag){
            Scanner sc=new Scanner(System.in);
            System.out.println("번호 입력");
            int menu=sc.nextInt();
            switch(menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3: // 종료
                    bflag=false;
                    break;
            }
        }
    }
}
