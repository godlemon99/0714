package checked;

import java.io.IOException;

public class MyCheck {
    public static void main(String[] args) throws IOException{ //예외를 던짐
//        try{
//            int a=System.in.read();
//            System.out.println(a);
//        }
//        catch(IOException e){
//
//        }
        System.out.println("문자 입력");
        int ch=System.in.read();
        System.out.println(ch);

    }
}
