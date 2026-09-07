import java.util.*;
public class duplicatearray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            boolean alreadychecked =false;
            for(int k=0 ;k<i;k++){
                if(arr[i]==arr[k]){
                    alreadychecked = true;
                    break;
                }
            }
            if(alreadychecked){
                continue;
            }
            int count = 0;

            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i] +" ");
            }

            }
        }
    }