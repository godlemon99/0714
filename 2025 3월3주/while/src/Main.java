public class Main{
    public static void main(String[] args){
        int i=1;
        while(i<30){
            System.out.println(i=i+3);
        }
        System.out.println("while문의 밖"+i);

        int j=0;
        do{
            System.out.println(j++);
        }while(j<4);

        i=0;
        while(true){
            System.out.println("A");
            i++;
            if (i==5) break;
        }
        i=0;
        for ( ; ; ){
            i++;
            System.out.println(i);
            if(i==2){
                break;
            }
        }
    }
}