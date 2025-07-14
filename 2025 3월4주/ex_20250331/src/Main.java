public class Main {
    public static void main(String[] args) {
        int i=5, j=2, k, result;
        k=sub(i,j);
        i=100;
        j=1;
        result=sub(i,j);
        System.out.println("k="+k);
        System.out.println("result="+result);
        result=pow(3,4);
        System.out.println("result="+result);

        star(0);
        star(1);
        star(2);

    }

    static int sub(int i,int j){
        return i-j;
    }

    static int pow(int i, int j){
        int result=1;
        for (int a=0;a<j;a++){
            result=result*i;
        }
        return result;
    }

    static void star(int a){
        int[] star=new int[10];
        System.out.println("-------------------------");
        if(a==0){
            for (int i = 0; i < 10; i++) {
                System.out.print(star[i] + "\t");
            }
        }else {
            for (int i = 0; i < 10; i++) {
                star[i] = a + i;
                System.out.print(star[i] + "\t");
            }
        }
        System.out.println();
    }
}