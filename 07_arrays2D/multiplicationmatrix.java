import java.util.*;
public class multiplicationmatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int[3][3];
        for(int i = 0 ; i<arr1.length;i++){
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<arr2.length;i++){
            for(int j =0;j<arr2[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j =0; j<arr2[i].length;j++){
                int sum =0;
        for(int k =0; k<arr1.length;k++){
            sum = sum + arr1[i][k] * arr2[k][j];
        }
        System.out.print(sum +" ");
    }
}
System.out.println();
    }
}