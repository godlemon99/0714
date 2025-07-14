import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("src/c.txt");
        int buf;
        System.out.println("바이트 단위로 읽었을 때");

        while((buf=fis.read()) != -1) { // 파일의 끝을 만날 때까지 스트림에서
                                        // 문자 하나씩 읽어 변수 buf에 저장
            System.out.print((char) buf);
        }
        fis.close();

        FileReader fr = new FileReader("src/c.txt");
        FileWriter fw = new FileWriter("src/d.txt");
        
        System.out.println();
        System.out.println("문자 단위(2바이트)로 읽었을 때");

        while((buf= fr.read()) != -1){
            System.out.print((char)buf);
            fw.write(buf);
        }
        fr.close();
        fw.close();
    }
}