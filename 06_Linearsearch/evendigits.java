import java.util.*;
public class evendigits {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int even = 0;
        for(int i = 0; i<arr.length;i++){
            int num = arr[i];
            int digits = 0;
            while(num>0){
                num = num / 10;
                digits++;
            }
        if(digits % 2 ==0){
            even++;
        }
    }
    System.out.print(even);
}
}
