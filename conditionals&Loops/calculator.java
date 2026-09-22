import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter an operator (+, -, *, /) :");
        char op = in.next().trim().charAt(0);
        if(op=='+'){
            System.out.println("The sum is: " + (a+b));
        }
        else if(op=='-'){
            System.out.println("The difference is: " + (a-b));
        }
        else if(op=='*'){
            System.out.println("The product is: " + (a*b));
        }
        else if(op=='/'){
            if(b==0){
                System.out.println("Division by zero is not allowed");
            }
            else{
                System.out.println("The quotient is: " + (a/b));
            }
        }
        else{
            System.out.println("Invalid operator");
        }
        
    }
}
