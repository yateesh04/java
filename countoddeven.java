import java.util.*;
public class countoddeven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int even = 0;
        int odd = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = 0 ; j<arr[i].length;j++){
                if(arr[i][j]%2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
