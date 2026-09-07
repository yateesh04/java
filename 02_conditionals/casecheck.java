import java.util.*;
public class casecheck{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if(ch >='a' && ch<='z'){
            System.out.print("Lower case");
        }else
            {
            System.out.print("Upper case");
        }
    }
}