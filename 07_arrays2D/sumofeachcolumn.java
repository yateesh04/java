import java.util.*;
public class sumofeachcolumn {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j =0 ; j<arr[0].length;j++){
            int sum = 0;
            for(int i = 0 ; i<arr.length;i++){
                sum = sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
