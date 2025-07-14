public class SingleTestMain {
    public static void main(String[] args) {
//        SingleTest t=new SingleTest();
        SingleTest t=SingleTest.getSingleTest();
        t.print();
        t.setX(40);
        t.setY(55);
        System.out.println("x = "+t.getX());
        System.out.println("y = "+t.getY());
    }
}

