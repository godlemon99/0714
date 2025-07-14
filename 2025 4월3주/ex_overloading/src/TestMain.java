public class TestMain {
    public static void main(String[] args) {
        Test t=new Test();
        String st=t.add("3","학년");
        int a=t.add(12,34);
        int b=t.add(33,55,66,77);
        t.add();
        System.out.println(st);
        System.out.println(a);
        System.out.println(b);
        System.out.println(t.add(33,44,55,66));
    }
}

class Test{
    Test(){

    }
    Test(int no1, int no2){
      this(); //Test();
    }


    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    int add(int w,int x,int y,int z){
        return w+x+y+z;
    }
    float add(float x,float y){
        return x+y;
    }
    String add(String x,String y){
        return x+y;
    }
    void add(){
        System.out.println("void");
    }
}