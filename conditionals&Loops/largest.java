import java.util.Scanner;
public class largest{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=in.nextInt();
        System.out.print("Enter the second number: ");
        int b=in.nextInt();
        System.out.print("Enter the third number: ");
        int c=in.nextInt();
        //Q: Find the largest pf 3 numbers
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println("The largest number is: " + max);
        System.out.println("The largest number is: " + Math.max(a, Math.max(b, c)));

    }
}