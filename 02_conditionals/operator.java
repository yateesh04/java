import java.util.*;
public class operator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number :");
        double num2 = sc.nextDouble();

        System.out.print("Enter the operator ( + , - , * , / ) :");
        char op = sc.next().charAt(0);

        double result =0;

        if(op == '+'){
            result = num1 + num2;
        }else if (op == '-') {
            result = num1 - num2;
        }else if (op == '*'){
            result = num1 * num2;
        }else if (op == '/'){
            if(num2 != 0){
                result = num1 /num2;
            }else{
                System.out.print("Divison is allowed with given number");
                return;
            }
        }else{
            System.out.print("Invalid operator.");
            return;
        }
        System.out.print("Result :" + result);

    }
}