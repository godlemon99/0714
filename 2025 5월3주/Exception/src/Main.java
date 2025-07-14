public class Main {
    public static void main(String[] args) {

        int[] array=new int[4];
        int temp = 0;

        try
        {
            for(int i=0;i<6;i++)
            {
                //array=i; //compile 에러, 작성자가 컴파일이 되도록 수정해서 동작시킴으로써 해결됨
                array[i]=i; //runtime 에러, exception 처리에 의해 프로그램을 어떻게든 동작할수 있게함
            }
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            for(int i=0;i<array.length;i++) {
                array[i] = i;
            }
        }
        for (int i : array) {
            System.out.println(array[i]);
        }

        try{
            temp=4/0;
        }
        catch(ArithmeticException e){
            temp=4/1; // 0으로 나눈경우 발생하는 에러는 1로 나누어 에러가 발생하지 않도록 함
        }
        catch(Exception e){

        }
        System.out.println("temp = "+temp);


    }
}