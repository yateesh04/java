import java.util.*;

public class Greeting{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();

        

        System.out.print(" "+ name + "! Welcome");
    }
}