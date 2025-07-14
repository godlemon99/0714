import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("점수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println('A');
        } else if (score <= 89 && score >= 80) {
            System.out.println('B');
        } else if (score <= 79 && score >= 70) {
            System.out.println('C');
        } else if (score <= 69 && score >= 60) {
            System.out.println('D');
        } else if (score <= 59 && score >= 0) {
            System.out.println('F');
        } else {
            System.out.println("점수를 잘못 입력했어요");
        }

        int div2 = score/101;
        int div3 = score/60;
        int div4 = score/10;
        System.out.println(div2);
        System.out.println(div3);
        System.out.println(div4);
        switch(div2) {
            case 1:
                System.out.println("점수를 100점 이상 입력");
                break;
            case 0:
                switch (div3) {
                    case 1:
                        switch (div4) {
                            case 10: case 9:
                                System.out.println('A');
                                break;
                            case 8:
                                System.out.println('B');
                                break;
                            case 7:
                                System.out.println('C');
                                break;
                            case 6:
                                System.out.println('D');
                                break;
                        }
                        break;
                    case 0:
                        System.out.println('F');
                        break;
                }
                break;
        }

        /*System.out.println("점수를 입력하세요");
        int score2 = sc.nextInt();
        int div = score2/60;
        switch(div) {
            case 1:
                System.out.println("합격");
            case 0:
                System.out.println("불합격");
            default:
                System.out.println("점수 잘못입력");
        } */
    }
}