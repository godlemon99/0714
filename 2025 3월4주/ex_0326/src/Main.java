public class Main {
    public static void main(String[] args){

        char[] ch={'A','B'};
        char temp;

        temp=ch[0];
        ch[0]=ch[1];
        ch[1]=temp;

        System.out.println(ch[0]+"\t"+ch[1]);
        
    }
}