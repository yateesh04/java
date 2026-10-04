import java.util.*;
public class matrixaddition {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][]arr1 = new int[3][3];
        int[][]arr2 = new int[3][3];
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<arr2.length;i++){
            for(int j =0;j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<arr1.length;i++){
            for(int j =0;j<arr1[i].length;j++){
                int add = arr1[i][j] + arr2[i][j];
                 System.out.print(add+" ");
            }
            System.out.println();
    }
        }
    }

