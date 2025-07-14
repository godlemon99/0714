import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] math=new int[5];
        for(int i=0;i<math.length;i++){
            System.out.println(i+1+"번째 학생의 점수를 입력하세요");
            math[i]=sc.nextInt();
        }
        int max=math[0], min=math[0], max_idx=0, min_idx=0;
        for(int i=1;i<math.length;i++){
            if(max<math[i]) {
                max = math[i];
                max_idx = i;
            }
            if (min>math[i]) {
                min = math[i];
                min_idx = i;
            }
        }
        System.out.println("가장 높은 점수는 "+(max_idx+1)+"번째 학생의 "+max);
        System.out.println("가장 낮은 점수는 "+(min_idx+1)+"번째 학생의 "+min);
    }
}