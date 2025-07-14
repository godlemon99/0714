package game;

import java.util.Scanner;

public class GameMain{
    public static void main(String[] args){
        System.out.println("어떤 캐릭터로 게임을 진행하시겠습니까?");
        System.out.println("1.피카 2.이상 3.고북 ");
        Scanner sc = new Scanner(System.in);
        int select=sc.nextInt();
        switch(select){
            case 1:
                Pika p=new Pika();
                PlayGame pg1=new PlayGame(p);
                pg1.gameStart();
                break;
            case 2:
                Yeesang y=new Yeesang();
                PlayGame pg2=new PlayGame(y);
                pg2.gameStart();
                break;
            case 3:
                Gobook g=new Gobook();
                PlayGame pg3=new PlayGame(g);
                pg3.gameStart();
                break;
            default:
                System.out.println("번호를 다시 입력해주세요");
        }



    }
}

class PlayGame{
    Character character;
    PlayGame(Character character){
        this.character=character;
    }

    void gameStart(){
        while(character.gameOver==false) {
            System.out.println("1. 밥먹이기 2. 재우기 3. 놀아주기 4.훈련하기 5.탐험 6.종료");
            Scanner sc = new Scanner(System.in);
            int menu=sc.nextInt();
            switch (menu) {
                case 1:
                    character.eat();
                    break;
                case 2:
                    character.sleep();
                    break;
                case 3:
                    character.play();
                    break;
                case 4:
                    character.train();
                    break;
                case 5:
                    character.random();
                    break;
                case 6:
                    System.out.println("게임을 종료합니다.");
                    character.printInfo();
                    character.gameOver=true;
                    break;
                default:
                    System.out.println("유효하지 않은 값이 입력되었습니다.");
            }
        }
    }
}