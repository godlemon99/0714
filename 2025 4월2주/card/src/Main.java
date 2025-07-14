public class Main {
    public static void main(String[] args) {
        CreditCard abc=new CreditCard();
        CreditCard abc2=new CreditCard(1,2,3);
        abc2.a=5;
        System.out.println(abc2.add(abc2.a,abc2.b,abc2.c));

        Card xyz=new Card(3,4,5);
        System.out.println(xyz.x+"\t"+xyz.y+"\t"+xyz.z);
    }
}

class CreditCard{
    int a;
    int b;
    int c;

    CreditCard(){

    }
    CreditCard(int _a,int _b,int _c){
        a=_a;
        b=_b;
        c=_c;
    }
    int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    int balance=0;

    void use(int u){
        balance=balance+u;

    }

}

class Card{
    int x;
    int y;
    int z;
    Card(){

    }
    Card(int xx,int yy, int zz){
        x=yy;
        y=zz;
        z=xx;
    }

}