import java.util.*;
public class symmetric {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][]arr = new int[3][3];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        boolean symmetric = true;
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j]!=arr[j][i]){
                    symmetric = false;
                    break;
                }
            }
            if(!symmetric){
                break;
            }
        }
        if(symmetric){
            System.out.print("Symmetric");
        }else{
            System.out.print("Not a Symmetric");
        }
    }
}
