import java.util.*;
public class searchstring {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char target = sc.next().charAt(0);
        boolean found = false;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==target){
                found = true;
            System.out.print("String found at index" + " " + i);
                break;
            }
        }
        
        if(!found){
            System.out.print("String not found");
        }
    }
}
