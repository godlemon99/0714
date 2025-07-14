public class Main {
    public static void main(String[] args) {
        Buyer b=new Buyer();
        Product[] p=new Product[4];
        p[0]=new TV();//Product t=new TV(); 업캐스팅
        p[1]=new PC();
        p[2]=new Refrigerator();
        p[3]=new AirConditioner();
        b.print();
        b.buy(p[0],3);
        b.print();
        b.buy(p[1],4);
        b.print();
        b.buy(p[2],2);
        b.print();
        b.buy(p[3],2);
        b.print();
        p[3].print();
    }
}

class Product
{
    int price;
    int bonusPoint;
    void print(){
        System.out.println("------------------------");
    }
}

class Buyer
{
    int money=4000;
    int bonusPoint=0;
    void buy(Product p,int num){
        money=money-p.price*num;
        bonusPoint=bonusPoint+p.bonusPoint*num/2;
        System.out.println(p);
    }
//    void buy(TV t, int num)
//    {
//        money=money-t.price*num;
//        bonusPoint=bonusPoint+t.bonusPoint*num/2;
//        System.out.println("TV를 "+num+"개 구매");
//    }
//    void buy(PC p,int num)
//    {
//        money=money-p.price*num;
//        bonusPoint=bonusPoint+p.bonusPoint*num/2;
//        System.out.println("PC를 "+num+"개 구매");
//    }
//    void buy(Refrigerator r,int num)
//    {
//        money=money-r.price*num;
//        bonusPoint=bonusPoint+r.bonusPoint*num/2;
//        System.out.println("냉장고를 "+num+"개 구매");
//    }
//    void buy(AirConditioner a,int num)
//    {
//        money=money-a.price*num;
//        bonusPoint=bonusPoint+a.bonusPoint*num/2;
//        System.out.println("에어컨을 "+num+"개 구매");
//    }
    void print(){
        System.out.println("현재 money: "+money+"  bonusPoint: "+bonusPoint);
    }
}

class TV extends Product
{
    int channel;
    int volume;

    TV()
    {
        price=100;
        bonusPoint=100;
    }
    void print(){
        System.out.println("------------------------");
    }

}

class PC extends Product
{
    int cpu;
    int ran;

    PC()
    {
        price=200;
        bonusPoint=200;
    }
}

class Refrigerator extends Product
{
    boolean iceTray;
    int coldAir;

    Refrigerator()
    {
        price=300;
        bonusPoint=300;
    }
}

class AirConditioner extends Product
{
    int a;
    int b;

    AirConditioner()
    {
        price=400;
        bonusPoint=400;
    }
    void print(){
        System.out.println("...");
    }
}