public class Main {
    public static void main(String[] args) {



        int[] num=new int[500];
        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100)+1;
            System.out.println(num[i]);
        }
    }
}