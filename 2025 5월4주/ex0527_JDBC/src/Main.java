import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String DB_NAME="person";
        String url="jdbc:mariadb://localhost:3306/"+DB_NAME;
        String userName="root";
        String password="iotiot";
        Connection connection=null;

        ArrayList<Person> list=new ArrayList<>();

        try{
            connection= DriverManager.getConnection(url,userName,password);
            if(connection!=null){
                System.out.println("person DB에 연결됨");
            }
            else{
                return;
            }

            Statement stmt=connection.createStatement();
            String sql = "select * from person;";
            ResultSet rs=stmt.executeQuery(sql);
            String[] col={"no","name","addr","age"};

            Person p;
            while(rs.next()){
                int _no=rs.getInt(col[0]);
                String _name=rs.getString(col[1]);
                String _addr=rs.getString(col[2]);
                int _age=rs.getInt(col[3]);

                p=new Person(_no, _name, _addr, _age);

                System.out.println(p);
            }

            stmt.close();
            rs.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

class Person{
    int no;
    String name;
    String addr;
    int age;

    Person(){};

    Person(int _no, String _name, String _addr, int _age){
        no=_no;
        name=_name;
        addr=_addr;
        age=_age;
    }
    @Override
    public String toString() {
        return "Person{no="+no+", name='"+name+"', addr='"+addr+"', age="+age+"}";
    }
}