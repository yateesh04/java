import java.util.*;
public class positivenegativecount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] arr= new int[5];
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                positive++;
            }if(arr[i]<0){
                negative++;
            }if(arr[i]==0){
                zero++;
            }

        }
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
    
}
