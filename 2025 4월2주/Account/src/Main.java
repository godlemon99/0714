public class Main {
    public static void main(String[] args) {
        Account[] a=new Account[4];
        a[0]=new Account("고길동","111-2222-33",6750000);
        a[1]=new Account();
        a[2]=new Account();
        a[3]=new Account();

        a[1].name="둘리";
        a[1].no="452-6414-12";
        a[1].balance=400000;

        a[2].setName("또치");
        a[2].setNo("562-6622-92");
        a[2].setBalance(150000);

        a[3].setName("희동");
        a[3].setNo("766-3312-32");
        a[3].setBalance(40000);
        String[] str=new String[a.length];
        String[] str2=new String[a.length];
        long[] lo=new long[a.length];

        for(int i=0;i<a.length;i++){
            str[i]=a[i].getName();
            str2[i]=a[i].getNo();
            lo[i]=a[i].getBalance();
            a[i].print();
        }
    }
}

class Account{
    String name, no; //멤버변수
    long balance; //멤버변수

    String getName(){
        return name;
    }
    void setName(String _name){
        name=_name;
    }
    String getNo(){ //no의 값을 읽는 메소드
        return no;
    }
    void setNo(String _no){ //no의 값을 설정하는 메소드
        no=_no;
    }
    long getBalance(){
        return balance;
    }
    void setBalance(long _balance){
        balance=_balance;
    }
    Account(){}
    //인자가 포함된 것을 한번이라도 사용한다면 default 생성자가 동작하지 않으므로
    //default 생성자는 적는 편이 좋다
    Account(String _name,String _no,long _balance){
        name=_name;
        no=_no;
        balance=_balance;
    }
    void print(){
        System.out.println(name+"\t"+no+"\t"+balance);
    }
}