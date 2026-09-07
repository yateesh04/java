import java.util.*;
public class scal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number :");
        double num2 = sc.nextDouble();

        System.out.println("Operators :");
         System.out.println("1.Addition");
          System.out.println("2.Subtraction");
           System.out.println("3.Multiplicaton");
            System.out.println("4.Division");

             System.out.println("choice operator :");
             int choice = sc.nextInt();
             if(choice == 1){
                System.out.println("Addition :"+(num1+num2));
             }else if(choice == 2){
                 System.out.println("Subtraction :"+(num1-num2));
             }else if(choice == 3){
                 System.out.println("Multiplication :"+(num1*num2));
             }else if(choice == 4){
                if(num2!=0){
                     System.out.println("Division :"+(num1/num2));
                }else{
                     System.out.println("Invalid number.");
                }
             }
              else{
                 System.out.println("Invalid choice .");
              }
            
    }
}