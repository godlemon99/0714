public class CardMain {
    public static void main(String[] args) {

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        System.out.println(Card.width);
        Card.width=10;
        Card.height=25;
        System.out.println(Card.width);

        Card c=new Card();
        c.kind="heart";
        c.number=7;
        c.width=50;
        c.height=80;
        c.print();
        System.out.println(Card.width);

        Card c2=new Card();
        c2.kind="spade";
        c2.number=4;
        c2.width=60;
        c2.height=90;
        c2.print();
        System.out.println(c.width);
        //width 변수에 static 을 사용해서
        //c.width 와 c2.width 와 Card.width 모두 같은 값이 나온다.
    }
}

class Card{
    static int width=100;
    static int height=250;
    String kind;
    int number;
    void print(){
        System.out.println(width+"\t"+height+"\t"+kind+"\t"+number);
    }
}