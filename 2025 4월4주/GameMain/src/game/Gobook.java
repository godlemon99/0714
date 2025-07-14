package game;

public class Gobook extends Character{
    Gobook() {
        name="꼬북";
        hp=45;
        energy=55;
        printInfoChar();
        printInfo();
    }

    void levelUp(){
        if(level*40<=exp){
            exp-=level*40;
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
        hp+=6;
        printInfo();
    }

    void play(){
        if(energy >= 30) {
            energy -= 30;
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
        if (energy >= 40) {
            energy-=40;
            hp-=11;
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
