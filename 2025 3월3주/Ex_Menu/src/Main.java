import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("=============두기의 일기장 ver 2.0===============");
        System.out.println("===============================================");
        System.out.println("===============================================");

        boolean bFlag=true;
        Scanner sc=new Scanner(System.in);

        while(bFlag==true) {
            System.out.println("아래 메뉴를 선택하세요.============================");
            System.out.println("1. 새 문서 2. 수정 3. 삭제 4. 검색 5.종료 ");
            int menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("새 문서");
                    break;
                case 2:
                    System.out.println("수정");
                    break;
                case 3:
                    System.out.println("삭제");
                    break;
                case 4:
                    System.out.println("검색");
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    bFlag=false;
                    break;
                default:
                    System.out.println("잘못된 번호 입력");
            }
        }
    }
}