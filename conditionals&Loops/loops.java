import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
//         for (int i = 0; i < 10; i += 2) {
//             System.out.println("The value of i is: " + i);
//         }




//print number from 1 to n
Scanner in = new Scanner(System.in);
System.out.println("Enter a number: ");
int n=in.nextInt();

printNumbers(n);

    }
    static void printNumbers(int n){
for (int i=1;i<=n;i++){
    System.out.println("The value of i is: " + i);
     
}

    }
}