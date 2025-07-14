public class Main {
    public static void main(String[] args) {
        Shape s=new Shape();
        System.out.println(s.p);
        Point poi=s.p;
        poi.x=10;
        poi.y=20;
        s.draw();

    }
}