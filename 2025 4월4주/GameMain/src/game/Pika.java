package game;

public class Pika extends Character{
    int[] value={30,70,30,20,50,7,20,30,10,30,10,40};

    Pika(){
        name="피카";
        hp=value[0];
        energy=value[1];
        printInfoChar();
        printInfo();
    }

    void levelUp(){
        if(level*30<=exp){
            exp-=level*30;
            level++;
            if((level%10==3)||(level%10==6)||(level%10==0)){
                System.out.println("레벨이 "+level+"으로 올랐습니다.");
            }else{
                System.out.println("레벨이 "+level+"로 올랐습니다.");
            }

        }
    }

    void eat(){
        energy+=20;
        printInfo();
    }
    void sleep(){
        energy+=50;
        hp+=7;
        printInfo();
    }
    void play(){
        if(energy >= 20) {
            energy -= 20;
            hp -= 3;
            checkHp();
            if (hp > 0) {
                exp += 10;
                levelUp();
            }
            printInfo();
        }
        else { checkEnergy(); }

    }
    void train(){
        if (energy >= 30) {
            energy-=30;
            hp-=10;
            checkHp();
            if(hp > 0) {
                exp+=40;
                levelUp();
            }
            printInfo();
        }
        else { checkEnergy(); }

    }
    void random(){
        for(int i=0;i<5;i++){
            ran=(int)(Math.random()*10)+5;
            ranExp();
            exp+=ran;
        }
    }

}
