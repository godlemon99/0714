//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;

        /* char[] b;
        b=new char[5];
        b[0]='b';
        b[1]='u';
        b[2]='k';
        b[3]='b';
        b[4]='u';

        for(i=0;i<=4;i++){
            System.out.print(b[i]);
        }
        System.out.println();

        System.out.print(b[0]+b[1]+b[2]+b[3]+b[4]); //이렇게 호출하면 안됨
        System.out.println();

        boolean[] c;
        c=new boolean[4];
        c[0]=true;
        c[1]=false;
        c[2]=false;
        c[3]=false;
        for(i=0;i<=3;i++){
            System.out.println(c[i]);
        }
        b= new char[]{'b', 'u', 'k', ' ', 'b', 'u'};
        for(i=0;i<6;i++){
            System.out.print(b[i]);
        }
        System.out.println();

        int[] num={0,10,20,30,40};
        for(i=0;i<5;i++){
            System.out.println(num[i]);
        }

        int[] score=new int[5];
        for(i=0;i<5;i++){
            score[i]=10*i;
            System.out.println(score[i]);
        }

        Scanner sc=new Scanner(System.in);
        int[] score2=new int[5];
        int total = 0;
        for(i=0;i<5;i++){
            System.out.println(i+1+"번째 학생의 수학 점수를 입력하세요");
            score2[i]=sc.nextInt();
        }
        for(i=0;i<5;i++) {
            System.out.println(score2[i]);
            total=total+score2[i];
        }
        float avg=total/5.0f;
        System.out.println(avg); */

        int[] a1=new int[100];
        int sum=0;
        for(i=0;i<100;i++){
            a1[i]=i+1;
            sum+=a1[i];
        }
        System.out.println(sum);

        int[] a2={5,15,25,35,45};
        int sum2=0;
        float avg2;
        for(i=0;i<5;i++){
            sum2+=a2[i];
        }
        avg2=sum2/5.0f;
        System.out.println(avg2);

        int[] numbe=new int[6];
        for(i=0;i<6;i++){
            numbe[i]=2*i+1;
            System.out.println("numbe["+i+"] = "+numbe[i]+";");
        }

        int[] nu=new int[6];
        for(i=0;i<6;i++){
            nu[i]=10*(i+1);
            System.out.println("nu["+i+"] = "+nu[i]+";");
        }

        int[] n=new int[10];
        for(i=1;i<10;i=i+2){
            n[i]=i*i;
            System.out.println("n["+i+"] = "+n[i]+";");
        }

        /*String[] str=new String[5];
        str[0]="abc";
        str[1]=1+"학년";
        str[2]=num[4]+"";
        str[3]="12345";
        str[4]="a";
        for(i=0;i<5;i++){
            System.out.println(str[i]);
        }*/
    }
}