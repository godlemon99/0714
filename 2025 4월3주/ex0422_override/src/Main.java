public class Main {
    public static void main(String[] args) {

        Parent P=new Parent();
        Child C=new Child();

    }
}

class Parent
{
    protected String name;
    public void printInfo()
    {
        System.out.println(name);
    }
    boolean makeObject(String str){
        boolean bRet=false;
        return bRet;
    }
}

class Child extends Parent
{
    private String hobby;
    public void printInfo()
    {
        System.out.println(hobby);
    }
    boolean makeObject(String str){
        boolean bRet=false;
        return !bRet;
    }
}
