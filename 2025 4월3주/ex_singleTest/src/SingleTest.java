class SingleTest {
    private static SingleTest s = new SingleTest();
    private int x;
    private int y;

    private SingleTest(){
        x=10;
        y=20;
    }

    static SingleTest getSingleTest() {
        return s;
    }

    int getX(){
        return x;
    }

    void setX(int x){
        this.x=x;
    }

    int getY(){
        return y;
    }

    void setY(int y){
        this.y=y;
    }
    void print(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
