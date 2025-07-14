
public class Main {
    public static void main(String[] args) {

        int i;
        for(i=1;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i+"\t");
        }

        System.out.println();
        i=0;
        do {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i+"\t");
        }while (i < 10);

        
    }
}