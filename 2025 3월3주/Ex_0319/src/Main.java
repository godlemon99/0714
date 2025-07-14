import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i=1;
        int j;
        int sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("1~"+(i-1)+"까지의 합");
        System.out.println("sum= "+sum);

        int v=1;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                if(v%2==1){
                    System.out.print(v+"\t");
                }
                v++;
            }
            System.out.println();
        }

        System.out.println("구하고 싶은 구구단 단수를 입력");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(i=1;i<=9;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }

        sum=0;
        for(i=0;i<100;i++){
            sum+=i;
            if(sum>100){
                break;
            }
        }
        System.out.println("합이 100을 넘을 때 최소의 정수값 : "+i);
        System.out.println("그때까지의 합 : "+sum);

        sum=0;
        int sum2=0;
        for(i=1;i<=100;i++){
            sum+=i;
            sum2+=sum;
        }
        System.out.println(sum2);

        System.out.println("약수를 구하고 싶은 정수를 입력하세요");
        int b=sc.nextInt();
        System.out.println(b+"의 약수");
        for(i=1;i<=b;i++){
            if(b%i==0) {
                System.out.print(i+"\t");
            }
        }

        System.out.print("\n\n");

        for(i=2;i<=9;i++){
            for(j=2;j<=9;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.print("\n");
        }

        System.out.println();

        sum=0;
        for(i=1;i<=100;i++) {
            sum+=i*i;
        }
        System.out.println(sum);

        System.out.println("1~10까지의 숫자를 입력하세요. 0을 입력하면 종료합니다.");
        i=0;

        while(true){
            int c=sc.nextInt();
            if(c>=1&&c<=10){
                i++;
            }
            if(c==0){
                break;
            }
        }
        System.out.println(i+"번 입력하셨습니다.");

        for(i=1;i<=6;i++){
            for(j=1;j<=6;j++){
                if((i+j)==6){
                    System.out.println("주사위 "+i+"와 주사위 "+j+"의 합은 6입니다.");
                }
            }
        }

        System.out.println("주사위의 눈의 합을 입력하세요");
        int c=sc.nextInt();
        int k;
        for(i=1;i<=6;i++){
            for(j=1;j<=6;j++){
                for(k=1;k<=6;k++){
                    if((i+j+k)==c){
                        System.out.println("주사위 "+i+"와 주사위 "+j+"와 주사위 "+k+"의 합은 "+c+"입니다.");
                    }
                }
            }
        }
    }
}