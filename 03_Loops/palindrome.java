import java.util.*;
public class palindrome {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orginal = n;
        int rev= 0;
        while(n>0){
           int rem = n%10;
           rev = rev*10+rem;
           n = n/10;
        }

           if(orginal == rev){
            System.out.print("This is Palindrome");
           }else{
            System.out.print("This is not a palindrome");
           }

        
    }
    
}
