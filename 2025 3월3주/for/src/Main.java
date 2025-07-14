public class Main {
    public static void main(String[] args) {

        int a = 10;
        int i;
        int j;

        for(i=0;i<3;i++){
            System.out.println("i = "+i);
            System.out.println(a++);
        }

        a=10;
        for(i=0;i<3;i++){
            System.out.println("i = "+i);
            System.out.println(++a);
        }

        for(i=0; i<20; i++){
            System.out.println("둘리"+(i+1));
        }

        for(i=0;i<5;i++){
            System.out.println("뚤리"+(4*i+1));
            System.out.println("뚤리"+(4*i+2));
            System.out.println("뚤리"+(4*i+3));
            System.out.println("뚤리"+(4*i+4));
        }

        for(i=0;i<5;i++){
            for(j=0;j<4;j++){
                System.out.println("듈리"+((4*i)+(j+1)));
            }
        }

        for(i=10;i<=100;i+=20){
            System.out.println("i= "+i);
            for(j=0;j<2;j++){
                for(int k=0;k<5;k++){
                    System.out.print("\t또치");
                }
            }
        }

        System.out.println();
        int v;
        for(i=0;i<4;i++){
            for(j=0;j<5;j++) {
                v= i*5+j+1;
                System.out.print(v+"\t");
            }
            System.out.print("\n");
        }

    }
}