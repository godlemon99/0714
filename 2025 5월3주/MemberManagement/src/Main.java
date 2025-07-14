
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("++++++++멤버관리 프로그램++++++++");
        System.out.println("++++++++++++++++++++++++++++++");
        Management management=new Management();
        while(management.bEnd==false){
            management.process();
        }
    }
}

class Management extends Member{
    Scanner sc;
    Boolean bEnd=false;
    ArrayList<Member> al=new ArrayList<>();
    Management(){

    }
    void process()
    {
        sc=new Scanner(System.in);
        System.out.println("0.종료 1. 멤버추가 2. 멤버 상세정보 확인 3.수정 4.멤버삭제 5.저장 6.불러오기");
        int menu=sc.nextInt();
        switch(menu){
            case 0:
                bEnd=true;
                System.out.println("프로그램을 종료합니다.");
                break;
            case 1:
                memberAdd();
                break;
            case 2:
                memberView();
                break;
            case 3:
                memberEdit();
                break;
            case 4:
                memberDelete();
                break;
            case 5:
                memberSave();
                break;
            case 6:
                memberLoad();
                break;
            default:
                System.out.println("숫자를 잘못 입력하셨습니다.");
        }
    }

    void memberAdd(){
        sc=new Scanner(System.in);

        System.out.println("번호를 입력하세요");
        setNo(sc.nextInt());
        System.out.println("이름을 입력하세요");
        setName(sc.next());
        System.out.println("주소를 입력하세요");
        setAddress(sc.next());
        Member m=new Member(no, name, address);
        al.add(m);
        System.out.println(m+"멤버가 추가되었습니다.");
    }

    void memberView(){
        System.out.println("1.번호로 찾기 2.이름으로 찾기 3.주소로 찾기 4.전체 목록 보이기 그외 키는 나가기");
        boolean isMatch=false;
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 1:
                System.out.println("찾을 멤버의 번호를 입력하세요");
                int srNo=sc.nextInt();
                for (Member m : al) {
                    if (srNo == m.no) {
                        System.out.println(m + " 멤버를 찾았습니다.");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 번호의 멤버를 찾을 수 없었습니다.");
                }
                break;
            case 2:
                System.out.println("찾을 멤버의 이름를 입력하세요");
                String srName=sc.next();
                for (Member m : al) {
                    if (srName.equals(m.name)) {
                        System.out.println(m + " 멤버를 찾았습니다.");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 이름의 멤버를 찾을 수 없었습니다.");
                }
                break;
            case 3:
                System.out.println("찾을 멤버의 주소를 입력하세요");
                String srAddress=sc.next();
                for (Member m : al) {
                    if (srAddress.equals(m.address)) {
                        System.out.println(m + " 멤버를 찾았습니다.");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 주소의 멤버를 찾을 수 없었습니다.");
                }
                break;
            case 4:
                for(Member m : al){
                    System.out.println("no : "+m.getNo());
                    System.out.println("name : "+m.getName());
                    System.out.println("address : "+m.getAddress());
                }
                break;
        }
    }

    void memberEdit(){
        System.out.println("1.번호로 수정하기 2. 이름으로 수정하기 3.주소로 수정하기 그 외 키는 나가기");
        boolean isMatch=false;
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("찾을 멤버의 번호를 입력하세요");
                int srNo=sc.nextInt();
                for (Member m : al) {
                    if (srNo == m.no) {
                        System.out.println(m+" 멤버를 찾았습니다.");
                        System.out.println("이름을 입력하세요");
                        m.setName(sc.next());
                        System.out.println("주소를 입력하세요");
                        m.setAddress(sc.next());
                        System.out.println(m+ "로 변경되었습니다");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 번호 멤버를 찾을 수 없었습니다.");
                }
                break;
            case 2:
                System.out.println("찾을 멤버의 이름를 입력하세요");
                String srName=sc.next();
                for (Member m : al) {
                    if (srName.equals(m.name)) {
                        System.out.println(m+" 멤버를 찾았습니다.");
                        System.out.println("번호를 입력하세요");
                        m.setNo(sc.nextInt());
                        System.out.println("주소를 입력하세요");
                        m.setAddress(sc.next());
                        System.out.println(m+ "로 변경되었습니다");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 이름 멤버를 찾을 수 없었습니다.");
                }
                break;
            case 3:
                System.out.println("찾을 멤버의 주소를 입력하세요");
                String srAddress=sc.next();
                for (Member m : al) {
                    if (srAddress.equals(m.address)) {
                        System.out.println(m+" 멤버를 찾았습니다.");
                        System.out.println("번호을 입력하세요");
                        m.setNo(sc.nextInt());
                        System.out.println("이름를 입력하세요");
                        m.setName(sc.next());
                        System.out.println(m+ "로 변경되었습니다");
                        isMatch=true;
                    }
                }
                if(isMatch==false){
                    System.out.println("해당 주소 멤버를 찾을 수 없었습니다.");
                }
                break;
        }
    }

    void memberDelete(){
        System.out.println("memberDelete()");
    }

    void memberSave(){
        try{
            FileOutputStream fos = new FileOutputStream("src/MemberList.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(al);
            System.out.println("현재 데이터가 저장되었습니다.");
            oos.close();
            fos.close();
        }catch (IOException e){
            System.out.println("예기치 못한 오류로 저장이 되지 않았습니다.");
        }
    }

    void memberLoad(){

    }
}
class Member{
    int no;
    String name;
    String address;

    Member(){

    }

    Member(int no,String name,String address){
        this.no=no;
        this.name=name;
        this.address=address;
    }

    void setNo(int no){
        this.no=no;
    }

    int getNo(){
        return no;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        String str = "";
        str=str+no+" / "+name+" / "+address+" ";
        return str;
    }
}

