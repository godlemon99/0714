public class UpCastingMain {
    public static void main(String[] args) {
        System.out.println("UpcastingParent의 객체");
        UpCastingParent up=new UpCastingParent();
        System.out.println("up.add()="+up.add());

        System.out.println("UpcastingChild의 객체");
        UpCastingChild uc=new UpCastingChild();
        System.out.println("uc.add()="+uc.add());
    }
}

class UpCastingParent
{
    int x;
    int y;
    public int add()
    {
        System.out.println("parent의 add()");
        return x+y;
    }

}

class UpCastingChild extends UpCastingParent
{
    private int z;

    public UpCastingChild()
    {
        x=100;
        y=200;
        z=300;
    }

    public int add()
    {
        System.out.println("child의 add()");
        return x+y+z;
    }

    public int sub()
    {
        System.out.println("child의 sub()");
        return x-y-z;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z=z;
    }

}