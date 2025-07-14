package my_FileReader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filename="src/test4-2.txt";
        try{
            FileInputStream fis=new FileInputStream(filename);
            int buf;

            FileReader fr = new FileReader(filename);
            FileWriter fw = new FileWriter("tt.txt");

            while((buf= fr.read()) != -1){
                System.out.print((char)buf);
                fw.write(buf);
            }
            fr.close();
            fw.close();

        }catch (IOException e){
            System.out.println("파일이 없습니다.");
        }


    }
}