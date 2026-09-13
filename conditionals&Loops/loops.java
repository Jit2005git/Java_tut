import java.util.Scanner;
public class loops{
    public static void main(String[] args) {
//         for (int i = 0; i < 10; i += 2) {
//             System.out.println("The value of i is: " + i);
//         }




//print number from 1 to n
Scanner in = new Scanner(System.in);
int n=in.nextInt();
System.out.println("The value of n is: " + n);
printNumbers(n);

    }
    static void printNumbers(int n){
for (int i=1;i<=n;i++){
    System.out.println("The value of i is: " + i);
     
}

    }
}