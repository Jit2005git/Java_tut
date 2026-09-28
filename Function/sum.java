import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1=in.nextInt();
        System.out.println("Enter second number :");
        int num2=in.nextInt();
        System.out.println("The sum is: " + (num1+num2));
    }

}
