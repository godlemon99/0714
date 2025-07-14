package game;

public class Yeesang extends Character{
    Yeesang(){
        name="이상";
        hp=40;
        energy=50;
        printInfoChar();
        printInfo();
    }

    void levelUp() {
        if(level*35<=exp){
            exp-=level*35;
            level++;
            if((level%10==3)||(level%10==6)||(level%10==0)){
                System.out.println("레벨이 "+level+"으로 올랐습니다.");
            }else{
                System.out.println("레벨이 "+level+"로 올랐습니다.");
            }
        }
    }

    void eat(){
        energy+=25;
        printInfo();
    }
    void sleep() {
        energy+=45;
        hp+=7;
        printInfo();
    }

    void play() {
        if(energy >= 25) {
            energy -= 25;
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

    void train() {
        if (energy >= 35) {
            energy-=35;
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
            ran=(int)(Math.random()+2);
            ranExp();
            exp+=ran;
        }
    }

}
