public class Main {
    public static void main(String[] args) {
        Tank t=new Tank();
        Repairable t2=new Tank();
    }
}

interface Repairable{

}

class Tank extends groundUnit implements Repairable{

}

class SCV extends groundUnit implements Repairable{

}

class groundUnit extends unit{

}

class airUnit extends unit{

}

class unit{

}