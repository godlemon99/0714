package db;

public class DBCreate extends db.object.test2{
    void print(){
        db.object.test2 t2=new db.object.test2();
        t2.a=20;
        //t2.b=21; 다른 패키지인데 상속관계가 없어 사용불가능
        //t2.c=22; 다른 패키지라 사용불가능

        //test2_sub은 public 클래스가 아니므로 오류
        //db.object.test2_sub t2_sub=new db.object.test2_sub();

        DBCreate db=new DBCreate();
        db.a=30;
        db.b=33; //다른 패키지에 상속관계가 있어 사용가능

        DBCreate2 otherDB=new DBCreate2();
        //otherDB.b=44;
    }


}