public class Member3{
    private String name;
    private String tel;
    private String address;

    // 초기화블록
    {
        name="";
    }

    Member3()
    {
        this("No Name","No Tel","No Address");
    }

    Member3(String name, String tel, String address){
        this.name=name;
        this.tel=tel;
        this.address=address;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setTel(String tel){
        this.tel=tel;
    }
    public String getTel(){
        return tel;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }

    public void print(){
        System.out.println("name :"+name);
        System.out.println("tel :"+tel);
        System.out.println("address :"+address);
    }
}