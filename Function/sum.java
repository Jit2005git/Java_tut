import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        
    
    int ans = sum3(5, 10);
    System.out.println("The sum is: " + ans);
       
    }
//pass the value of numbers when you nare calling the function in main
static int sum3(int num1, int num2){
        int sum=num1+num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1=in.nextInt();
        System.out.println("Enter second number :");
        int num2=in.nextInt();
        System.out.println("The sum is: " + sum3(num1, num2));

    }

}
