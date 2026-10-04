import java.util.*;
public class reverseeachrow {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i =0;i<arr.length;i++){
        int start = 0;
        int end = arr[i].length-1;
        while(start<end){
            int temp = arr[i][start];
            arr[i][start] = arr[i][end];
            arr[i][end] = temp;
            start++;
            end--;
        }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
