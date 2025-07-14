public class Main {
    public static void main(String[] args) {
        test t=new test();

        int[] s={15,36,46,56,56,56,45};
        System.out.println(t.sum(s));

        int[] a={40,50,70,50,60,40,60};
        int b=(t.sum(s));
        System.out.println(b);
        System.out.println(t.sum(a));

    }
}

class test{
    int total;
    int sum(int[] a)
    {
        total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        return total;
    }
}