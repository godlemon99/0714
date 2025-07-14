import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}

class Member{
    int no;
    String name;
    String address;

}

class Management{
    void process()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.멤버추가 2. 멤버삭제");
        int menu=sc.nextInt();
    }
}