import java.util.*;
public class transpose {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int j =0;j<arr[0].length;j++){
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
