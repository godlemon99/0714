package game;

public abstract class Character{
    String name;
    int hp;
    int level=1;
    int energy;
    int exp=0;
    int ran;
    boolean gameOver;

    abstract void eat();
    abstract void sleep();
    abstract void play();
    abstract void train();
    abstract void levelUp();
    abstract void random();

    public void printInfoChar(){
        System.out.println(name+" 캐릭터가 생성되었습니다.");
    }

    public void printInfo(){
        System.out.println("========현재 "+name+" 캐릭터의 정보========");
        System.out.println("hp : "+hp+"\tlevel : "+level);
        System.out.println("energy : "+energy+"\texp : "+exp);
        System.out.println("====================================");
    }
    void checkHp(){
        if(hp<=0){
            System.out.println("게임 오버");
            gameOver=true;
        }
    }
    void checkEnergy(){
        System.out.println("에너지가 모자랍니다.");
    }

    void ranExp(){
        System.out.println(ran+" 경험치를 획득했습니다.");
    }
}