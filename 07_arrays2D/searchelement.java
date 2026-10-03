import java.util.*;
public class searchelement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i =0; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(x==arr[i][j]){
                    System.out.println("x found at row " + i + ", column " + j);
                }
            }
        }
    }
}
