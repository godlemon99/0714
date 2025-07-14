public class Main {
    public static void main(String[] args) {
        Student[] stu=new Student[10];
        stu[0]=new Student();
        stu[0].name="아이유";
        stu[0].kor=100;
        stu[0].math=100;
        stu[0].eng=100;
        stu[0].total=stu[0].kor+stu[0].math+stu[0].eng;
        stu[0].avg=stu[0].total / 3.0f;
        System.out.println(stu[0].avg);

        stu[1]=new Student();
        stu[1].name="장동건";
        stu[1].kor=90;
        stu[1].math=90;
        stu[1].eng=75;
        stu[1].total=stu[1].kor+stu[1].math+stu[1].eng;
        stu[1].avg=stu[1].total / 3.0f;
        System.out.println(stu[1].avg);

        stu[2]=new Student("현빈",100,90,80);
        System.out.println(stu[2].getTotal(stu[2].kor,stu[2].math,stu[2].eng));
        System.out.println(stu[2].getAvg(stu[2].getTotal(stu[2].kor,stu[2].math,stu[2].eng)));

        stu[2].isCar=true;
        Parent p=new Parent();
        p.isCar=true;
        stu[0].work();
        stu[2].isIsland=true;
        p.isIsland=true;
    }
}

class GrandParent{
    boolean isIsland;
}

class Parent extends GrandParent{
    boolean isCar;
    boolean isHouse;
    void work(){

    }
    void retired(){

    }
}

class Student extends Parent{
    String name; //멤버변수, 필드변수
    int kor;
    int math;
    int eng;
    int total;
    float avg;
    Student() {
        // 파라미터가 없는 생성자
        name="noname";
    }
    Student(int _kor,int _math,int _eng){
        name="noname";
    }
    Student(String _name,int _kor,int _math,int _eng){
        // 파라미터가 4개 있는 생성자
        name=_name;
        kor=_kor;
        math=_math;
        eng=_eng;
        total=getTotal(_kor,_math,_eng);
        avg=getAvg(total);
    }
    //함수 오버로딩 : 인자가 다르면 같은 이름의 함수도 쓸수 있다
    int getTotal(int _kor,int _math,int _eng){
        return _kor+_math+_eng;
    }
    float getAvg(int total){
        return total/3.0f;
    }
    void work(){ //오버라이딩
        // 부모가 가지고 있는 함수를 내입맛에 맞게 재정의
        // 겉모양은 동일해야함, 프로토타입이 같아야함
        // 함수의 body를 제외하고는 손대면 안됨
        System.out.println("일한다");
    }

}

