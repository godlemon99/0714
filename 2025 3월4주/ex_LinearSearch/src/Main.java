import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array={100,200,300};
        int key=200;
        boolean ret=false;
        for(int i=0;i<array.length;i++){
            if(array[i] == key){
                System.out.println("우리 회원임");
                ret=true;
                break;
            }
        }
        if(ret==true){
            System.out.println("우리 회원찾음");
        }else{
            System.out.println("우리 회원못찾음");
        }

        int[] arr1={0,1,2};
        int[] arr2=new int[3];
        arr2=arr1;
        arr1[2]=10; //등호보다 뒤에서 한 배열만 값을 변경했는데 두 배열의 값이 동일함
        for(int i=0;i<3;i++){
            System.out.println(arr1[i]+"\t"+arr2[i]);
        }

        int[][] arrr=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arrr[i][j]=3*i+1+j;
                System.out.print("arr["+i+"]["+j+"]="+arrr[i][j]+"\t");
            }
            System.out.print("\n");
        }

        int[][] arr3 ={
                {10,20,30},
                {40,50},
                {60,70,80,90,100},
                {70,80}
        };
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.print("\n");
        }


        String[] member={"김ㅇㅇ","고ㅇㅇ","강ㅇㅇ","나ㅇㅇ","도ㅇㅇ","박ㅇㅇ","배ㅇㅇ","맛좋은 라면"};
        boolean bflag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("이름을 입력하세요. 회원인지 판단합니다.");
        String check=sc.nextLine();
        System.out.println(check);
        for(int i=0;i<member.length;i++){
            if(check.equals(member[i])){
                bflag=true;
                break;
            }
        }

        if(bflag==true) {
            System.out.println("회원이 맞습니다.");
        }else{
            System.out.println("회원이 아닙니다.");
        }
    }
}